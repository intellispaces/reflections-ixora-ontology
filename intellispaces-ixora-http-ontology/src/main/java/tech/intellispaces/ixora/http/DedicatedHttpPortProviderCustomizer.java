package tech.intellispaces.ixora.http;

import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = DedicatedHttpPortDomain.class, target = ArtifactTypes.ObjectProvider)
public interface DedicatedHttpPortProviderCustomizer {

  MovableDedicatedHttpPortHandle create(String baseUrl, MovableHttpPort httpPort);
}
