package tech.intellispaces.ixora.http;

import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

import java.io.InputStream;

@ArtifactExtension(origin = HttpResponseDomain.class, target = ArtifactTypes.ObjectAssistant)
public interface HttpResponseAssistantExtension {

  HttpResponseHandle create(HttpStatusHandle status);

  HttpResponseHandle create(HttpStatusHandle status, InputStream body);

  HttpResponseHandle create(HttpStatusHandle status, String body);

  HttpResponseHandle create(HttpStatusHandle status, byte[] body);

  default HttpResponseHandle ok(String body) {
    return create(HttpStatuses.ok(), body);
  }

  default HttpResponseHandle notFound() {
    return create(HttpStatuses.notFound());
  }

  default HttpResponseHandle notFound(String body) {
    return create(HttpStatuses.notFound(), body);
  }
}
