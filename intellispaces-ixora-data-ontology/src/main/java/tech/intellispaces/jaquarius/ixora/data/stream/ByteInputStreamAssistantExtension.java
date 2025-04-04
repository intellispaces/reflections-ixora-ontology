package tech.intellispaces.jaquarius.ixora.data.stream;

import tech.intellispaces.ixora.data.stream.ByteInputStreamDomain;
import tech.intellispaces.ixora.data.stream.MovableByteInputStreamHandle;
import tech.intellispaces.jaquarius.annotation.AssistantExtension;

import java.io.InputStream;

@AssistantExtension(ByteInputStreamDomain.class)
public interface ByteInputStreamAssistantExtension {

  MovableByteInputStreamHandle empty();

  MovableByteInputStreamHandle handleOf(InputStream is);
}
