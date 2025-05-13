package tech.intellispaces.ixora.rdb.query;

import tech.intellispaces.ixora.data.collection.UnmovableList;
import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(ParameterizedNamedQueryDomain.class)
public interface ParameterizedNamedQueryAssistantCustomizer {

  UnmovableParameterizedNamedQueryReflection create(String query, UnmovableList<String> paramNames);
}
