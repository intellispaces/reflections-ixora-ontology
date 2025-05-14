package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.commons.type.Type;
import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(CollectionDomain.class)
public interface CollectionAssistantCustomizer {

  /**
   * Returns unmovable reflection of the Java list.
   *
   * @param list the origin collection.
   * @param elementClass the collection elements class.
   * @return the reflection.
   * @param <E> the element type.
   */
  <E> UnmovableCollectionReflection<E> reflectionOf(java.util.List<E> list, Class<E> elementClass);

  /**
   * Returns unmovable reflection of the Java list.
   *
   * @param list the origin collection.
   * @param elementType the collection elements type.
   * @return the reflection.
   * @param <E> the element type.
   */
  <E> UnmovableCollectionReflection<E> reflectionOf(java.util.List<E> list, Type<E> elementType);
}
