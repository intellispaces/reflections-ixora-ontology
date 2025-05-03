package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.reflections.annotation.Customizer;
import tech.intellispaces.reflections.artifact.ArtifactTypes;

@Customizer(origin = CollectionDomain.class, target = ArtifactTypes.RegularObject)
public interface CollectionCustomizer<E> extends Iterable<E> {
}
