package tech.intellispaces.ixora.data.cursor;

import tech.intellispaces.ixora.data.collection.CollectionDomain;
import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(CursorDomain.class)
public interface CursorAssistantCustomizer {

  <E> CursorReflection<E> create(CollectionDomain<E> collection);
}
