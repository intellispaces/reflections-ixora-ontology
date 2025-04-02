package tech.intellispaces.ixora.rdb.query;

import tech.intellispaces.ixora.data.collection.UnmovableList;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = ParameterizedNamedQueryDomain.class, target = "ObjectProvider")
public interface ParameterizedNamedQueryProviderCustomizer {

  UnmovableParameterizedNamedQueryHandle create(String query, UnmovableList<String> paramNames);
}
