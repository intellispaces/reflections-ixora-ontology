package tech.intellispaces.ixora.data.association;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import tech.intellispaces.commons.exception.NotImplementedExceptions;
import tech.intellispaces.commons.properties.PropertiesSet;

class PropertiesSetImpl implements PropertiesSet {
  private final tech.intellispaces.ixora.data.association.PropertiesSet reflection;

  PropertiesSetImpl(tech.intellispaces.ixora.data.association.PropertiesSet reflection) {
    this.reflection = reflection;
  }

  @Override
  public @Nullable String name() {
    throw NotImplementedExceptions.withCode("ZfxufUQK");
  }

  @Override
  public List<String> path() {
    throw NotImplementedExceptions.withCode("tQSUcptm");
  }

  @Override
  public String delimiter() {
    throw NotImplementedExceptions.withCode("T3RcddiB");
  }

  @Override
  public int size() {
    return reflection.size();
  }

  @Override
  public List<String> propertiesNames() {
    throw NotImplementedExceptions.withCode("tAxUqNLA");
  }

  @Override
  public boolean hasProperty(String name) {
    throw NotImplementedExceptions.withCode("kLqAvdQp");
  }

  @Override
  public boolean hasValue(String name) {
    throw NotImplementedExceptions.withCode("CWvkEA");
  }

  @Override
  public @Nullable Object getValue(String name) {
    throw NotImplementedExceptions.withCode("9dphudX7");
  }

  @Override
  public @Nullable String getString(String name) {
    throw NotImplementedExceptions.withCode("srafOw");
  }

  @Override
  public List<PropertiesSet> subProperties() {
    throw NotImplementedExceptions.withCode("hraVAtcS");
  }
}
