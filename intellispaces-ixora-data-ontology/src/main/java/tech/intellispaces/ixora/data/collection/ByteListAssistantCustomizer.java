package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(ByteListDomain.class)
public interface ByteListAssistantCustomizer {

  UnmovableByteListReflection create(byte value1, byte value2);

  UnmovableByteListReflection create(byte value1, byte value2, byte value3);

  UnmovableByteListReflection reflectionOf(byte[] array);

  UnmovableByteListReflection reflectionOf(java.util.List<Byte> list);
}

