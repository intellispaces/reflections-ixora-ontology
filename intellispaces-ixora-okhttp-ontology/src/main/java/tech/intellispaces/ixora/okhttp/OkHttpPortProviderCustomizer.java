package tech.intellispaces.ixora.okhttp;

import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = OkHttpPortDomain.class, target = ArtifactTypes.ObjectProvider)
public interface OkHttpPortProviderCustomizer {

  MovableOkHttpPortHandle create();

  MovableOkHttpPortHandle create(OkHttpPortSettings properties);
}
