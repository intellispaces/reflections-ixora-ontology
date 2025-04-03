package tech.intellispaces.ixora.rdb.query;

import tech.intellispaces.ixora.data.collection.UnmovableList;
import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = ParameterizedNamedQueryDomain.class, target = ArtifactTypes.ObjectProvider)
public interface ParameterizedNamedQueryProviderCustomizer {

  UnmovableParameterizedNamedQueryHandle create(String query, UnmovableList<String> paramNames);
}
