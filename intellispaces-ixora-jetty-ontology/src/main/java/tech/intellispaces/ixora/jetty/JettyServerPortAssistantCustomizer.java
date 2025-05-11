package tech.intellispaces.ixora.jetty;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;
import tech.intellispaces.reflections.framework.object.reference.DownwardObjectFactory;
import tech.intellispaces.reflections.framework.object.reference.MovableObjectHandle;

@AssistantCustomizer(JettyServerPortDomain.class)
public interface JettyServerPortAssistantCustomizer {

  MovableJettyServerPortHandle create(int portNumber, MovableObjectHandle<?> overlyingHandle);

  default DownwardObjectFactory<MovableJettyServerPortHandle> factory(int portNumber) {
    return overlyingHandle -> create(portNumber, overlyingHandle);
  }
}
