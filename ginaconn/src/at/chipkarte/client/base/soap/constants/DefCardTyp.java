/*
 * S�mtliche Werknutzungs-und Verwertungsrechte an dieser Software liegen beim Hauptverband der �sterreichischen
 * Sozialversicherungstr�ger. Insbesondere ist die Ver�nderung der Software oder einzelner Teile untersagt.
 */

package at.chipkarte.client.base.soap.constants;

/**
 * Konstanten f�r den Kartentyp bei Kartenleserstatus-Events.
 */
public final class DefCardTyp {

  private DefCardTyp() {
    // nothing to do
  }
  
  /**
   * e-card.
   */
  public static final String ECARD_TEXT = "e-card";
  /**
   * Ordinationskarte (Admin-Karte).
   */
  public static final String OCARD_TEXT = "o-card (Ordinationskarte)";
  /**
   * Pseudo-e-card.
   */
  public static final String ECARD_SCHULUNG_TEXT = "schulungs-e-card (e-card f�r die Schulung)";
  /**
   * Unbekannte Karte.
   */
  public static final String UNKNOWN_CARD_TEXT = "unbekannte Karte";
  /**
   * Keine Karte.
   */
  public static final String EMPTY_CARD_TEXT = "";

}
