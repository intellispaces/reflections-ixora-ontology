package tech.intellispaces.ixora.basic;

import tech.intellispaces.core.ReflectionDomain;
import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(ConceptProjectionDomain.class)
public interface ConceptProjectionAssistantCustomizer {

  ConceptProjection focused(Object source, ReflectionDomain targetDomain, Object target);

  ConceptProjection fuzzy(Object source, ReflectionDomain targetDomain, Object collectiveTarget);
}
