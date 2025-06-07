package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(Integer32ListDomain.class)
public interface Integer32ListAssistantCustomizer {

  Integer32List create(int value1, int value2);

  Integer32List create(int value1, int value2, int value3);

  Integer32List reflectionOf(int[] array);

  Integer32List reflectionOf(java.util.List<Integer> list);
}
