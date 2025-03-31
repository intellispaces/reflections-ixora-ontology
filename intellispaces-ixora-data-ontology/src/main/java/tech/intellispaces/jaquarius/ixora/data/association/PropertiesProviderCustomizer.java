package tech.intellispaces.jaquarius.ixora.data.association;

import tech.intellispaces.ixora.data.association.PropertiesDomain;
import tech.intellispaces.ixora.data.association.UnmovablePropertiesHandle;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = PropertiesDomain.class, target = "ObjectProvider")
public interface PropertiesProviderCustomizer {

  UnmovablePropertiesHandle handleOf(java.util.Map<String, Object> map);
}
