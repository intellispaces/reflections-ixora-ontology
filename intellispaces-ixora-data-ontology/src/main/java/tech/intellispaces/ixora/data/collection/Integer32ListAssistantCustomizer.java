package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(Integer32ListDomain.class)
public interface Integer32ListAssistantCustomizer {

  UnmovableInteger32ListReflection create(int value1, int value2);

  UnmovableInteger32ListReflection create(int value1, int value2, int value3);

  UnmovableInteger32ListReflection handleOf(int[] array);

  UnmovableInteger32ListReflection handleOf(java.util.List<Integer> list);
}
