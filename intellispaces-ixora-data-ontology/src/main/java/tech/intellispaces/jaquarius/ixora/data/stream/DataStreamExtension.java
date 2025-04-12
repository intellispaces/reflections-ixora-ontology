package tech.intellispaces.jaquarius.ixora.data.stream;

import tech.intellispaces.ixora.data.stream.DataStreamDomain;
import tech.intellispaces.jaquarius.annotation.Extension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@Extension(origin = DataStreamDomain.class, target = ArtifactTypes.PlainObject)
public interface DataStreamExtension extends AutoCloseable {
}
