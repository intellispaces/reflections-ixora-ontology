package tech.intellispaces.ixora.data.association;

import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

@AssistantCustomizer(PropertiesDomain.class)
public interface PropertiesAssistantCustomizer {

  UnmovablePropertiesHandle handleOf(java.util.Map<String, Object> map);
}
