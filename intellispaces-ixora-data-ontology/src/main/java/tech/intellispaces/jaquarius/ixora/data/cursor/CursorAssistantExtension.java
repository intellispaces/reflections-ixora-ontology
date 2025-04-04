package tech.intellispaces.jaquarius.ixora.data.cursor;

import tech.intellispaces.ixora.data.collection.CollectionDomain;
import tech.intellispaces.ixora.data.cursor.CursorDomain;
import tech.intellispaces.ixora.data.cursor.CursorHandle;
import tech.intellispaces.jaquarius.annotation.AssistantExtension;

@AssistantExtension(CursorDomain.class)
public interface CursorAssistantExtension {

  <E> CursorHandle<E> create(CollectionDomain<E> collection);
}
