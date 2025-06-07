package tech.intellispaces.ixora.data.cursor;

import tech.intellispaces.ixora.data.collection.Collection;
import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(CursorDomain.class)
public interface CursorAssistantCustomizer {

  <E> Cursor<E> create(Collection<E> collection);
}
