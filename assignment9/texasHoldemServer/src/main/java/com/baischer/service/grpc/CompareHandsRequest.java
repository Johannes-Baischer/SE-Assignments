// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: texasHoldemService.proto

package com.baischer.service.grpc;

/**
 * Protobuf type {@code CompareHandsRequest}
 */
public  final class CompareHandsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CompareHandsRequest)
    CompareHandsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompareHandsRequest.newBuilder() to construct.
  private CompareHandsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompareHandsRequest() {
    hand1_ = "";
    hand2_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompareHandsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            hand1_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            hand2_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
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
    return com.baischer.service.grpc.TexasHoldemServiceOuterClass.internal_static_CompareHandsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.baischer.service.grpc.TexasHoldemServiceOuterClass.internal_static_CompareHandsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.baischer.service.grpc.CompareHandsRequest.class, com.baischer.service.grpc.CompareHandsRequest.Builder.class);
  }

  public static final int HAND1_FIELD_NUMBER = 1;
  private volatile java.lang.Object hand1_;
  /**
   * <code>string hand1 = 1;</code>
   */
  public java.lang.String getHand1() {
    java.lang.Object ref = hand1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hand1_ = s;
      return s;
    }
  }
  /**
   * <code>string hand1 = 1;</code>
   */
  public com.google.protobuf.ByteString
      getHand1Bytes() {
    java.lang.Object ref = hand1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hand1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HAND2_FIELD_NUMBER = 2;
  private volatile java.lang.Object hand2_;
  /**
   * <code>string hand2 = 2;</code>
   */
  public java.lang.String getHand2() {
    java.lang.Object ref = hand2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hand2_ = s;
      return s;
    }
  }
  /**
   * <code>string hand2 = 2;</code>
   */
  public com.google.protobuf.ByteString
      getHand2Bytes() {
    java.lang.Object ref = hand2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hand2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getHand1Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hand1_);
    }
    if (!getHand2Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hand2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHand1Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hand1_);
    }
    if (!getHand2Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, hand2_);
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
    if (!(obj instanceof com.baischer.service.grpc.CompareHandsRequest)) {
      return super.equals(obj);
    }
    com.baischer.service.grpc.CompareHandsRequest other = (com.baischer.service.grpc.CompareHandsRequest) obj;

    boolean result = true;
    result = result && getHand1()
        .equals(other.getHand1());
    result = result && getHand2()
        .equals(other.getHand2());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HAND1_FIELD_NUMBER;
    hash = (53 * hash) + getHand1().hashCode();
    hash = (37 * hash) + HAND2_FIELD_NUMBER;
    hash = (53 * hash) + getHand2().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.baischer.service.grpc.CompareHandsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.baischer.service.grpc.CompareHandsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.baischer.service.grpc.CompareHandsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.baischer.service.grpc.CompareHandsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.baischer.service.grpc.CompareHandsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.baischer.service.grpc.CompareHandsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.baischer.service.grpc.CompareHandsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.baischer.service.grpc.CompareHandsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.baischer.service.grpc.CompareHandsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.baischer.service.grpc.CompareHandsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.baischer.service.grpc.CompareHandsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.baischer.service.grpc.CompareHandsRequest parseFrom(
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
  public static Builder newBuilder(com.baischer.service.grpc.CompareHandsRequest prototype) {
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
   * Protobuf type {@code CompareHandsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CompareHandsRequest)
      com.baischer.service.grpc.CompareHandsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.baischer.service.grpc.TexasHoldemServiceOuterClass.internal_static_CompareHandsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.baischer.service.grpc.TexasHoldemServiceOuterClass.internal_static_CompareHandsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.baischer.service.grpc.CompareHandsRequest.class, com.baischer.service.grpc.CompareHandsRequest.Builder.class);
    }

    // Construct using com.baischer.service.grpc.CompareHandsRequest.newBuilder()
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
      hand1_ = "";

      hand2_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.baischer.service.grpc.TexasHoldemServiceOuterClass.internal_static_CompareHandsRequest_descriptor;
    }

    @java.lang.Override
    public com.baischer.service.grpc.CompareHandsRequest getDefaultInstanceForType() {
      return com.baischer.service.grpc.CompareHandsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.baischer.service.grpc.CompareHandsRequest build() {
      com.baischer.service.grpc.CompareHandsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.baischer.service.grpc.CompareHandsRequest buildPartial() {
      com.baischer.service.grpc.CompareHandsRequest result = new com.baischer.service.grpc.CompareHandsRequest(this);
      result.hand1_ = hand1_;
      result.hand2_ = hand2_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.baischer.service.grpc.CompareHandsRequest) {
        return mergeFrom((com.baischer.service.grpc.CompareHandsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.baischer.service.grpc.CompareHandsRequest other) {
      if (other == com.baischer.service.grpc.CompareHandsRequest.getDefaultInstance()) return this;
      if (!other.getHand1().isEmpty()) {
        hand1_ = other.hand1_;
        onChanged();
      }
      if (!other.getHand2().isEmpty()) {
        hand2_ = other.hand2_;
        onChanged();
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
      com.baischer.service.grpc.CompareHandsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.baischer.service.grpc.CompareHandsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object hand1_ = "";
    /**
     * <code>string hand1 = 1;</code>
     */
    public java.lang.String getHand1() {
      java.lang.Object ref = hand1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hand1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hand1 = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHand1Bytes() {
      java.lang.Object ref = hand1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hand1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hand1 = 1;</code>
     */
    public Builder setHand1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hand1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hand1 = 1;</code>
     */
    public Builder clearHand1() {
      
      hand1_ = getDefaultInstance().getHand1();
      onChanged();
      return this;
    }
    /**
     * <code>string hand1 = 1;</code>
     */
    public Builder setHand1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hand1_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object hand2_ = "";
    /**
     * <code>string hand2 = 2;</code>
     */
    public java.lang.String getHand2() {
      java.lang.Object ref = hand2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hand2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hand2 = 2;</code>
     */
    public com.google.protobuf.ByteString
        getHand2Bytes() {
      java.lang.Object ref = hand2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hand2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hand2 = 2;</code>
     */
    public Builder setHand2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hand2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hand2 = 2;</code>
     */
    public Builder clearHand2() {
      
      hand2_ = getDefaultInstance().getHand2();
      onChanged();
      return this;
    }
    /**
     * <code>string hand2 = 2;</code>
     */
    public Builder setHand2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hand2_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:CompareHandsRequest)
  }

  // @@protoc_insertion_point(class_scope:CompareHandsRequest)
  private static final com.baischer.service.grpc.CompareHandsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.baischer.service.grpc.CompareHandsRequest();
  }

  public static com.baischer.service.grpc.CompareHandsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompareHandsRequest>
      PARSER = new com.google.protobuf.AbstractParser<CompareHandsRequest>() {
    @java.lang.Override
    public CompareHandsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompareHandsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompareHandsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompareHandsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.baischer.service.grpc.CompareHandsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
