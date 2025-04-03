package tech.intellispaces.jaquarius.ixora.data.stream;

import tech.intellispaces.ixora.data.stream.ByteInputStreamDomain;
import tech.intellispaces.ixora.data.stream.MovableByteInputStreamHandle;
import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

import java.io.InputStream;

@ArtifactExtension(origin = ByteInputStreamDomain.class, target = ArtifactTypes.ObjectProvider)
public interface ByteInputStreamProviderCustomizer {

  MovableByteInputStreamHandle empty();

  MovableByteInputStreamHandle handleOf(InputStream is);
}
