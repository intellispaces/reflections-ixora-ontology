package tech.intellispaces.jaquarius.ixora.data.collection;

import tech.intellispaces.ixora.data.collection.ListDomain;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = ListDomain.class, target = "UndefinedSimpleObject")
public interface ListCustomizer<E> {

  java.util.List<E> nativeList();
}
