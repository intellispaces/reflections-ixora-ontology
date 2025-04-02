package tech.intellispaces.jaquarius.ixora.data.cursor;

import tech.intellispaces.ixora.data.collection.CollectionDomain;
import tech.intellispaces.ixora.data.cursor.CursorDomain;
import tech.intellispaces.ixora.data.cursor.CursorHandle;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = CursorDomain.class, target = "ObjectProvider")
public interface CursorProviderCustomizer {

  <E> CursorHandle<E> create(CollectionDomain<E> collection);
}
