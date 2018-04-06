package com.es.everis.beca.vistatallerochenteroadrian;

import com.es.everis.beca.vistatallerochenteroadrian.menu.MenuFactory;
import com.es.everis.beca.vistatallerochenteroadrian.menu.MenuTipos;
import com.es.everis.beca.vistatallerochenteroadrian.menu.acciones.Accion;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase inicializadora de la aplicacion.
 */
@SuppressWarnings("unused")
public class LanzadorTaller {

  /**
   * Punto de entrada a la aplicacion.
   *
   * @param args argumentos de entrada
   */
  public static void main(String[] args) {
    LanzadorTaller app = new LanzadorTaller();
    app.iniciar();
  }

  private void iniciar() {
    System.out.println("Les doy la bienvenida al software de gestion de Talleres");
    MenuFactory.getMenu().mostrarMenu();
  }




}
