package tech.intellispaces.ixora.http;

import tech.intellispaces.ixora.internet.uri.Uri;
import tech.intellispaces.ixora.internet.uri.Uris;
import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(HttpRequestDomain.class)
public interface HttpRequestAssistantCustomizer {

  HttpRequest create(HttpMethod method, Uri requestURI);

  default HttpRequest create(HttpMethod method, String requestURI){
    return HttpRequests.create(method, Uris.create(requestURI));
  }
}
