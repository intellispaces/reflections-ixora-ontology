package tech.intellispaces.jaquarius.ixora.data.association;

import tech.intellispaces.ixora.data.association.PropertiesDomain;
import tech.intellispaces.ixora.data.association.UnmovablePropertiesHandle;
import tech.intellispaces.jaquarius.annotation.AssistantExtension;

@AssistantExtension(PropertiesDomain.class)
public interface PropertiesAssistantExtension {

  UnmovablePropertiesHandle handleOf(java.util.Map<String, Object> map);
}
