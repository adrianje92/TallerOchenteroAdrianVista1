package com.es.everis.beca.vistatallerochenteroadrian.scanners;

/**
 * La clase ScannerComensales escanea el numero de coches a través de System.in.
 */
public class ScannerCoches {
  
  /**
   * Escanea el numero de coches.
   *
   * @return numero de coches
   */
  public int scan() {
    return ScannerNumerico.scan("Introduzca el numero de coches a reparar: ");
  }
}
