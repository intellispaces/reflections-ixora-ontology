package tech.intellispaces.ixora.http;

import tech.intellispaces.jaquarius.annotation.AssistantExtension;

@AssistantExtension(DedicatedHttpPortDomain.class)
public interface DedicatedHttpPortAssistantExtension {

  MovableDedicatedHttpPortHandle create(String baseUrl, MovableHttpPort httpPort);
}
