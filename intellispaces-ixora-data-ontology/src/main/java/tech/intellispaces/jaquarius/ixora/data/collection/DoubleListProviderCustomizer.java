package tech.intellispaces.jaquarius.ixora.data.collection;

import tech.intellispaces.ixora.data.collection.Float64ListDomain;
import tech.intellispaces.ixora.data.collection.UnmovableFloat64ListHandle;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = Float64ListDomain.class, target = "ObjectProvider")
public interface DoubleListProviderCustomizer {

  UnmovableFloat64ListHandle handleOf(double[] array);

  UnmovableFloat64ListHandle handleOf(java.util.List<Double> list);
}
