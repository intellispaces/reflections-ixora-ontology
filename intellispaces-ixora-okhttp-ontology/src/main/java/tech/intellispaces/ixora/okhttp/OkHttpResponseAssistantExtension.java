package tech.intellispaces.ixora.okhttp;

import okhttp3.Response;
import tech.intellispaces.jaquarius.annotation.AssistantExtension;

@AssistantExtension(OkHttpResponseDomain.class)
public interface OkHttpResponseAssistantExtension {

  UnmovableOkHttpResponseHandle handleOf(Response response);
}
