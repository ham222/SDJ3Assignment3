// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services.proto

package via.sdj3.handin3;

public interface AnimalPartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:handin3.AnimalPart)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>double weight = 2;</code>
   * @return The weight.
   */
  double getWeight();

  /**
   * <code>string type = 3;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>.handin3.Animal cameFrom = 4;</code>
   * @return Whether the cameFrom field is set.
   */
  boolean hasCameFrom();
  /**
   * <code>.handin3.Animal cameFrom = 4;</code>
   * @return The cameFrom.
   */
  via.sdj3.handin3.Animal getCameFrom();
  /**
   * <code>.handin3.Animal cameFrom = 4;</code>
   */
  via.sdj3.handin3.AnimalOrBuilder getCameFromOrBuilder();
}
