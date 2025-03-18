package tech.intellispaces.jaquarius.ixora.data.association;

import tech.intellispaces.ixora.data.association.MapDomain;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = MapDomain.class, target = "UndefinedObjectHandle")
public interface MapCustomizer<K, V> {

  java.util.Map<K, V> nativeMap();
}
