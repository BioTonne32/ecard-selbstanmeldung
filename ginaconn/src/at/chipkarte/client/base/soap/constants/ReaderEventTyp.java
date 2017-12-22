/*
 * S�mtliche Werknutzungs-und Verwertungsrechte an dieser Software liegen beim Hauptverband der �sterreichischen
 * Sozialversicherungstr�ger. Insbesondere ist die Ver�nderung der Software oder einzelner Teile untersagt.
 */
package at.chipkarte.client.base.soap.constants;

/**
 * Konstanten f�r den Event-Typ von Kartenleser-Events.
 */
public final class ReaderEventTyp {

  private ReaderEventTyp() {
    // nothing to do
  }
  
  /**
   * �bermittlung der Gesamtliste, da keine Deltalistenberechnung m�glich (1ter Aufruf) oder
   * gew�nscht (<i>Handle</i> nicht �bergeben).
   */
  public static final String INITIAL_EVENT = "INITIAL_EVENT";

  /**
   * Ein neuer Kartenleser wurde im System erkannt.
   */
  public static final String ADD_EVENT = "ADD_EVENT";

  /**
   * Ein Kartenleser wurde vom System entfernt.
   */
  public static final String REMOVE_EVENT = "REMOVE_EVENT";

  /**
   * Der Status eines Kartenlesers hat sich ver�ndert.
   */
  public static final String READER_STATUS_CHANGE_EVENT = "READER_STATUS_CHANGE_EVENT";

  /**
   * Es wurde erkannt, dass seit dem letzten Aufruf ein Neustart der GINA 
   * oder ein Failover auf eine andere GINA stattgefunden hat.
   * Es k�nnen zu diesem Zeitpunkt keine �nderungen des Kartenleserstatus zur�ckgegeben werden. 
   * In diesem Fall findet f�r die
   * Kartenleser die �bermittlung der aktuellen Kartenleserstatus statt. <br>
   * Kann nur auftreten wenn der <i>Handle</i> als Eingangsparameter �bergeben wurde.
   */
  public static final String SERVER_RESTART_EVENT = "SERVER_RESTART_EVENT";

}
