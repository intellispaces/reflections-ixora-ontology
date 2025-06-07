package tech.intellispaces.ixora.okhttp;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(OkHttpPortDomain.class)
public interface OkHttpPortAssistantCustomizer {

  MovableOkHttpPort create();

  MovableOkHttpPort create(OkHttpPortSettings settings);
}
