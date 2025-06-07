package tech.intellispaces.ixora.jetty;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;
import tech.intellispaces.reflections.framework.reflection.DownwardObjectFactory;
import tech.intellispaces.reflections.framework.reflection.MovableReflection;

@AssistantCustomizer(JettyServerPortDomain.class)
public interface JettyServerPortAssistantCustomizer {

  MovableJettyServerPort create(int portNumber, MovableReflection overlyingReflection);

  default DownwardObjectFactory<MovableJettyServerPort> factory(int portNumber) {
    return overlyingReflection -> create(portNumber, overlyingReflection);
  }
}
