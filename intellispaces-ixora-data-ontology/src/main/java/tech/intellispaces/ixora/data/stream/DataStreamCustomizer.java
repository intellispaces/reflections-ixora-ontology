package tech.intellispaces.ixora.data.stream;

import tech.intellispaces.jaquarius.annotation.Customizer;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@Customizer(origin = DataStreamDomain.class, target = ArtifactTypes.RegularObject)
public interface DataStreamCustomizer extends AutoCloseable {
}
