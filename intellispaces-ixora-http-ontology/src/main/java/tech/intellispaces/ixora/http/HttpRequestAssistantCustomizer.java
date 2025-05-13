package tech.intellispaces.ixora.http;

import tech.intellispaces.ixora.internet.uri.Uri;
import tech.intellispaces.ixora.internet.uri.Uris;
import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(HttpRequestDomain.class)
public interface HttpRequestAssistantCustomizer {

  UnmovableHttpRequestReflection create(HttpMethod method, Uri requestURI);

  default UnmovableHttpRequestReflection create(HttpMethod method, String requestURI){
    return HttpRequests.create(method, Uris.create(requestURI));
  }
}
