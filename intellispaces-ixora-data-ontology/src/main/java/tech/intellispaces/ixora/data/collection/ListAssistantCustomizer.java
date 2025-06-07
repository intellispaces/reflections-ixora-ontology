package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.commons.type.Type;
import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(ListDomain.class)
public interface ListAssistantCustomizer {

  default List<Byte> create(byte value1, byte value2) {
    return ByteLists.create(value1, value2);
  }

  default List<Byte> create(byte value1, byte value2, byte value3) {
    return ByteLists.create(value1, value2, value3);
  }

  default List<Integer> create(int value1, int value2) {
    return Integer32Lists.create(value1, value2);
  }

  default List<Integer> create(int value1, int value2, int value3) {
    return Integer32Lists.create(value1, value2, value3);
  }

  /**
   * Creates empty list and returns unmovable reflection.
   *
   * @param elementClass the list element class.
   * @return the list reflection.
   * @param <E> the list element type.
   */
  <E> List<E> empty(Class<E> elementClass);

  /**
   * Returns unmovable reflection of the Java list.
   *
   * @param list the list.
   * @param elementClass the list element class.
   * @return the list reflection.
   * @param <E> the list element type.
   */
  <E> List<E> reflectionOf(java.util.List<E> list, Class<E> elementClass);

  /**
   * Returns unmovable reflection of the Java list.
   *
   * @param list the list.
   * @param elementType the elements type.
   * @return the list reflection.
   * @param <E> the list element type.
   */
  <E> List<E> reflectionOf(java.util.List<E> list, Type<E> elementType);

  default List<Byte> reflectionOf(byte[] array) {
    return ByteLists.reflectionOf(array);
  }

  default List<Integer> reflectionOf(int[] array) {
    return Integer32Lists.reflectionOf(array);
  }

  default List<Double> reflectionOf(double[] array) {
    return Real64Lists.reflectionOf(array);
  }

  default List<Byte> reflectionOfByteList(java.util.List<Byte> list) {
    return ByteLists.reflectionOf(list);
  }

  default List<Integer> reflectionOfIntegerList(java.util.List<Integer> list) {
    return Integer32Lists.reflectionOf(list);
  }

  default List<Double> reflectionOfDoubleList(java.util.List<Double> list) {
    return Real64Lists.reflectionOf(list);
  }

  default List<String> reflectionOfStringList(java.util.List<String> list) {
    return reflectionOf(list, String.class);
  }
}
