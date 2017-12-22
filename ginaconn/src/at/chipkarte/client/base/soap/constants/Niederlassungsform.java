/*
 * S�mtliche Werknutzungs-und Verwertungsrechte an dieser Software liegen beim Hauptverband der �sterreichischen
 * Sozialversicherungstr�ger. Insbesondere ist die Ver�nderung der Software oder einzelner Teile untersagt.
 */
package at.chipkarte.client.base.soap.constants;

/**
 * Konstanten f�r Niederlassungsform.
 */
public final class Niederlassungsform {

  private Niederlassungsform() {
    // nothing to do
  }
  
  /**
   * Niedergelassener Arzt.
   */
  public static final String ARZT = "01";
  /**
   * Selbstst�ndige Ambulanz nach dem KAG.
   */
  public static final String AMBULANZ = "02";
  /**
   * Gruppenpraxen (Gesellschaft mit Rechtspers�nlichkeit).
   */
  public static final String GRUPPEN_PRAXEN = "03";
  /**
   * Krankenanstalt.
   */
  public static final String KRANKENANSTALT = "04";
  /**
   * Sonstige.
   */
  public static final String SONSTIG = "99";

}
