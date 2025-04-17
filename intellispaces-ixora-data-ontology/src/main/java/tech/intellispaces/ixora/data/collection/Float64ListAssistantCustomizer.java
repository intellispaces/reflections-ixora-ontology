package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

@AssistantCustomizer(Float64ListDomain.class)
public interface Float64ListAssistantCustomizer {

  UnmovableFloat64ListHandle handleOf(double[] array);

  UnmovableFloat64ListHandle handleOf(java.util.List<Double> list);
}
