package tech.intellispaces.jaquarius.ixora.data.association;

import tech.intellispaces.ixora.data.association.MapDomain;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = MapDomain.class, target = "UndefinedSimpleObject")
public interface MapCustomizer<K, V> {

  java.util.Map<K, V> nativeMap();
}
