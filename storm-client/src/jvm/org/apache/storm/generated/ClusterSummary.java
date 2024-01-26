/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.19.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.19.0)")
public class ClusterSummary implements org.apache.storm.thrift.TBase<ClusterSummary, ClusterSummary._Fields>, java.io.Serializable, Cloneable, Comparable<ClusterSummary> {
  private static final org.apache.storm.thrift.protocol.TStruct STRUCT_DESC = new org.apache.storm.thrift.protocol.TStruct("ClusterSummary");

  private static final org.apache.storm.thrift.protocol.TField SUPERVISORS_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("supervisors", org.apache.storm.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.storm.thrift.protocol.TField TOPOLOGIES_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("topologies", org.apache.storm.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.storm.thrift.protocol.TField NIMBUSES_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("nimbuses", org.apache.storm.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.storm.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ClusterSummaryStandardSchemeFactory();
  private static final org.apache.storm.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ClusterSummaryTupleSchemeFactory();

  private @org.apache.storm.thrift.annotation.Nullable java.util.List<SupervisorSummary> supervisors; // required
  private @org.apache.storm.thrift.annotation.Nullable java.util.List<TopologySummary> topologies; // required
  private @org.apache.storm.thrift.annotation.Nullable java.util.List<NimbusSummary> nimbuses; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.storm.thrift.TFieldIdEnum {
    SUPERVISORS((short)1, "supervisors"),
    TOPOLOGIES((short)3, "topologies"),
    NIMBUSES((short)4, "nimbuses");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SUPERVISORS
          return SUPERVISORS;
        case 3: // TOPOLOGIES
          return TOPOLOGIES;
        case 4: // NIMBUSES
          return NIMBUSES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUPERVISORS, new org.apache.storm.thrift.meta_data.FieldMetaData("supervisors", org.apache.storm.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.storm.thrift.meta_data.ListMetaData(org.apache.storm.thrift.protocol.TType.LIST, 
            new org.apache.storm.thrift.meta_data.StructMetaData(org.apache.storm.thrift.protocol.TType.STRUCT, SupervisorSummary.class))));
    tmpMap.put(_Fields.TOPOLOGIES, new org.apache.storm.thrift.meta_data.FieldMetaData("topologies", org.apache.storm.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.storm.thrift.meta_data.ListMetaData(org.apache.storm.thrift.protocol.TType.LIST, 
            new org.apache.storm.thrift.meta_data.StructMetaData(org.apache.storm.thrift.protocol.TType.STRUCT, TopologySummary.class))));
    tmpMap.put(_Fields.NIMBUSES, new org.apache.storm.thrift.meta_data.FieldMetaData("nimbuses", org.apache.storm.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.storm.thrift.meta_data.ListMetaData(org.apache.storm.thrift.protocol.TType.LIST, 
            new org.apache.storm.thrift.meta_data.StructMetaData(org.apache.storm.thrift.protocol.TType.STRUCT, NimbusSummary.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.storm.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClusterSummary.class, metaDataMap);
  }

  public ClusterSummary() {
  }

  public ClusterSummary(
    java.util.List<SupervisorSummary> supervisors,
    java.util.List<TopologySummary> topologies,
    java.util.List<NimbusSummary> nimbuses)
  {
    this();
    this.supervisors = supervisors;
    this.topologies = topologies;
    this.nimbuses = nimbuses;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClusterSummary(ClusterSummary other) {
    if (other.is_set_supervisors()) {
      java.util.List<SupervisorSummary> __this__supervisors = new java.util.ArrayList<SupervisorSummary>(other.supervisors.size());
      for (SupervisorSummary other_element : other.supervisors) {
        __this__supervisors.add(new SupervisorSummary(other_element));
      }
      this.supervisors = __this__supervisors;
    }
    if (other.is_set_topologies()) {
      java.util.List<TopologySummary> __this__topologies = new java.util.ArrayList<TopologySummary>(other.topologies.size());
      for (TopologySummary other_element : other.topologies) {
        __this__topologies.add(new TopologySummary(other_element));
      }
      this.topologies = __this__topologies;
    }
    if (other.is_set_nimbuses()) {
      java.util.List<NimbusSummary> __this__nimbuses = new java.util.ArrayList<NimbusSummary>(other.nimbuses.size());
      for (NimbusSummary other_element : other.nimbuses) {
        __this__nimbuses.add(new NimbusSummary(other_element));
      }
      this.nimbuses = __this__nimbuses;
    }
  }

  @Override
  public ClusterSummary deepCopy() {
    return new ClusterSummary(this);
  }

  @Override
  public void clear() {
    this.supervisors = null;
    this.topologies = null;
    this.nimbuses = null;
  }

  public int get_supervisors_size() {
    return (this.supervisors == null) ? 0 : this.supervisors.size();
  }

  @org.apache.storm.thrift.annotation.Nullable
  public java.util.Iterator<SupervisorSummary> get_supervisors_iterator() {
    return (this.supervisors == null) ? null : this.supervisors.iterator();
  }

  public void add_to_supervisors(SupervisorSummary elem) {
    if (this.supervisors == null) {
      this.supervisors = new java.util.ArrayList<SupervisorSummary>();
    }
    this.supervisors.add(elem);
  }

  @org.apache.storm.thrift.annotation.Nullable
  public java.util.List<SupervisorSummary> get_supervisors() {
    return this.supervisors;
  }

  public void set_supervisors(@org.apache.storm.thrift.annotation.Nullable java.util.List<SupervisorSummary> supervisors) {
    this.supervisors = supervisors;
  }

  public void unset_supervisors() {
    this.supervisors = null;
  }

  /** Returns true if field supervisors is set (has been assigned a value) and false otherwise */
  public boolean is_set_supervisors() {
    return this.supervisors != null;
  }

  public void set_supervisors_isSet(boolean value) {
    if (!value) {
      this.supervisors = null;
    }
  }

  public int get_topologies_size() {
    return (this.topologies == null) ? 0 : this.topologies.size();
  }

  @org.apache.storm.thrift.annotation.Nullable
  public java.util.Iterator<TopologySummary> get_topologies_iterator() {
    return (this.topologies == null) ? null : this.topologies.iterator();
  }

  public void add_to_topologies(TopologySummary elem) {
    if (this.topologies == null) {
      this.topologies = new java.util.ArrayList<TopologySummary>();
    }
    this.topologies.add(elem);
  }

  @org.apache.storm.thrift.annotation.Nullable
  public java.util.List<TopologySummary> get_topologies() {
    return this.topologies;
  }

  public void set_topologies(@org.apache.storm.thrift.annotation.Nullable java.util.List<TopologySummary> topologies) {
    this.topologies = topologies;
  }

  public void unset_topologies() {
    this.topologies = null;
  }

  /** Returns true if field topologies is set (has been assigned a value) and false otherwise */
  public boolean is_set_topologies() {
    return this.topologies != null;
  }

  public void set_topologies_isSet(boolean value) {
    if (!value) {
      this.topologies = null;
    }
  }

  public int get_nimbuses_size() {
    return (this.nimbuses == null) ? 0 : this.nimbuses.size();
  }

  @org.apache.storm.thrift.annotation.Nullable
  public java.util.Iterator<NimbusSummary> get_nimbuses_iterator() {
    return (this.nimbuses == null) ? null : this.nimbuses.iterator();
  }

  public void add_to_nimbuses(NimbusSummary elem) {
    if (this.nimbuses == null) {
      this.nimbuses = new java.util.ArrayList<NimbusSummary>();
    }
    this.nimbuses.add(elem);
  }

  @org.apache.storm.thrift.annotation.Nullable
  public java.util.List<NimbusSummary> get_nimbuses() {
    return this.nimbuses;
  }

  public void set_nimbuses(@org.apache.storm.thrift.annotation.Nullable java.util.List<NimbusSummary> nimbuses) {
    this.nimbuses = nimbuses;
  }

  public void unset_nimbuses() {
    this.nimbuses = null;
  }

  /** Returns true if field nimbuses is set (has been assigned a value) and false otherwise */
  public boolean is_set_nimbuses() {
    return this.nimbuses != null;
  }

  public void set_nimbuses_isSet(boolean value) {
    if (!value) {
      this.nimbuses = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.storm.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SUPERVISORS:
      if (value == null) {
        unset_supervisors();
      } else {
        set_supervisors((java.util.List<SupervisorSummary>)value);
      }
      break;

    case TOPOLOGIES:
      if (value == null) {
        unset_topologies();
      } else {
        set_topologies((java.util.List<TopologySummary>)value);
      }
      break;

    case NIMBUSES:
      if (value == null) {
        unset_nimbuses();
      } else {
        set_nimbuses((java.util.List<NimbusSummary>)value);
      }
      break;

    }
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SUPERVISORS:
      return get_supervisors();

    case TOPOLOGIES:
      return get_topologies();

    case NIMBUSES:
      return get_nimbuses();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SUPERVISORS:
      return is_set_supervisors();
    case TOPOLOGIES:
      return is_set_topologies();
    case NIMBUSES:
      return is_set_nimbuses();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ClusterSummary)
      return this.equals((ClusterSummary)that);
    return false;
  }

  public boolean equals(ClusterSummary that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_supervisors = true && this.is_set_supervisors();
    boolean that_present_supervisors = true && that.is_set_supervisors();
    if (this_present_supervisors || that_present_supervisors) {
      if (!(this_present_supervisors && that_present_supervisors))
        return false;
      if (!this.supervisors.equals(that.supervisors))
        return false;
    }

    boolean this_present_topologies = true && this.is_set_topologies();
    boolean that_present_topologies = true && that.is_set_topologies();
    if (this_present_topologies || that_present_topologies) {
      if (!(this_present_topologies && that_present_topologies))
        return false;
      if (!this.topologies.equals(that.topologies))
        return false;
    }

    boolean this_present_nimbuses = true && this.is_set_nimbuses();
    boolean that_present_nimbuses = true && that.is_set_nimbuses();
    if (this_present_nimbuses || that_present_nimbuses) {
      if (!(this_present_nimbuses && that_present_nimbuses))
        return false;
      if (!this.nimbuses.equals(that.nimbuses))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_supervisors()) ? 131071 : 524287);
    if (is_set_supervisors())
      hashCode = hashCode * 8191 + supervisors.hashCode();

    hashCode = hashCode * 8191 + ((is_set_topologies()) ? 131071 : 524287);
    if (is_set_topologies())
      hashCode = hashCode * 8191 + topologies.hashCode();

    hashCode = hashCode * 8191 + ((is_set_nimbuses()) ? 131071 : 524287);
    if (is_set_nimbuses())
      hashCode = hashCode * 8191 + nimbuses.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ClusterSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(is_set_supervisors(), other.is_set_supervisors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_supervisors()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.supervisors, other.supervisors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(is_set_topologies(), other.is_set_topologies());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_topologies()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.topologies, other.topologies);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(is_set_nimbuses(), other.is_set_nimbuses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_nimbuses()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.nimbuses, other.nimbuses);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.storm.thrift.protocol.TProtocol iprot) throws org.apache.storm.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.storm.thrift.protocol.TProtocol oprot) throws org.apache.storm.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ClusterSummary(");
    boolean first = true;

    sb.append("supervisors:");
    if (this.supervisors == null) {
      sb.append("null");
    } else {
      sb.append(this.supervisors);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("topologies:");
    if (this.topologies == null) {
      sb.append("null");
    } else {
      sb.append(this.topologies);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nimbuses:");
    if (this.nimbuses == null) {
      sb.append("null");
    } else {
      sb.append(this.nimbuses);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.storm.thrift.TException {
    // check for required fields
    if (!is_set_supervisors()) {
      throw new org.apache.storm.thrift.protocol.TProtocolException("Required field 'supervisors' is unset! Struct:" + toString());
    }

    if (!is_set_topologies()) {
      throw new org.apache.storm.thrift.protocol.TProtocolException("Required field 'topologies' is unset! Struct:" + toString());
    }

    if (!is_set_nimbuses()) {
      throw new org.apache.storm.thrift.protocol.TProtocolException("Required field 'nimbuses' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ClusterSummaryStandardSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public ClusterSummaryStandardScheme getScheme() {
      return new ClusterSummaryStandardScheme();
    }
  }

  private static class ClusterSummaryStandardScheme extends org.apache.storm.thrift.scheme.StandardScheme<ClusterSummary> {

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol iprot, ClusterSummary struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.storm.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUPERVISORS
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.LIST) {
              {
                org.apache.storm.thrift.protocol.TList _list166 = iprot.readListBegin();
                struct.supervisors = new java.util.ArrayList<SupervisorSummary>(_list166.size);
                @org.apache.storm.thrift.annotation.Nullable SupervisorSummary _elem167;
                for (int _i168 = 0; _i168 < _list166.size; ++_i168)
                {
                  _elem167 = new SupervisorSummary();
                  _elem167.read(iprot);
                  struct.supervisors.add(_elem167);
                }
                iprot.readListEnd();
              }
              struct.set_supervisors_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOPOLOGIES
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.LIST) {
              {
                org.apache.storm.thrift.protocol.TList _list169 = iprot.readListBegin();
                struct.topologies = new java.util.ArrayList<TopologySummary>(_list169.size);
                @org.apache.storm.thrift.annotation.Nullable TopologySummary _elem170;
                for (int _i171 = 0; _i171 < _list169.size; ++_i171)
                {
                  _elem170 = new TopologySummary();
                  _elem170.read(iprot);
                  struct.topologies.add(_elem170);
                }
                iprot.readListEnd();
              }
              struct.set_topologies_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NIMBUSES
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.LIST) {
              {
                org.apache.storm.thrift.protocol.TList _list172 = iprot.readListBegin();
                struct.nimbuses = new java.util.ArrayList<NimbusSummary>(_list172.size);
                @org.apache.storm.thrift.annotation.Nullable NimbusSummary _elem173;
                for (int _i174 = 0; _i174 < _list172.size; ++_i174)
                {
                  _elem173 = new NimbusSummary();
                  _elem173.read(iprot);
                  struct.nimbuses.add(_elem173);
                }
                iprot.readListEnd();
              }
              struct.set_nimbuses_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol oprot, ClusterSummary struct) throws org.apache.storm.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.supervisors != null) {
        oprot.writeFieldBegin(SUPERVISORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.storm.thrift.protocol.TList(org.apache.storm.thrift.protocol.TType.STRUCT, struct.supervisors.size()));
          for (SupervisorSummary _iter175 : struct.supervisors)
          {
            _iter175.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.topologies != null) {
        oprot.writeFieldBegin(TOPOLOGIES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.storm.thrift.protocol.TList(org.apache.storm.thrift.protocol.TType.STRUCT, struct.topologies.size()));
          for (TopologySummary _iter176 : struct.topologies)
          {
            _iter176.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.nimbuses != null) {
        oprot.writeFieldBegin(NIMBUSES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.storm.thrift.protocol.TList(org.apache.storm.thrift.protocol.TType.STRUCT, struct.nimbuses.size()));
          for (NimbusSummary _iter177 : struct.nimbuses)
          {
            _iter177.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClusterSummaryTupleSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public ClusterSummaryTupleScheme getScheme() {
      return new ClusterSummaryTupleScheme();
    }
  }

  private static class ClusterSummaryTupleScheme extends org.apache.storm.thrift.scheme.TupleScheme<ClusterSummary> {

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol prot, ClusterSummary struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol oprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.supervisors.size());
        for (SupervisorSummary _iter178 : struct.supervisors)
        {
          _iter178.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.topologies.size());
        for (TopologySummary _iter179 : struct.topologies)
        {
          _iter179.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.nimbuses.size());
        for (NimbusSummary _iter180 : struct.nimbuses)
        {
          _iter180.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol prot, ClusterSummary struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol iprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.storm.thrift.protocol.TList _list181 = iprot.readListBegin(org.apache.storm.thrift.protocol.TType.STRUCT);
        struct.supervisors = new java.util.ArrayList<SupervisorSummary>(_list181.size);
        @org.apache.storm.thrift.annotation.Nullable SupervisorSummary _elem182;
        for (int _i183 = 0; _i183 < _list181.size; ++_i183)
        {
          _elem182 = new SupervisorSummary();
          _elem182.read(iprot);
          struct.supervisors.add(_elem182);
        }
      }
      struct.set_supervisors_isSet(true);
      {
        org.apache.storm.thrift.protocol.TList _list184 = iprot.readListBegin(org.apache.storm.thrift.protocol.TType.STRUCT);
        struct.topologies = new java.util.ArrayList<TopologySummary>(_list184.size);
        @org.apache.storm.thrift.annotation.Nullable TopologySummary _elem185;
        for (int _i186 = 0; _i186 < _list184.size; ++_i186)
        {
          _elem185 = new TopologySummary();
          _elem185.read(iprot);
          struct.topologies.add(_elem185);
        }
      }
      struct.set_topologies_isSet(true);
      {
        org.apache.storm.thrift.protocol.TList _list187 = iprot.readListBegin(org.apache.storm.thrift.protocol.TType.STRUCT);
        struct.nimbuses = new java.util.ArrayList<NimbusSummary>(_list187.size);
        @org.apache.storm.thrift.annotation.Nullable NimbusSummary _elem188;
        for (int _i189 = 0; _i189 < _list187.size; ++_i189)
        {
          _elem188 = new NimbusSummary();
          _elem188.read(iprot);
          struct.nimbuses.add(_elem188);
        }
      }
      struct.set_nimbuses_isSet(true);
    }
  }

  private static <S extends org.apache.storm.thrift.scheme.IScheme> S scheme(org.apache.storm.thrift.protocol.TProtocol proto) {
    return (org.apache.storm.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

