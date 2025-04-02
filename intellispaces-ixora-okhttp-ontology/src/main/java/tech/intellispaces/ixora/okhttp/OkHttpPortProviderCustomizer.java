package tech.intellispaces.ixora.okhttp;

import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = OkHttpPortDomain.class, target = "ObjectProvider")
public interface OkHttpPortProviderCustomizer {

  MovableOkHttpPortHandle create();

  MovableOkHttpPortHandle create(OkHttpPortSettings properties);
}
