package tech.intellispaces.ixora.internet.uri;

import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = UriDomain.class, target = "ObjectProvider")
public interface UriProviderCustomizer {

  UriHandle create(String string);
}
