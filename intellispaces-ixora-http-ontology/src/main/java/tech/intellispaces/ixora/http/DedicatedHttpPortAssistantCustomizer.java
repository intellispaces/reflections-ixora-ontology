package tech.intellispaces.ixora.http;

import tech.intellispaces.reflections.annotation.AssistantCustomizer;

@AssistantCustomizer(DedicatedHttpPortDomain.class)
public interface DedicatedHttpPortAssistantCustomizer {

  MovableDedicatedHttpPortHandle create(String baseUrl, MovableHttpPort httpPort);
}
