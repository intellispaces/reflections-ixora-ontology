package tech.intellispaces.ixora.rdb.transaction;

import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = TransactionDomain.class, target = ArtifactTypes.ObjectAssistant)
public interface TransactionAssistantExtension {

  MovableTransactionHandle current();
}
