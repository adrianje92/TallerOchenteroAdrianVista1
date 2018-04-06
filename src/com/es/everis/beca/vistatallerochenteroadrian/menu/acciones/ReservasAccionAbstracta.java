package com.es.everis.beca.vistatallerochenteroadrian.menu.acciones;

import com.es.everis.beca.tallerochenteroadrian.controller.ReservaController;
import com.es.everis.beca.tallerochenteroadrian.controller.ReservaControllerImpl;

public abstract class ReservasAccionAbstracta extends AccionAbstracta {

  protected ReservaController reservaController;

  public ReservasAccionAbstracta(int selector, String texto) {
    super(selector, texto);
    this.reservaController = new ReservaControllerImpl();
  }

}
