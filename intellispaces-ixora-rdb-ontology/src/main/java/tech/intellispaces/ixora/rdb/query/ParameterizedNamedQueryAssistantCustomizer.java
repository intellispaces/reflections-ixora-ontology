package tech.intellispaces.ixora.rdb.query;

import tech.intellispaces.ixora.data.collection.List;
import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(ParameterizedNamedQueryDomain.class)
public interface ParameterizedNamedQueryAssistantCustomizer {

  ParameterizedNamedQuery create(String query, List<String> paramNames);
}
