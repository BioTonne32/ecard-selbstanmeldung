/*
 * (C) Siemens and SVCBE 2004
 */

package at.chipkarte.client.base.soap.constants;

/**
 * Fehlerkonstanten f�r fehlende Rechte eines Vertragspartners zur Ausf�hrung bestimmter Funktionen.
 */
public final class AccessExceptionConstants {

  private AccessExceptionConstants() {
    // nothing to do
  }
  
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'KSE.FULL' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_KSE_FULL = 1;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'KSE.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_KSE_CORE = 2;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'ABS.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_ABS_CORE = 3;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'ABS.ARZTBRIEF' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_ABS_ARZTBRIEF = 4;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'ABS.REZEPTUR' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_ABS_REZEPTUR = 5;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'BASE.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_BASE_CORE = 6;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'SAS.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_SAS_CORE = 7;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'VDAS.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_VDAS_CORE = 8;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'DMP.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_DMP_CORE = 9;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'TSV.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_TSV_CORE = 11;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'AUM.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_AUM_CORE = 12;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'VDAS.ANSPRUCH_HISTORISCH' Voraussetzung
   * ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_VDAS_ANSPRUCH_HISTORISCH = 16;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'DBAS.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_DBAS_CORE = 17;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'STS.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_STS_CORE = 18;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'DAS.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_DAS_CORE = 19;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'DBAS.QZK' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_DBAS_QZK = 20;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'SAS.ADRESSABFRAGE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_SAS_ADRESSABFRAGE = 29;

  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'PROP.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_PROP_CORE = 30;
  
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'BKF.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_BKF_CORE = 31;
  
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'BKF.MAMMO' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_BKF_MAMMO = 32;
  
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'BKF.ASSESSMENT' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_BKF_ASSESSMENT = 33;
  
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'EBS.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_EBS_CORE = 34;
  
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'EBS.ANTRAG' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_EBS_ANTRAG = 35;
  
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'EBS.UEBERNAHME' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_EBS_UEBERNAHME = 36;
  
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'BKF.LA_ABFRAGE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_BKF_LA_ABFRAGE = 37;
  
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'BKF.MAMMO' oder 'BKF.ASSESSMENT' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_BKF_MAMMO_OR_ASSESSMENT = 38;
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'ELGATSV.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_ELGATSV_CORE = 39;
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'ELGAAD.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_ELGAAD_CORE = 40;
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'ELGAAD.AUTH' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_ELGAAD_AUTH = 41;
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'ELGAAD.MEDIKATION' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_ELGAAD_MEDIKATION = 42;
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'ELGAAD.BEFUND' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_ELGAAD_BEFUND = 43;
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'FUS.CORE' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_FUS_CORE = 44;
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'FUS.VP' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_FUS_VP = 45;
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'FUS.WP' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_FUS_WP = 46;
  /**
   * Diese Exception tritt auf, wenn eine Funktion aufgerufen wird, f�r die das Recht 'FUS.EK' Voraussetzung ist. <br>
   * ORCLI-Code: CL-A0005
   */
  public static final int MISSING_FUS_EK = 47;
  
}
