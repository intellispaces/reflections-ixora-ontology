package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

@AssistantCustomizer(ByteListDomain.class)
public interface ByteListAssistantCustomizer {

  UnmovableByteListHandle create(byte value1, byte value2);

  UnmovableByteListHandle create(byte value1, byte value2, byte value3);

  UnmovableByteListHandle handleOf(byte[] array);

  UnmovableByteListHandle handleOf(java.util.List<Byte> list);
}

