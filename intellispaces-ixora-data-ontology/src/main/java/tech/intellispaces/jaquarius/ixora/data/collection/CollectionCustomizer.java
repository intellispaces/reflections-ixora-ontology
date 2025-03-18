package tech.intellispaces.jaquarius.ixora.data.collection;

import tech.intellispaces.ixora.data.collection.CollectionDomain;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = CollectionDomain.class, target = "UndefinedObjectHandle")
public interface CollectionCustomizer<E> {

  java.util.Collection<E> nativeCollection();
}
