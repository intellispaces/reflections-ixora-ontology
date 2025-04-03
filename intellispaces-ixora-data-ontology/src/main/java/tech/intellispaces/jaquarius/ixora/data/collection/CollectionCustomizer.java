package tech.intellispaces.jaquarius.ixora.data.collection;

import tech.intellispaces.ixora.data.collection.CollectionDomain;
import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

import java.util.Iterator;

@ArtifactExtension(origin = CollectionDomain.class, target = ArtifactTypes.UndefinedPlainObject)
public interface CollectionCustomizer<E> extends Iterable<E> {

  @Override
  Iterator<E> iterator();
}
