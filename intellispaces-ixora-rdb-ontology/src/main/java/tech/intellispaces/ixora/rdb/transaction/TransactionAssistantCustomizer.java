package tech.intellispaces.ixora.rdb.transaction;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(TransactionDomain.class)
public interface TransactionAssistantCustomizer {

  MovableTransactionHandle current();
}
