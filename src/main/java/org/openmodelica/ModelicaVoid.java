package org.openmodelica;

public class ModelicaVoid implements ModelicaObject {
  public ModelicaVoid(ModelicaObject o) {
  }
  public ModelicaVoid() {
  }

  @Override
  public String toString() {
    return "NULL";
  }

  @Override
  public boolean equals(Object o) {
    return false;
  }

  public void setObject(ModelicaObject o) {
  }

  public void printToBuffer(StringBuffer buffer) {
    buffer.append(toString());
  }
}
