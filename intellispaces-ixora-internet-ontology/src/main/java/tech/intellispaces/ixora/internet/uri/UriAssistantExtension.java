package tech.intellispaces.ixora.internet.uri;

import tech.intellispaces.jaquarius.annotation.AssistantExtension;

@AssistantExtension(UriDomain.class)
public interface UriAssistantExtension {

  UriHandle create(String string);
}
