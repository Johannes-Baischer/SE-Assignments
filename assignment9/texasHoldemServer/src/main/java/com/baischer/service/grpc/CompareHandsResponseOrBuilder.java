// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: texasHoldemService.proto

package com.baischer.service.grpc;

public interface CompareHandsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CompareHandsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * -1 &lt;=&gt; h1 &lt; h2, 0 &lt;=&gt; h1 = h2, 1 &lt;=&gt; h1 &gt; h2
   * </pre>
   *
   * <code>int32 result = 1;</code>
   */
  int getResult();
}
