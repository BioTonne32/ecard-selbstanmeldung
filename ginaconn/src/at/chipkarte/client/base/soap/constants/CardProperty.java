/*
 * S�mtliche Werknutzungs-und Verwertungsrechte an dieser Software liegen beim Hauptverband der 
 * �sterreichischen Sozialversicherungstr�ger. 
 * Insbesondere ist die Ver�nderung der Software oder einzelner Teile untersagt.
 */
package at.chipkarte.client.base.soap.constants;

/**
 * Konstanten f�r Key-Werte einer Property f�r erweiterte Kartendaten. 
 */
public final class CardProperty {

  private CardProperty() {
    // nothing to do
  }
  
  /**
   * Key f�r den Namen des EKVK-Versicherungstr�gers.<br>
   */
  public static final String EKVK_TRAEGER_NAME = "EKVK_TRAEGER_NAME";
  /**
   * Key f�r die EKVK-Nummer des Versicherungstr�gers.<br>
   */
  public static final String EKVK_TRAEGER_NUMMER = "EKVK_TRAEGER_NUMMER";
  /**
   * Key f�r das Verfallsdatum der G�ltigkeit der EKVK f�r den Versicherungstr�ger.<br>
   */
  public static final String EKVK_VERFALLSDATUM = "EKVK_VERFALLSDATUM";

}
