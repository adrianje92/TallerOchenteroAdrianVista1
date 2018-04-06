package com.es.everis.beca.vistatallerochenteroadrian.menu.acciones;

public class SalirAccion extends AccionAbstracta {

  public SalirAccion() {
    super(99, "Salir");
  }

  @Override
  public void accionar() {
    System.exit(0);
  }
}
