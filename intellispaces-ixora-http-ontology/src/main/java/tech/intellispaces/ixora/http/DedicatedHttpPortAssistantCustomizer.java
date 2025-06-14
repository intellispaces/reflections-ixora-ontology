package tech.intellispaces.ixora.http;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(DedicatedHttpPortDomain.class)
public interface DedicatedHttpPortAssistantCustomizer {

  MovableDedicatedHttpPort create(String baseUrl, MovableHttpPort httpPort);
}
