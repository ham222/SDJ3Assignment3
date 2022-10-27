// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services.proto

package via.sdj3.handin3;

/**
 * Protobuf type {@code handin3.AnimalPart}
 */
public final class AnimalPart extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:handin3.AnimalPart)
    AnimalPartOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnimalPart.newBuilder() to construct.
  private AnimalPart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnimalPart() {
    type_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnimalPart();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnimalPart(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 17: {

            weight_ = input.readDouble();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 34: {
            via.sdj3.handin3.Animal.Builder subBuilder = null;
            if (cameFrom_ != null) {
              subBuilder = cameFrom_.toBuilder();
            }
            cameFrom_ = input.readMessage(via.sdj3.handin3.Animal.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cameFrom_);
              cameFrom_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.sdj3.handin3.Services.internal_static_handin3_AnimalPart_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sdj3.handin3.Services.internal_static_handin3_AnimalPart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sdj3.handin3.AnimalPart.class, via.sdj3.handin3.AnimalPart.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int WEIGHT_FIELD_NUMBER = 2;
  private double weight_;
  /**
   * <code>double weight = 2;</code>
   * @return The weight.
   */
  @java.lang.Override
  public double getWeight() {
    return weight_;
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 3;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAMEFROM_FIELD_NUMBER = 4;
  private via.sdj3.handin3.Animal cameFrom_;
  /**
   * <code>.handin3.Animal cameFrom = 4;</code>
   * @return Whether the cameFrom field is set.
   */
  @java.lang.Override
  public boolean hasCameFrom() {
    return cameFrom_ != null;
  }
  /**
   * <code>.handin3.Animal cameFrom = 4;</code>
   * @return The cameFrom.
   */
  @java.lang.Override
  public via.sdj3.handin3.Animal getCameFrom() {
    return cameFrom_ == null ? via.sdj3.handin3.Animal.getDefaultInstance() : cameFrom_;
  }
  /**
   * <code>.handin3.Animal cameFrom = 4;</code>
   */
  @java.lang.Override
  public via.sdj3.handin3.AnimalOrBuilder getCameFromOrBuilder() {
    return getCameFrom();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (java.lang.Double.doubleToRawLongBits(weight_) != 0) {
      output.writeDouble(2, weight_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
    }
    if (cameFrom_ != null) {
      output.writeMessage(4, getCameFrom());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (java.lang.Double.doubleToRawLongBits(weight_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, weight_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
    }
    if (cameFrom_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCameFrom());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.sdj3.handin3.AnimalPart)) {
      return super.equals(obj);
    }
    via.sdj3.handin3.AnimalPart other = (via.sdj3.handin3.AnimalPart) obj;

    if (getId()
        != other.getId()) return false;
    if (java.lang.Double.doubleToLongBits(getWeight())
        != java.lang.Double.doubleToLongBits(
            other.getWeight())) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (hasCameFrom() != other.hasCameFrom()) return false;
    if (hasCameFrom()) {
      if (!getCameFrom()
          .equals(other.getCameFrom())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeight()));
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (hasCameFrom()) {
      hash = (37 * hash) + CAMEFROM_FIELD_NUMBER;
      hash = (53 * hash) + getCameFrom().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sdj3.handin3.AnimalPart parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.handin3.AnimalPart parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.handin3.AnimalPart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.handin3.AnimalPart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.handin3.AnimalPart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.handin3.AnimalPart parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.handin3.AnimalPart parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.handin3.AnimalPart parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.handin3.AnimalPart parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sdj3.handin3.AnimalPart parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.handin3.AnimalPart parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.handin3.AnimalPart parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.sdj3.handin3.AnimalPart prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code handin3.AnimalPart}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:handin3.AnimalPart)
      via.sdj3.handin3.AnimalPartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sdj3.handin3.Services.internal_static_handin3_AnimalPart_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sdj3.handin3.Services.internal_static_handin3_AnimalPart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sdj3.handin3.AnimalPart.class, via.sdj3.handin3.AnimalPart.Builder.class);
    }

    // Construct using via.sdj3.handin3.AnimalPart.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      weight_ = 0D;

      type_ = "";

      if (cameFromBuilder_ == null) {
        cameFrom_ = null;
      } else {
        cameFrom_ = null;
        cameFromBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sdj3.handin3.Services.internal_static_handin3_AnimalPart_descriptor;
    }

    @java.lang.Override
    public via.sdj3.handin3.AnimalPart getDefaultInstanceForType() {
      return via.sdj3.handin3.AnimalPart.getDefaultInstance();
    }

    @java.lang.Override
    public via.sdj3.handin3.AnimalPart build() {
      via.sdj3.handin3.AnimalPart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sdj3.handin3.AnimalPart buildPartial() {
      via.sdj3.handin3.AnimalPart result = new via.sdj3.handin3.AnimalPart(this);
      result.id_ = id_;
      result.weight_ = weight_;
      result.type_ = type_;
      if (cameFromBuilder_ == null) {
        result.cameFrom_ = cameFrom_;
      } else {
        result.cameFrom_ = cameFromBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.sdj3.handin3.AnimalPart) {
        return mergeFrom((via.sdj3.handin3.AnimalPart)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sdj3.handin3.AnimalPart other) {
      if (other == via.sdj3.handin3.AnimalPart.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getWeight() != 0D) {
        setWeight(other.getWeight());
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (other.hasCameFrom()) {
        mergeCameFrom(other.getCameFrom());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.sdj3.handin3.AnimalPart parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sdj3.handin3.AnimalPart) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private double weight_ ;
    /**
     * <code>double weight = 2;</code>
     * @return The weight.
     */
    @java.lang.Override
    public double getWeight() {
      return weight_;
    }
    /**
     * <code>double weight = 2;</code>
     * @param value The weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeight(double value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weight = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeight() {
      
      weight_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 3;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 3;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 3;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private via.sdj3.handin3.Animal cameFrom_;
    private com.google.protobuf.SingleFieldBuilderV3<
        via.sdj3.handin3.Animal, via.sdj3.handin3.Animal.Builder, via.sdj3.handin3.AnimalOrBuilder> cameFromBuilder_;
    /**
     * <code>.handin3.Animal cameFrom = 4;</code>
     * @return Whether the cameFrom field is set.
     */
    public boolean hasCameFrom() {
      return cameFromBuilder_ != null || cameFrom_ != null;
    }
    /**
     * <code>.handin3.Animal cameFrom = 4;</code>
     * @return The cameFrom.
     */
    public via.sdj3.handin3.Animal getCameFrom() {
      if (cameFromBuilder_ == null) {
        return cameFrom_ == null ? via.sdj3.handin3.Animal.getDefaultInstance() : cameFrom_;
      } else {
        return cameFromBuilder_.getMessage();
      }
    }
    /**
     * <code>.handin3.Animal cameFrom = 4;</code>
     */
    public Builder setCameFrom(via.sdj3.handin3.Animal value) {
      if (cameFromBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cameFrom_ = value;
        onChanged();
      } else {
        cameFromBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.handin3.Animal cameFrom = 4;</code>
     */
    public Builder setCameFrom(
        via.sdj3.handin3.Animal.Builder builderForValue) {
      if (cameFromBuilder_ == null) {
        cameFrom_ = builderForValue.build();
        onChanged();
      } else {
        cameFromBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.handin3.Animal cameFrom = 4;</code>
     */
    public Builder mergeCameFrom(via.sdj3.handin3.Animal value) {
      if (cameFromBuilder_ == null) {
        if (cameFrom_ != null) {
          cameFrom_ =
            via.sdj3.handin3.Animal.newBuilder(cameFrom_).mergeFrom(value).buildPartial();
        } else {
          cameFrom_ = value;
        }
        onChanged();
      } else {
        cameFromBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.handin3.Animal cameFrom = 4;</code>
     */
    public Builder clearCameFrom() {
      if (cameFromBuilder_ == null) {
        cameFrom_ = null;
        onChanged();
      } else {
        cameFrom_ = null;
        cameFromBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.handin3.Animal cameFrom = 4;</code>
     */
    public via.sdj3.handin3.Animal.Builder getCameFromBuilder() {
      
      onChanged();
      return getCameFromFieldBuilder().getBuilder();
    }
    /**
     * <code>.handin3.Animal cameFrom = 4;</code>
     */
    public via.sdj3.handin3.AnimalOrBuilder getCameFromOrBuilder() {
      if (cameFromBuilder_ != null) {
        return cameFromBuilder_.getMessageOrBuilder();
      } else {
        return cameFrom_ == null ?
            via.sdj3.handin3.Animal.getDefaultInstance() : cameFrom_;
      }
    }
    /**
     * <code>.handin3.Animal cameFrom = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        via.sdj3.handin3.Animal, via.sdj3.handin3.Animal.Builder, via.sdj3.handin3.AnimalOrBuilder> 
        getCameFromFieldBuilder() {
      if (cameFromBuilder_ == null) {
        cameFromBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            via.sdj3.handin3.Animal, via.sdj3.handin3.Animal.Builder, via.sdj3.handin3.AnimalOrBuilder>(
                getCameFrom(),
                getParentForChildren(),
                isClean());
        cameFrom_ = null;
      }
      return cameFromBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:handin3.AnimalPart)
  }

  // @@protoc_insertion_point(class_scope:handin3.AnimalPart)
  private static final via.sdj3.handin3.AnimalPart DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sdj3.handin3.AnimalPart();
  }

  public static via.sdj3.handin3.AnimalPart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnimalPart>
      PARSER = new com.google.protobuf.AbstractParser<AnimalPart>() {
    @java.lang.Override
    public AnimalPart parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AnimalPart(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnimalPart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnimalPart> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sdj3.handin3.AnimalPart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
