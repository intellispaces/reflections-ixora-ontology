package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.reflections.framework.annotation.Customizer;
import tech.intellispaces.reflections.framework.artifact.ArtifactTypes;

@Customizer(origin = CollectionDomain.class, target = ArtifactTypes.Reflection)
public interface CollectionReflectionCustomizer<E> extends Iterable<E> {
}
