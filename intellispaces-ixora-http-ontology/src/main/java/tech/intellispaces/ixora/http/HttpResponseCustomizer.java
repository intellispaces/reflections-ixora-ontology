package tech.intellispaces.ixora.http;

import tech.intellispaces.reflections.framework.annotation.Customizer;
import tech.intellispaces.reflections.framework.artifact.ArtifactTypes;

@Customizer(origin = HttpResponseDomain.class, target = ArtifactTypes.RegularObject)
public interface HttpResponseCustomizer extends AutoCloseable {
}
