package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

@AssistantCustomizer(Real64ListDomain.class)
public interface Real64ListAssistantCustomizer {

  UnmovableReal64ListHandle handleOf(double[] array);

  UnmovableReal64ListHandle handleOf(java.util.List<Double> list);
}
