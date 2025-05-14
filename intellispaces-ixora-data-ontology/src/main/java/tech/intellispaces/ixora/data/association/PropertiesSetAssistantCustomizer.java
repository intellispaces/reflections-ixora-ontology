package tech.intellispaces.ixora.data.association;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(PropertiesSetDomain.class)
public interface PropertiesSetAssistantCustomizer {

  UnmovablePropertiesSetReflection reflectionOf(java.util.Map<String, Object> map);
}
