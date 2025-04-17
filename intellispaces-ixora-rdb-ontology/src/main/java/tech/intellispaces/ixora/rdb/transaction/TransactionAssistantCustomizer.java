package tech.intellispaces.ixora.rdb.transaction;

import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

@AssistantCustomizer(TransactionDomain.class)
public interface TransactionAssistantCustomizer {

  MovableTransactionHandle current();
}
