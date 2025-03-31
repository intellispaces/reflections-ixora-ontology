package tech.intellispaces.jaquarius.ixora.data.association;

import tech.intellispaces.commons.type.Type;
import tech.intellispaces.ixora.data.association.MapDomain;
import tech.intellispaces.ixora.data.association.UnmovableMapHandle;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = MapDomain.class, target = "ObjectProvider")
public interface MapProviderCustomizer {

  <K, V> UnmovableMapHandle<K, V> create(
      Class<K> keyClass, Class<V> valueClass,
      K key, V value
  );

  <K, V> UnmovableMapHandle<K, V> create(
      Class<K> keyClass, Class<V> valueClass,
      K key1, V value1,
      K key2, V value2
  );

  <K, V> UnmovableMapHandle<K, V> create(
      Class<K> keyClass, Class<V> valueClass,
      K key1, V value1,
      K key2, V value2,
      K key3, V value3
  );

  <K, V> UnmovableMapHandle<K, V> create(
      Type<K> keyType, Type<V> valueType,
      K key, V value
  );

  <K, V> UnmovableMapHandle<K, V> create(
      Type<K> keyType, Type<V> valueType,
      K key1, V value1,
      K key2, V value2
  );

  <K, V> UnmovableMapHandle<K, V> create(
      Type<K> keyType, Type<V> valueType,
      K key1, V value1,
      K key2, V value2,
      K key3, V value3
  );

  <K, V> UnmovableMapHandle<K, V> handleOf(java.util.Map<K, V> map, Class<K> keyClass, Class<V> valueClass);

  <K, V> UnmovableMapHandle<K, V> handleOf(java.util.Map<K, V> map, Type<K> keyType, Type<V> valueType);
}
