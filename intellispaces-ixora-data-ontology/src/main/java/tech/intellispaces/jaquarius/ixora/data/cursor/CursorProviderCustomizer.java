package tech.intellispaces.jaquarius.ixora.data.cursor;

import tech.intellispaces.ixora.data.collection.CollectionDomain;
import tech.intellispaces.ixora.data.cursor.CursorDomain;
import tech.intellispaces.ixora.data.cursor.CursorHandle;
import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = CursorDomain.class, target = ArtifactTypes.ObjectProvider)
public interface CursorProviderCustomizer {

  <E> CursorHandle<E> create(CollectionDomain<E> collection);
}
