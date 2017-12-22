/*
 * S�mtliche Werknutzungs-und Verwertungsrechte an dieser Software liegen beim Hauptverband der �sterreichischen
 * Sozialversicherungstr�ger. Insbesondere ist die Ver�nderung der Software oder einzelner Teile untersagt.
 */
package at.chipkarte.client.base.soap.constants;



/**
 * Konstanten der Versichertenkategorie.
 */
public final class Versichertenkategorie {

  /**
   * Erwerbst�tige, Arbeitslose, Selbstversicherte, Zivildiener, Asylanten, Fl�chtlinge, Mindestsicherungsbezieher.
   */
  public static final String ERWERBSTAETIGER = "01";

  /**
   * Pensionisten, Ruhegenussempf�nger.
   */
  public static final String PENSIONISTEN = "05";

  /**
   * Kriegshinterbliebene.
   */
  public static final String KRIEGSHINTERBLIEBENE = "07";

  /**
   * Zugeteilt nach OFG.
   */
  public static final String ZUGETEILT_OFG = "20";

  /**
   * Zugeteilt nach KOVG, HVG.
   */
  public static final String ZUGETEILT_KOVG_HVG = "21";

  /**
   * Zugeteilt nach KOVG-D.
   */
  public static final String ZUGETEILT_KOVG_D = "22";

  /**
   * Zugeteilt nach VOG.
   */
  public static final String ZUGETEILT_VOG = "24";

  /**
   * Fremdstaaten (De-facto-Versicherte).
   */
  public static final String FREMDSTAATEN = "29";

  private Versichertenkategorie() {
  }

}
