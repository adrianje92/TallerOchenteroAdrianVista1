package com.es.everis.beca.vistatallerochenteroadrian.menu.acciones;

import com.es.everis.beca.tallerochenteroadrian.modelo.Persona;
import com.es.everis.beca.vistatallerochenteroadrian.scanners.ScannerCoches;
import com.es.everis.beca.vistatallerochenteroadrian.scanners.ScannerPersona;

public class ReservarAccion extends ReservasAccionAbstracta {

  public ReservarAccion() {
    super(1, "Generar Cita");
  }

  @Override public void accionar() {
//    if (!reservaController.hayMesasLibres()) {
//      System.out.println("No hay mesas libres, no se puede reservar.");
//    }
    ScannerPersona scannerPersona = new ScannerPersona();
    Persona persona = scannerPersona.scan();

    ScannerCoches scannerCoches = new ScannerCoches();
    int numCoches = scannerCoches.scan();

//    ScannerMesa scannerMesa = new ScannerMesa();
//    Mesa mesaAReservar = scannerMesa.scan();

//    if (mesaAReservar == null) {
//      System.out.println("No hay mesas libres, no se puede reservar.");
//    } else {
//      Mesa mesaReservada =
//          reservaController.reservar(mesaAReservar, persona, numComensales);
//      if (mesaReservada == null) {
//        System.err.println("No se ha accionar la reserva.");
//      } else {
//        System.out.println(mesaReservada.getReservaDesc());
//      }
//    }
  }
}
