package tech.intellispaces.ixora.internet.uri;

import tech.intellispaces.reflections.annotation.AssistantCustomizer;

@AssistantCustomizer(UriDomain.class)
public interface UriAssistantCustomizer {

  UriHandle create(String string);
}
