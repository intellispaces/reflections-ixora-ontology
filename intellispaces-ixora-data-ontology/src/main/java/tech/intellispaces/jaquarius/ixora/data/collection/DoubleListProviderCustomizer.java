package tech.intellispaces.jaquarius.ixora.data.collection;

import tech.intellispaces.ixora.data.collection.Float64ListDomain;
import tech.intellispaces.ixora.data.collection.UnmovableFloat64ListHandle;
import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = Float64ListDomain.class, target = ArtifactTypes.ObjectProvider)
public interface DoubleListProviderCustomizer {

  UnmovableFloat64ListHandle handleOf(double[] array);

  UnmovableFloat64ListHandle handleOf(java.util.List<Double> list);
}
