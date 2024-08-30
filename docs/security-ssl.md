---
title: "SSL Setup"
weight: 2
type: docs
aliases:
  - /deployment/security/security-ssl.html
  - /ops/security-ssl.html
---
# SSL Setup

This page provides instructions on how to enable TLS/SSL authentication and encryption for network communication between CLI and Nimbus, and between Nimbus, superviosr and workers.

### Keystores and Truststores

The SSL configuration requires to configure a **keystore** and a **truststore**. The *keystore* contains the public certificate
(public key) and the private key, while the truststore contains the trusted certificates or the trusted authorities. Both stores
need to be set up such that the truststore trusts the keystore's certificate.


### CLI 

The connections use **mutual authentication** (mTLS), meaning Nimbus server and client side of each connection need to present the certificate to each other. The certificate acts effectively as a shared
secret when a dedicated CA is used to exclusively sign an internal cert.

CLI settings:
```yaml
nimbus.thrift.tls.client.keystore.path: ~/tmp/ssl/client.keystore.jks
nimbus.thrift.tls.client.keystore.password: password
nimbus.thrift.tls.client.truststore.path: ~/tmp/ssl/client.truststore.jks
nimbus.thrift.tls.client.truststore.password: password
nimbus.thrift.client.use.tls: true
```
### Nimbus Connectivity
To enable SSL for the Nimbus server, you need to configure the following
server settings:
```yaml
nimbus.thrift.tls.port: 6067
nimbus.thrift.tls.transport: org.apache.storm.security.auth.tls.TlsTransportPlugin
nimbus.thrift.access.log.enabled: true
nimbus.thrift.tls.server.keystore.path: ~/tmp/ssl/server.keystore.jks
nimbus.thrift.tls.server.keystore.password: password
nimbus.thrift.tls.server.truststore.path: ~/tmp/ssl/server.truststore.jks
nimbus.thrift.tls.server.truststore.password: password
nimbus.thrift.tls.server.only: true
x509.cert.principal.to.local.regex: "([a-z_]+).*"
storm.principal.tolocal: org.apache.storm.security.auth.X509CertPrincipalToLocal
```

client settings: This setting will be used when the nimbus connects to the workers or supervisor.
```yaml
nimbus.thrift.tls.client.keystore.path: ~/tmp/ssl/client.keystore.jks
nimbus.thrift.tls.client.keystore.password: password
nimbus.thrift.tls.client.truststore.path: ~/tmp/ssl/client.truststore.jks
nimbus.thrift.tls.client.truststore.password: password
nimbus.thrift.client.use.tls: true
```

### Supervisor Connectivity
To enable SSL for the Supervisor, you need to configure the following. 

server settings:
```yaml
supervisor.thrift.transport: org.apache.storm.security.auth.tls.TlsTransportPlugin
supervisor.thrift.tls.server.keystore.path: ~/tmp/ssl/server.keystore.jks
supervisor.thrift.tls.server.keystore.password: password
supervisor.thrift.tls.server.truststore.path: ~/tmp/ssl/server.truststore.jks
supervisor.thrift.tls.server.truststore.password: password
```
client settings: This setting will be used when the supervisor connects to the workers or nimbus.
```yaml
supervisor.thrift.tls.client.keystore.path: ~/tmp/ssl/client.keystore.jks
supervisor.thrift.tls.client.keystore.password: password
supervisor.thrift.tls.client.truststore.path: ~/tmp/ssl/client.truststore.jks
supervisor.thrift.tls.client.truststore.password: password
supervisor.thrift.client.use.tls: true
```

### Worker Connectivity
To enable SSL for the Worker, you need to configure the following
server settings:
```yaml
storm.messaging.netty.tls.enable: true
storm.messaging.netty.tls.require.open.ssl: true
storm.messaging.netty.tls.keystore.path: ~/tmp/ssl/server.keystore.jks
storm.messaging.netty.tls.keystore.password: password
storm.messaging.netty.tls.truststore.path: ~/tmp/ssl/server.truststore.jks
storm.messaging.netty.tls.truststore.password: password
```
To enable SSL for the client worker, you need to configure the following
client settings: This setting will be used when the worker connects to the supervisor.

```yaml
storm.messaging.netty.tls.client.keystore.path: ~/tmp/ssl/client.keystore.jks
storm.messaging.netty.tls.client.keystore.password: password
storm.messaging.netty.tls.client.truststore.path: ~/tmp/ssl/client.truststore.jks
storm.messaging.netty.tls.client.truststore.password: password
```