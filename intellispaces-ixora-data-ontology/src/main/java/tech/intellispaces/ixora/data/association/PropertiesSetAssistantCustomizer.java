package tech.intellispaces.ixora.data.association;

import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

@AssistantCustomizer(PropertiesSetDomain.class)
public interface PropertiesSetAssistantCustomizer {

  UnmovablePropertiesSetHandle handleOf(java.util.Map<String, Object> map);
}
