package tech.intellispaces.ixora.data.stream;

import java.io.InputStream;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(ByteInputStreamDomain.class)
public interface ByteInputStreamAssistantCustomizer {

  MovableByteInputStream empty();

  MovableByteInputStream reflectionOf(InputStream is);
}
