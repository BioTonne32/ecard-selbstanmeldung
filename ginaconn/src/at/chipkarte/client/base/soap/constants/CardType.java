/*
 * S�mtliche Werknutzungs-und Verwertungsrechte an dieser Software liegen beim Hauptverband der �sterreichischen
 * Sozialversicherungstr�ger. Insbesondere ist die Ver�nderung der Software oder einzelner Teile untersagt.
 */
package at.chipkarte.client.base.soap.constants;

/**
 * Konstanten f�r den Kartentyp.
 */
public final class CardType {

  private CardType() {
    // nothing to do
  }
  
  /**
   * Ordinationskarte (Admin-Karte).
   */
  public static final String O_CARD = "o-card";
  /**
   * e-card.
   */
  public static final String E_CARD = "e-card";

  /**
   * Pseudo-e-card.
   */
  public static final String SCHULUNGS_E_CARD = "schulungs-e-card";

}
