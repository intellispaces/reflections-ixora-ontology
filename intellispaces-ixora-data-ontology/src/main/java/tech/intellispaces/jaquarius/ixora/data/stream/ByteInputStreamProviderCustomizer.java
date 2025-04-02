package tech.intellispaces.jaquarius.ixora.data.stream;

import tech.intellispaces.ixora.data.stream.ByteInputStreamDomain;
import tech.intellispaces.ixora.data.stream.MovableByteInputStreamHandle;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

import java.io.InputStream;

@ArtifactCustomizer(origin = ByteInputStreamDomain.class, target = "ObjectProvider")
public interface ByteInputStreamProviderCustomizer {

  MovableByteInputStreamHandle empty();

  MovableByteInputStreamHandle handleOf(InputStream is);
}
