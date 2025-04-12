package tech.intellispaces.ixora.jetty;

import tech.intellispaces.ixora.http.MovableInboundHttpPortHandle;
import tech.intellispaces.jaquarius.annotation.AssistantExtension;

@AssistantExtension(JettyServerPortDomain.class)
public interface JettyServerPortAssistantExtension {

  MovableJettyServerPortHandle create(int portNumber, MovableInboundHttpPortHandle overlyingPort);
}
