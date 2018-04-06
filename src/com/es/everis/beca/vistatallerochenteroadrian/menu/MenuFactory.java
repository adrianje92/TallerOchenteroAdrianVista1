package com.es.everis.beca.vistatallerochenteroadrian.menu;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.es.everis.beca.vistatallerochenteroadrian.menu.acciones.Accion;
import com.es.everis.beca.vistatallerochenteroadrian.menu.acciones.AtenderClienteAccion;
import com.es.everis.beca.vistatallerochenteroadrian.menu.acciones.ListarReservasAccion;
import com.es.everis.beca.vistatallerochenteroadrian.menu.acciones.ReservarAccion;
import com.es.everis.beca.vistatallerochenteroadrian.menu.acciones.SalirAccion;

public final class MenuFactory {
  private MenuFactory() {}

  public static MenuController getMenu(){
    Set<Accion> acciones = new HashSet<>();
    //acciones.add(new ReservarAccion());
    //acciones.add(new ListarReservasAccion());
    //acciones.add(new AtenderClienteAccion());
    acciones.add(new SalirAccion());
 
    return getMenu(MenuTipos.CONJUNTO, acciones);
  }

  public static MenuController getMenu(Collection<Accion> acciones){
    return getMenu(MenuTipos.CONJUNTO, acciones);
  }

  public static MenuController getMenu(MenuTipos tipo, Collection<Accion> acciones){
    MenuController menu;

    switch (tipo) {
      case LISTA:
        menu = new ListaMenuControllerImpl(acciones);
        break;
      case MAPA:
        menu = new MapaMenuControllerImpl(acciones);
        break;
      case CONJUNTO:
      default:
        menu = new ConjuntoMenuControllerImpl(acciones);
        break;
    }

    return menu;
  }
}
