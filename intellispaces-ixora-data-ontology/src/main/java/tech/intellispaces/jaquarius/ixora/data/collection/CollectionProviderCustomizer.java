package tech.intellispaces.jaquarius.ixora.data.collection;

import tech.intellispaces.commons.type.Type;
import tech.intellispaces.ixora.data.collection.CollectionDomain;
import tech.intellispaces.ixora.data.collection.UnmovableCollectionHandle;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = CollectionDomain.class, target = "ObjectProvider")
public interface CollectionProviderCustomizer {

  /**
   * Returns unmovable handle to Java list.
   *
   * @param list the origin collection.
   * @param elementClass the collection elements class.
   * @return the handle to collection.
   * @param <E> the element type.
   */
  <E> UnmovableCollectionHandle<E> handleOf(java.util.List<E> list, Class<E> elementClass);

  /**
   * Returns unmovable handle to Java list.
   *
   * @param list the origin collection.
   * @param elementType the collection elements type.
   * @return the handle to collection.
   * @param <E> the element type.
   */
  <E> UnmovableCollectionHandle<E> handleOf(java.util.List<E> list, Type<E> elementType);
}
