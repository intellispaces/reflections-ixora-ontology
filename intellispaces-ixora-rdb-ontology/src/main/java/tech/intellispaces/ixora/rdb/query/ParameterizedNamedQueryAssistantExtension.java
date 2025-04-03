package tech.intellispaces.ixora.rdb.query;

import tech.intellispaces.ixora.data.collection.UnmovableList;
import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = ParameterizedNamedQueryDomain.class, target = ArtifactTypes.ObjectAssistant)
public interface ParameterizedNamedQueryAssistantExtension {

  UnmovableParameterizedNamedQueryHandle create(String query, UnmovableList<String> paramNames);
}
