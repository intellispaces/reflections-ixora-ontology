package tech.intellispaces.ixora.okhttp;

import tech.intellispaces.reflections.annotation.AssistantCustomizer;

@AssistantCustomizer(OkHttpPortDomain.class)
public interface OkHttpPortAssistantCustomizer {

  MovableOkHttpPortHandle create();

  MovableOkHttpPortHandle create(OkHttpPortSettings settings);
}
