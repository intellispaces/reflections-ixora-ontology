package tech.intellispaces.ixora.rdb.transaction;

import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

@ArtifactCustomizer(origin = TransactionDomain.class, target = "ObjectProvider")
public interface TransactionProviderCustomizer {

  MovableTransactionHandle current();
}
