package tech.intellispaces.ixora.jetty;

import tech.intellispaces.ixora.http.HttpPortExchangeChannel;
import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = JettyServerPortDomain.class, target = ArtifactTypes.ObjectProvider)
public interface JettyServerPortProviderCustomizer {

  MovableJettyServerPortHandle create(int portNumber, Class<? extends HttpPortExchangeChannel> exchangeChannel);
}
