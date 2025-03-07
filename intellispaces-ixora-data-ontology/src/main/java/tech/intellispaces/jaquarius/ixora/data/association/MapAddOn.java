package tech.intellispaces.jaquarius.ixora.data.association;

import tech.intellispaces.ixora.data.association.MapDomain;
import tech.intellispaces.jaquarius.annotation.Preprocessing;

@Preprocessing(value = MapDomain.class, artifact = "UndefinedPureObject", type = "addon")
public interface MapAddOn<K, V> {

  java.util.Map<K, V> nativeMap();
}
