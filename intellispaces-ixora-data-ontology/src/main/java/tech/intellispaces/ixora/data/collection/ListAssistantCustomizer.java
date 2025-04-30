package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.commons.type.Type;
import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

@AssistantCustomizer(ListDomain.class)
public interface ListAssistantCustomizer {

  default UnmovableListHandle<Byte> create(byte value1, byte value2) {
    return ByteLists.create(value1, value2);
  }

  default UnmovableListHandle<Byte> create(byte value1, byte value2, byte value3) {
    return ByteLists.create(value1, value2, value3);
  }

  default UnmovableListHandle<Integer> create(int value1, int value2) {
    return Integer32Lists.create(value1, value2);
  }

  default UnmovableListHandle<Integer> create(int value1, int value2, int value3) {
    return Integer32Lists.create(value1, value2, value3);
  }

  /**
   * Creates empty list and returns unmovable handle to it.
   *
   * @param elementClass the list element class.
   * @return the handle to list.
   * @param <E> the list element type.
   */
  <E> UnmovableListHandle<E> empty(Class<E> elementClass);

  /**
   * Returns unmovable handle to Java list.
   *
   * @param list the list.
   * @param elementClass the list element class.
   * @return the handle to list.
   * @param <E> the list element type.
   */
  <E> UnmovableListHandle<E> handleOf(java.util.List<E> list, Class<E> elementClass);

  /**
   * Returns unmovable handle to Java list.
   *
   * @param list the list.
   * @param elementType the elements type.
   * @return the handle to list.
   * @param <E> the list element type.
   */
  <E> UnmovableListHandle<E> handleOf(java.util.List<E> list, Type<E> elementType);

  default UnmovableListHandle<Byte> handleOf(byte[] array) {
    return ByteLists.handleOf(array);
  }

  default UnmovableListHandle<Integer> handleOf(int[] array) {
    return Integer32Lists.handleOf(array);
  }

  default UnmovableListHandle<Double> handleOf(double[] array) {
    return Real64Lists.handleOf(array);
  }

  default UnmovableListHandle<Byte> handleOfByteList(java.util.List<Byte> list) {
    return ByteLists.handleOf(list);
  }

  default UnmovableListHandle<Integer> handleOfIntegerList(java.util.List<Integer> list) {
    return Integer32Lists.handleOf(list);
  }

  default UnmovableListHandle<Double> handleOfDoubleList(java.util.List<Double> list) {
    return Real64Lists.handleOf(list);
  }

  default UnmovableListHandle<String> handleOfStringList(java.util.List<String> list) {
    return handleOf(list, String.class);
  }
}
