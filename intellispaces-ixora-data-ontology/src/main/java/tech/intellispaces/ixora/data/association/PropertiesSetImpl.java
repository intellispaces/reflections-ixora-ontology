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
  public @Nullable Object propertyValue(String name) {
    throw NotImplementedExceptions.withCode("9dphudX7");
  }

  @Override
  public List<PropertiesSet> subProperties() {
    throw NotImplementedExceptions.withCode("hraVAtcS");
  }

  @Override
  public boolean hasTraversePath(String... path) {
    throw NotImplementedExceptions.withCode("9G1JBgCq");
  }

  @Override
  public boolean traverseTargetIsSpecified(String name) {
    throw NotImplementedExceptions.withCode("beT0Dygs");
  }

  @Override
  public boolean traverseTargetIsString(String... path) {
    throw NotImplementedExceptions.withCode("WKsDJJxt");
  }

  @Override
  public boolean traverseTargetIsStringCompatible(String... path) {
    throw NotImplementedExceptions.withCode("ZzeR2tno");
  }

  @Override
  public boolean traverseTargetIsProperties(String... path) {
    throw NotImplementedExceptions.withCode("OtW44AcR");
  }

  @Override
  public boolean traverseTargetIsPropertiesCompatible(String... path) {
    throw NotImplementedExceptions.withCode("374N4goM");
  }

  @Override
  public @Nullable Object traverse(String... path) {
    throw NotImplementedExceptions.withCode("zS7tO1Ll");
  }

  @Override
  public @Nullable Integer traverseToInteger(String... path) {
    throw NotImplementedExceptions.withCode("TMLH7jip");
  }

  @Override
  public @Nullable Integer traverseAndCastToInteger(String... path) {
    throw NotImplementedExceptions.withCode("nRyKI4DZ");
  }

  @Override
  public @Nullable Double traverseToDouble(String... path) {
    throw NotImplementedExceptions.withCode("uOPXq9Jp");
  }

  @Override
  public @Nullable Double traverseAndCastToDouble(String... path) {
    throw NotImplementedExceptions.withCode("uD3VtADT");
  }

  @Override
  public @Nullable String traverseToString(String... path) {
    throw NotImplementedExceptions.withCode("T1OU8wrJ");
  }

  @Override
  public @Nullable String traverseToString(String[] headPath, String... tailPath) {
    throw NotImplementedExceptions.withCode("vrxoFxKJ");
  }

  @Override
  public String traverseToStringOrThrow(String... path) {
    throw NotImplementedExceptions.withCode("mnK4Sfqr");
  }

  @Override
  public @Nullable String traverseAndCastToString(String... path) {
    throw NotImplementedExceptions.withCode("3usXpBbq");
  }

  @Override
  public @Nullable PropertiesSet traverseToProperties(String... path) {
    throw NotImplementedExceptions.withCode("PjOGBgio");
  }

  @Override
  public PropertiesSet traverseToPropertiesOrThrow(String... path) {
    throw NotImplementedExceptions.withCode("3y0vZA9h");
  }

  @Override
  public @Nullable PropertiesSet traverseAndCastToProperties(String... path) {
    throw NotImplementedExceptions.withCode("bGZut18Z");
  }

  @Override
  public @Nullable List<Integer> traverseToIntegerList(String... path) {
    throw NotImplementedExceptions.withCode("TpY81jvs");
  }

  @Override
  public @Nullable List<Integer> traverseAndCastToIntegerList(String... path) {
    throw NotImplementedExceptions.withCode("zuXJbJJ6");
  }

  @Override
  public @Nullable List<Double> traverseToDoubleList(String... path) {
    throw NotImplementedExceptions.withCode("ALhZf3PY");
  }

  @Override
  public @Nullable List<Double> traverseAndCastToDoubleList(String... path) {
    throw NotImplementedExceptions.withCode("Bqy5auTW");
  }

  @Override
  public @Nullable List<String> traverseToStringList(String... path) {
    throw NotImplementedExceptions.withCode("ydWCWzUc");
  }

  @Override
  public @Nullable List<String> traverseAndCastToStringList(String... path) {
    throw NotImplementedExceptions.withCode("ljuezNZF");
  }

  @Override
  public @Nullable List<PropertiesSet> traverseToPropertiesList(String... path) {
    throw NotImplementedExceptions.withCode("SyqO9VMt");
  }

  @Override
  public @Nullable List<PropertiesSet> traverseToPropertiesList(
      String[] headPath, String... tailPath
  ) {
    throw NotImplementedExceptions.withCode("49yaFNcu");
  }

  @Override
  public @Nullable List<PropertiesSet> traverseAndCastToPropertiesList(
      String... path
  ) {
    throw NotImplementedExceptions.withCode("XvxvAjkm");
  }
}
