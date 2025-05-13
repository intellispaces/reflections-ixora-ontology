package tech.intellispaces.ixora.jetty;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;
import tech.intellispaces.reflections.framework.reflection.DownwardObjectFactory;
import tech.intellispaces.reflections.framework.reflection.MovableReflection;

@AssistantCustomizer(JettyServerPortDomain.class)
public interface JettyServerPortAssistantCustomizer {

  MovableJettyServerPortReflection create(int portNumber, MovableReflection<?> overlyingHandle);

  default DownwardObjectFactory<MovableJettyServerPortReflection> factory(int portNumber) {
    return overlyingHandle -> create(portNumber, overlyingHandle);
  }
}
