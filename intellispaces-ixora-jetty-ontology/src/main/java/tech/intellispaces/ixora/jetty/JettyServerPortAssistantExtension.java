package tech.intellispaces.ixora.jetty;

import tech.intellispaces.ixora.http.HttpPortExchangeChannel;
import tech.intellispaces.jaquarius.annotation.AssistantExtension;

@AssistantExtension(JettyServerPortDomain.class)
public interface JettyServerPortAssistantExtension {

  MovableJettyServerPortHandle create(int portNumber, Class<? extends HttpPortExchangeChannel> exchangeChannel);
}
