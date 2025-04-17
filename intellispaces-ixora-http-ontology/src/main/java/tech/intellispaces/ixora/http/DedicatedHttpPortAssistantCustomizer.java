package tech.intellispaces.ixora.http;

import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

@AssistantCustomizer(DedicatedHttpPortDomain.class)
public interface DedicatedHttpPortAssistantCustomizer {

  MovableDedicatedHttpPortHandle create(String baseUrl, MovableHttpPort httpPort);
}
