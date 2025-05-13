package tech.intellispaces.ixora.okhttp;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(OkHttpPortDomain.class)
public interface OkHttpPortAssistantCustomizer {

  MovableOkHttpPortReflection create();

  MovableOkHttpPortReflection create(OkHttpPortSettings settings);
}
