package tech.intellispaces.ixora.http;

import java.io.InputStream;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(HttpResponseDomain.class)
public interface HttpResponseAssistantCustomizer {

  HttpResponse create(HttpStatus status);

  HttpResponse create(HttpStatus status, InputStream body);

  HttpResponse create(HttpStatus status, String body);

  HttpResponse create(HttpStatus status, byte[] body);

  default HttpResponse ok(String body) {
    return create(HttpStatuses.ok(), body);
  }

  default HttpResponse notFound() {
    return create(HttpStatuses.notFound());
  }

  default HttpResponse notFound(String body) {
    return create(HttpStatuses.notFound(), body);
  }
}
