package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(Real64ListDomain.class)
public interface Real64ListAssistantCustomizer {

  Real64List reflectionOf(double[] array);

  Real64List reflectionOf(java.util.List<Double> list);
}
