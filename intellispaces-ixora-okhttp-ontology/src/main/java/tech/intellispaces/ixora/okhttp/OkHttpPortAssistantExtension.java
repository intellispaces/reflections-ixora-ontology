package tech.intellispaces.ixora.okhttp;

import tech.intellispaces.jaquarius.annotation.AssistantExtension;

@AssistantExtension(OkHttpPortDomain.class)
public interface OkHttpPortAssistantExtension {

  MovableOkHttpPortHandle create();

  MovableOkHttpPortHandle create(OkHttpPortSettings properties);
}
