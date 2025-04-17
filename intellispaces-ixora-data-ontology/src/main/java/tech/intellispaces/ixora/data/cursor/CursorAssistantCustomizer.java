package tech.intellispaces.ixora.data.cursor;

import tech.intellispaces.ixora.data.collection.CollectionDomain;
import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

@AssistantCustomizer(CursorDomain.class)
public interface CursorAssistantCustomizer {

  <E> CursorHandle<E> create(CollectionDomain<E> collection);
}
