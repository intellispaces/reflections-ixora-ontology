package tech.intellispaces.ixora.data.association;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(PropertiesSetDomain.class)
public interface PropertiesSetAssistantCustomizer {

  UnmovablePropertiesSetReflection reflectionOf(java.util.Map<String, Object> map);

  /**
   * Returns a native object representing given reflection.
   *
   * @param reflection the reflection.
   * @return instance of the {@link tech.intellispaces.commons.properties.PropertiesSet}.
   */
  default tech.intellispaces.commons.properties.PropertiesSet asNative(PropertiesSetReflection reflection) {
    if (NativePropertiesSetPresentable.class.isAssignableFrom(reflection.getClass())) {
      return ((NativePropertiesSetPresentable) reflection).asNativePropertiesSet();
    }
    return new PropertiesSetImpl(reflection);
  }
}
