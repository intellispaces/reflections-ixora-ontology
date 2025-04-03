package tech.intellispaces.ixora.okhttp;

import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = OkHttpPortDomain.class, target = ArtifactTypes.ObjectAssistant)
public interface OkHttpPortAssistantExtension {

  MovableOkHttpPortHandle create();

  MovableOkHttpPortHandle create(OkHttpPortSettings properties);
}
