package tech.intellispaces.ixora.rdb.transaction;

import tech.intellispaces.jaquarius.annotation.AssistantExtension;

@AssistantExtension(TransactionDomain.class)
public interface TransactionAssistantExtension {

  MovableTransactionHandle current();
}
