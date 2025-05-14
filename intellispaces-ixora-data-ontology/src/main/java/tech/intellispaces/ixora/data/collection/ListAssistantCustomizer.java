package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.commons.type.Type;
import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(ListDomain.class)
public interface ListAssistantCustomizer {

  default UnmovableListReflection<Byte> create(byte value1, byte value2) {
    return ByteLists.create(value1, value2);
  }

  default UnmovableListReflection<Byte> create(byte value1, byte value2, byte value3) {
    return ByteLists.create(value1, value2, value3);
  }

  default UnmovableListReflection<Integer> create(int value1, int value2) {
    return Integer32Lists.create(value1, value2);
  }

  default UnmovableListReflection<Integer> create(int value1, int value2, int value3) {
    return Integer32Lists.create(value1, value2, value3);
  }

  /**
   * Creates empty list and returns unmovable handle to it.
   *
   * @param elementClass the list element class.
   * @return the handle to list.
   * @param <E> the list element type.
   */
  <E> UnmovableListReflection<E> empty(Class<E> elementClass);

  /**
   * Returns unmovable handle to Java list.
   *
   * @param list the list.
   * @param elementClass the list element class.
   * @return the handle to list.
   * @param <E> the list element type.
   */
  <E> UnmovableListReflection<E> reflectionOf(java.util.List<E> list, Class<E> elementClass);

  /**
   * Returns unmovable handle to Java list.
   *
   * @param list the list.
   * @param elementType the elements type.
   * @return the handle to list.
   * @param <E> the list element type.
   */
  <E> UnmovableListReflection<E> reflectionOf(java.util.List<E> list, Type<E> elementType);

  default UnmovableListReflection<Byte> reflectionOf(byte[] array) {
    return ByteLists.reflectionOf(array);
  }

  default UnmovableListReflection<Integer> reflectionOf(int[] array) {
    return Integer32Lists.reflectionOf(array);
  }

  default UnmovableListReflection<Double> reflectionOf(double[] array) {
    return Real64Lists.reflectionOf(array);
  }

  default UnmovableListReflection<Byte> reflectionOfByteList(java.util.List<Byte> list) {
    return ByteLists.reflectionOf(list);
  }

  default UnmovableListReflection<Integer> reflectionOfIntegerList(java.util.List<Integer> list) {
    return Integer32Lists.reflectionOf(list);
  }

  default UnmovableListReflection<Double> reflectionOfDoubleList(java.util.List<Double> list) {
    return Real64Lists.reflectionOf(list);
  }

  default UnmovableListReflection<String> reflectionOfStringList(java.util.List<String> list) {
    return reflectionOf(list, String.class);
  }
}
