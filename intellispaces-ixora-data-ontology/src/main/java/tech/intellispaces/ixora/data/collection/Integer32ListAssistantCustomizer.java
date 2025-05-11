package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(Integer32ListDomain.class)
public interface Integer32ListAssistantCustomizer {

  UnmovableInteger32ListHandle create(int value1, int value2);

  UnmovableInteger32ListHandle create(int value1, int value2, int value3);

  UnmovableInteger32ListHandle handleOf(int[] array);

  UnmovableInteger32ListHandle handleOf(java.util.List<Integer> list);
}
