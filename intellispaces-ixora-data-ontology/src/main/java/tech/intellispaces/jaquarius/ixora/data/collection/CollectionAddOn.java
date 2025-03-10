package tech.intellispaces.jaquarius.ixora.data.collection;

import tech.intellispaces.ixora.data.collection.CollectionDomain;
import tech.intellispaces.jaquarius.annotation.Preprocessing;

@Preprocessing(value = CollectionDomain.class, artifact = "UndefinedSimpleObject", type = "addon")
public interface CollectionAddOn<E> {

  java.util.Collection<E> nativeCollection();
}
