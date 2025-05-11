package tech.intellispaces.ixora.okhttp;

import okhttp3.Response;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(OkHttpResponseDomain.class)
public interface OkHttpResponseAssistantCustomizer {

  UnmovableOkHttpResponseHandle handleOf(Response response);
}
