package com.es.everis.beca.vistatallerochenteroadrian.menu.acciones;

import java.util.List;

import com.es.everis.beca.vistatallerochenteroadrian.scanners.*;

@SuppressWarnings("unused")
public class AtenderClienteAccion extends ReservasAccionAbstracta {

  public AtenderClienteAccion() {
    super(3, "Atender 	Cliente");
  }

  /**
   * Atender cliente, ha llegado un cliente y nos disponemos a atenderlo:
   *
   *  - Obtener mesas reservadas desde el controlador.
   *  - Desde la entrada de datos, obtener el id de la mesa que nos dice el cliente.
   *  - Obtener la mesa y settear la propiedad is libre a false.
   */
  @Override public void accionar() {
	  
	  //Obtenemos las mesas reservadas desde el controlador
	  //List<Mesa> mesasReservadas = reservaController.getReservas();
	  //System.out.println("Hay " + mesasReservadas.size() + " reservas.");
	  
	  //Pedimos la mesa 
	  Integer idMesa = ScannerNumerico.scan("Indiquenos la mesa que tiene reservada, nosotros comprobaremos si es verdad señor");
	  
	  //llamar a atender mesa que esta en reserva controller
	  //this.reservaController.atenderReserva(idMesa);

  }
}
