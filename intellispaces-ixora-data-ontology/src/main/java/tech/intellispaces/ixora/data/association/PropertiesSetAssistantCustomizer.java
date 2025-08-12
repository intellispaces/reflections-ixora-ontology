package tech.intellispaces.ixora.data.association;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(PropertiesSetDomain.class)
public interface PropertiesSetAssistantCustomizer {

  PropertiesSet reflectionOf(java.util.Map<String, Object> map);

  /**
   * Returns a native object representing given reflection.
   *
   * @param reflection the reflection.
   * @return instance of the {@link tech.intellispaces.commons.properties.PropertiesSet}.
   */
  default tech.intellispaces.commons.properties.PropertiesSet asNative(PropertiesSet reflection) {
    if (reflection instanceof tech.intellispaces.commons.properties.PropertiesSet nativePropertiesSet) {
      return nativePropertiesSet;
    }
    return new PropertiesSetImpl(reflection);
  }
}
