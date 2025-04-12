package tech.intellispaces.ixora.http;

import tech.intellispaces.jaquarius.annotation.Extension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@Extension(origin = HttpResponseDomain.class, target = ArtifactTypes.PlainObject)
public interface HttpResponseExtension extends AutoCloseable {
}
