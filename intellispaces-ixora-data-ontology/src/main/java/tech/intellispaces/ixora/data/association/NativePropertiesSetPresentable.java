package tech.intellispaces.ixora.data.association;

import tech.intellispaces.commons.properties.PropertiesSet;

/**
 * Feature marker interface of reflection that can be represented as a native object of the type {@link PropertiesSet}.
 */
public interface NativePropertiesSetPresentable {

  /**
   * Returns the native object representing this reflection.
   */
  PropertiesSet asNativePropertiesSet();
}
