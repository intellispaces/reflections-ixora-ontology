package tech.intellispaces.jaquarius.ixora.data.collection;

import tech.intellispaces.ixora.data.collection.ListDomain;
import tech.intellispaces.jaquarius.annotation.Preprocessing;

@Preprocessing(value = ListDomain.class, artifact = "UndefinedPureObject", type = "addon")
public interface ListAddOn<E> {

  java.util.List<E> nativeList();
}
