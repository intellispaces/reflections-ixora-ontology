package tech.intellispaces.ixora.jetty;

import tech.intellispaces.ixora.http.HttpPortExchangeChannel;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = JettyServerPortDomain.class, target = "ObjectProvider")
public interface JettyServerPortProviderCustomizer {

  MovableJettyServerPortHandle create(int portNumber, Class<? extends HttpPortExchangeChannel> exchangeChannel);
}
