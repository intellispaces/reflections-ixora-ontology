package tech.intellispaces.ixora.data.collection;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(ByteListDomain.class)
public interface ByteListAssistantCustomizer {

  ByteList create(byte value1, byte value2);

  ByteList create(byte value1, byte value2, byte value3);

  ByteList reflectionOf(byte[] array);

  ByteList reflectionOf(java.util.List<Byte> list);
}

