package tech.intellispaces.ixora.data.stream;

import tech.intellispaces.reflections.framework.annotation.Customizer;
import tech.intellispaces.reflections.framework.artifact.ArtifactTypes;

@Customizer(origin = DataStreamDomain.class, target = ArtifactTypes.RegularObject)
public interface DataStreamCustomizer extends AutoCloseable {
}
