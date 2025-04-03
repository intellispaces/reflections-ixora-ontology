package tech.intellispaces.ixora.okhttp;

import okhttp3.Response;
import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = OkHttpResponseDomain.class, target = ArtifactTypes.ObjectAssistant)
public interface OkHttpResponseAssistantExtension {

  UnmovableOkHttpResponseHandle handleOf(Response response);
}
