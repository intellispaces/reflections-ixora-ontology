package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.jaquarius.annotation.Customizer;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@Customizer(origin = CollectionDomain.class, target = ArtifactTypes.RegularObject)
public interface CollectionCustomizer<E> extends Iterable<E> {
}
