package tech.intellispaces.ixora.http;

import tech.intellispaces.jaquarius.annotation.Customizer;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@Customizer(origin = HttpResponseDomain.class, target = ArtifactTypes.RegularObject)
public interface HttpResponseCustomizer extends AutoCloseable {
}
