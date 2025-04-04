package tech.intellispaces.ixora.rdb.query;

import tech.intellispaces.ixora.data.collection.UnmovableList;
import tech.intellispaces.jaquarius.annotation.AssistantExtension;

@AssistantExtension(ParameterizedNamedQueryDomain.class)
public interface ParameterizedNamedQueryAssistantExtension {

  UnmovableParameterizedNamedQueryHandle create(String query, UnmovableList<String> paramNames);
}
