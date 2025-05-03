package tech.intellispaces.ixora.rdb.query;

import tech.intellispaces.ixora.data.collection.UnmovableList;
import tech.intellispaces.reflections.annotation.AssistantCustomizer;

@AssistantCustomizer(ParameterizedNamedQueryDomain.class)
public interface ParameterizedNamedQueryAssistantCustomizer {

  UnmovableParameterizedNamedQueryHandle create(String query, UnmovableList<String> paramNames);
}
