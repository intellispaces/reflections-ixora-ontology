package tech.intellispaces.ixora.data.association;

import tech.intellispaces.commons.type.Type;
import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

@AssistantCustomizer(MapDomain.class)
public interface MapAssistantCustomizer {

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
