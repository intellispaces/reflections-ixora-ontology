package tech.intellispaces.jaquarius.ixora.data.collection;

import tech.intellispaces.ixora.data.collection.CollectionDomain;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

import java.util.Iterator;

@ArtifactCustomizer(origin = CollectionDomain.class, target = "UndefinedPlainObject")
public interface CollectionCustomizer<E> extends Iterable<E> {

  @Override
  Iterator<E> iterator();
}
