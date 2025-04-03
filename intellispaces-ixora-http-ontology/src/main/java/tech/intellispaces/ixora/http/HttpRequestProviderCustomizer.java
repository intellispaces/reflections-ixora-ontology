package tech.intellispaces.ixora.http;

import tech.intellispaces.ixora.internet.uri.Uri;
import tech.intellispaces.ixora.internet.uri.Uris;
import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = HttpRequestDomain.class, target = ArtifactTypes.ObjectProvider)
public interface HttpRequestProviderCustomizer {

  UnmovableHttpRequestHandle create(HttpMethod method, Uri requestURI);

  default UnmovableHttpRequestHandle create(HttpMethod method, String requestURI){
    return HttpRequests.create(method, Uris.create(requestURI));
  }
}
