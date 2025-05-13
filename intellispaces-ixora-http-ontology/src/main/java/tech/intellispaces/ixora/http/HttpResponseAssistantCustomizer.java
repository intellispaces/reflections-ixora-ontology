package tech.intellispaces.ixora.http;

import java.io.InputStream;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(HttpResponseDomain.class)
public interface HttpResponseAssistantCustomizer {

  HttpResponseReflection create(HttpStatusReflection status);

  HttpResponseReflection create(HttpStatusReflection status, InputStream body);

  HttpResponseReflection create(HttpStatusReflection status, String body);

  HttpResponseReflection create(HttpStatusReflection status, byte[] body);

  default HttpResponseReflection ok(String body) {
    return create(HttpStatuses.ok(), body);
  }

  default HttpResponseReflection notFound() {
    return create(HttpStatuses.notFound());
  }

  default HttpResponseReflection notFound(String body) {
    return create(HttpStatuses.notFound(), body);
  }
}
