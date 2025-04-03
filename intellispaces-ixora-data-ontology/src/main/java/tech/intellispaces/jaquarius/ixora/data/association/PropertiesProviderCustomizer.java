package tech.intellispaces.jaquarius.ixora.data.association;

import tech.intellispaces.ixora.data.association.PropertiesDomain;
import tech.intellispaces.ixora.data.association.UnmovablePropertiesHandle;
import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = PropertiesDomain.class, target = ArtifactTypes.ObjectProvider)
public interface PropertiesProviderCustomizer {

  UnmovablePropertiesHandle handleOf(java.util.Map<String, Object> map);
}
