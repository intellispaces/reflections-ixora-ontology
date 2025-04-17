package tech.intellispaces.ixora.okhttp;

import okhttp3.Response;
import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

@AssistantCustomizer(OkHttpResponseDomain.class)
public interface OkHttpResponseAssistantCustomizer {

  UnmovableOkHttpResponseHandle handleOf(Response response);
}
