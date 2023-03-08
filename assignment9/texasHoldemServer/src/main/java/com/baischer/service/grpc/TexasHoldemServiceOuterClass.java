// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: texasHoldemService.proto

package com.baischer.service.grpc;

public final class TexasHoldemServiceOuterClass {
  private TexasHoldemServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetHandValueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetHandValueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetHandValueResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetHandValueResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CompareHandsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CompareHandsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CompareHandsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CompareHandsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetProbabilityToWinRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetProbabilityToWinRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetProbabilityToWinResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetProbabilityToWinResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030texasHoldemService.proto\"#\n\023GetHandVal" +
      "ueRequest\022\014\n\004hand\030\001 \001(\t\"*\n\024GetHandValueR" +
      "esponse\022\022\n\nhand_value\030\001 \001(\t\"3\n\023CompareHa" +
      "ndsRequest\022\r\n\005hand1\030\001 \001(\t\022\r\n\005hand2\030\002 \001(\t" +
      "\"&\n\024CompareHandsResponse\022\016\n\006result\030\001 \001(\005" +
      "\"\212\001\n\032GetProbabilityToWinRequest\022\023\n\013talon" +
      "_cards\030\001 \001(\t\022\033\n\023player_pocket_cards\030\002 \001(" +
      "\t\022\033\n\023number_of_opponents\030\003 \001(\005\022\035\n\025number" +
      "_of_simulations\030\004 \001(\005\"2\n\033GetProbabilityT" +
      "oWinResponse\022\023\n\013probability\030\001 \001(\0012\346\001\n\022Te" +
      "xasHoldemService\022=\n\014getHandValue\022\024.GetHa" +
      "ndValueRequest\032\025.GetHandValueResponse\"\000\022" +
      "=\n\014compareHands\022\024.CompareHandsRequest\032\025." +
      "CompareHandsResponse\"\000\022R\n\023getProbability" +
      "ToWin\022\033.GetProbabilityToWinRequest\032\034.Get" +
      "ProbabilityToWinResponse\"\000B\035\n\031com.baisch" +
      "er.service.grpcP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_GetHandValueRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetHandValueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetHandValueRequest_descriptor,
        new java.lang.String[] { "Hand", });
    internal_static_GetHandValueResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GetHandValueResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetHandValueResponse_descriptor,
        new java.lang.String[] { "HandValue", });
    internal_static_CompareHandsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_CompareHandsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CompareHandsRequest_descriptor,
        new java.lang.String[] { "Hand1", "Hand2", });
    internal_static_CompareHandsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_CompareHandsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CompareHandsResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_GetProbabilityToWinRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_GetProbabilityToWinRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetProbabilityToWinRequest_descriptor,
        new java.lang.String[] { "TalonCards", "PlayerPocketCards", "NumberOfOpponents", "NumberOfSimulations", });
    internal_static_GetProbabilityToWinResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_GetProbabilityToWinResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetProbabilityToWinResponse_descriptor,
        new java.lang.String[] { "Probability", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
