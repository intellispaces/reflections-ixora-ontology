package tech.intellispaces.ixora.jetty;

import tech.intellispaces.reflections.annotation.AssistantCustomizer;
import tech.intellispaces.reflections.object.reference.DownwardObjectFactory;
import tech.intellispaces.reflections.object.reference.MovableObjectHandle;

@AssistantCustomizer(JettyServerPortDomain.class)
public interface JettyServerPortAssistantCustomizer {

  MovableJettyServerPortHandle create(int portNumber, MovableObjectHandle<?> overlyingHandle);

  default DownwardObjectFactory<MovableJettyServerPortHandle> factory(int portNumber) {
    return overlyingHandle -> create(portNumber, overlyingHandle);
  }
}
