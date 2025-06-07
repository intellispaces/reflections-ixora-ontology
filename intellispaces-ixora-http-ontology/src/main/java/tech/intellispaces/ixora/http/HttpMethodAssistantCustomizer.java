package tech.intellispaces.ixora.http;

import tech.intellispaces.commons.exception.UnexpectedExceptions;
import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(HttpMethodDomain.class)
public interface HttpMethodAssistantCustomizer {

  HttpMethod get();

  HttpMethod head();

  HttpMethod post();

  HttpMethod put();

  HttpMethod patch();

  HttpMethod delete();

  HttpMethod options();

  HttpMethod trace();

  default HttpMethod get(String name) {
    if (HttpMethodNames.GET.equals(name)) {
      return get();
    } else if (HttpMethodNames.HEAD.equals(name)) {
      return head();
    } else if (HttpMethodNames.POST.equals(name)) {
      return post();
    } else if (HttpMethodNames.PUT.equals(name)) {
      return put();
    } else if (HttpMethodNames.PATCH.equals(name)) {
      return patch();
    } else if (HttpMethodNames.DELETE.equals(name)) {
      return delete();
    } else if (HttpMethodNames.OPTIONS.equals(name)) {
      return options();
    } else if (HttpMethodNames.TRACE.equals(name)) {
      return trace();
    } else {
      throw UnexpectedExceptions.withMessage("Unsupported HTTP method name {0}", name);
    }
  }
}
