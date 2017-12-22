/*
 * S�mtliche Werknutzungs-und Verwertungsrechte an dieser Software liegen beim Hauptverband der �sterreichischen
 * Sozialversicherungstr�ger. Insbesondere ist die Ver�nderung der Software oder einzelner Teile untersagt.
 */
package at.chipkarte.client.base.soap.constants;

/**
 * Konstanten f�r den Verbindungszustand des Ordinationsclient.
 */
public final class Modus {

  private Modus() {
    // nothing to do
  }
  
  /**
   * Der Wert f�r den Online-Modus des Ordinationsclient.
   */
  public static final String ONLINE = "ONLINE";

  /**
   * Der Wert f�r den Offline-Modus des Ordinationsclient. 
   * <br>Anmerkung: Der Modus wird auch Offline gesetzt, wenn ein Service nicht
   * konfiguriert ist.
   */
  public static final String OFFLINE = "OFFLINE";

}
