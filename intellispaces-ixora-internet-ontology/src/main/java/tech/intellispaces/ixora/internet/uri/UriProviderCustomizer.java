package tech.intellispaces.ixora.internet.uri;

import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = UriDomain.class, target = ArtifactTypes.ObjectProvider)
public interface UriProviderCustomizer {

  UriHandle create(String string);
}
