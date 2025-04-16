package tech.intellispaces.ixora.jetty;

import tech.intellispaces.jaquarius.annotation.AssistantExtension;
import tech.intellispaces.jaquarius.object.reference.DownwardObjectFactory;
import tech.intellispaces.jaquarius.object.reference.MovableObjectHandle;

@AssistantExtension(JettyServerPortDomain.class)
public interface JettyServerPortAssistantExtension {

  MovableJettyServerPortHandle create(int portNumber, MovableObjectHandle<?> overlyingHandle);

  default DownwardObjectFactory<MovableJettyServerPortHandle> factory(int portNumber) {
    return overlyingHandle -> create(portNumber, overlyingHandle);
  }
}
