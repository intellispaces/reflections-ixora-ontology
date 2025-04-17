package tech.intellispaces.ixora.data.stream;

import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

import java.io.InputStream;

@AssistantCustomizer(ByteInputStreamDomain.class)
public interface ByteInputStreamAssistantCustomizer {

  MovableByteInputStreamHandle empty();

  MovableByteInputStreamHandle handleOf(InputStream is);
}
