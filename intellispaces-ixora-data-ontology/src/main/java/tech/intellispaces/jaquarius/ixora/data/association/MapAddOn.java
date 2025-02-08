package tech.intellispaces.jaquarius.ixora.data.association;

import tech.intellispaces.jaquarius.annotation.Preprocessing;

@Preprocessing(value = MapDomain.class, artifact = "ObjectHandle", type = "addon")
public interface MapAddOn<K, V> {

  java.util.Map<K, V> nativeMap();
}
