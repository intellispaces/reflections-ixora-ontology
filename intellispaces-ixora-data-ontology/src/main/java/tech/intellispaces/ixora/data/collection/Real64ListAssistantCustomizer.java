package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(Real64ListDomain.class)
public interface Real64ListAssistantCustomizer {

  UnmovableReal64ListReflection handleOf(double[] array);

  UnmovableReal64ListReflection handleOf(java.util.List<Double> list);
}
