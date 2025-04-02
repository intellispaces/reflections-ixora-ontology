package tech.intellispaces.ixora.okhttp;

import okhttp3.Response;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = OkHttpResponseDomain.class, target = "ObjectProvider")
public interface OkHttpResponseProviderCustomizer {

  UnmovableOkHttpResponseHandle handleOf(Response response);
}
