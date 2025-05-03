package tech.intellispaces.ixora.data.stream;

import tech.intellispaces.reflections.annotation.Customizer;
import tech.intellispaces.reflections.artifact.ArtifactTypes;

@Customizer(origin = DataStreamDomain.class, target = ArtifactTypes.RegularObject)
public interface DataStreamCustomizer extends AutoCloseable {
}
