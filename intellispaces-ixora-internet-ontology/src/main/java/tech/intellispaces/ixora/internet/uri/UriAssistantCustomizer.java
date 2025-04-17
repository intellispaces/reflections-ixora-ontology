package tech.intellispaces.ixora.internet.uri;

import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

@AssistantCustomizer(UriDomain.class)
public interface UriAssistantCustomizer {

  UriHandle create(String string);
}
