package tech.intellispaces.ixora.http;

import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = DedicatedHttpPortDomain.class, target = "ObjectProvider")
public interface DedicatedHttpPortProviderCustomizer {

  MovableDedicatedHttpPortHandle create(String baseUrl, MovableHttpPort httpPort);
}
