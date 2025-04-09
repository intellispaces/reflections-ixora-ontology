package tech.intellispaces.jaquarius.ixora.data.collection;

import tech.intellispaces.ixora.data.collection.CollectionDomain;
import tech.intellispaces.jaquarius.annotation.Extension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

import java.util.Iterator;

@Extension(origin = CollectionDomain.class, target = ArtifactTypes.PlainObject)
public interface CollectionExtension<E> extends Iterable<E> {

  @Override
  Iterator<E> iterator();
}
