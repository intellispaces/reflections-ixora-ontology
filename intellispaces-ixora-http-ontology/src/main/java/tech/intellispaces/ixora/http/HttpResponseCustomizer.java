package tech.intellispaces.ixora.http;

import tech.intellispaces.reflections.annotation.Customizer;
import tech.intellispaces.reflections.artifact.ArtifactTypes;

@Customizer(origin = HttpResponseDomain.class, target = ArtifactTypes.RegularObject)
public interface HttpResponseCustomizer extends AutoCloseable {
}
