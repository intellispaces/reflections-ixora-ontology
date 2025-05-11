package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.reflections.framework.annotation.Customizer;
import tech.intellispaces.reflections.framework.artifact.ArtifactTypes;

@Customizer(origin = CollectionDomain.class, target = ArtifactTypes.RegularObject)
public interface CollectionCustomizer<E> extends Iterable<E> {
}
