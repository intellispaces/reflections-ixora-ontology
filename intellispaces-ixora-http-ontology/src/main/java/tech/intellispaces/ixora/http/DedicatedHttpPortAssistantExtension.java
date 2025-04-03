package tech.intellispaces.ixora.http;

import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = DedicatedHttpPortDomain.class, target = ArtifactTypes.ObjectAssistant)
public interface DedicatedHttpPortAssistantExtension {

  MovableDedicatedHttpPortHandle create(String baseUrl, MovableHttpPort httpPort);
}
