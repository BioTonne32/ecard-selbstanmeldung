/*
 * S�mtliche Werknutzungs-und Verwertungsrechte an dieser Software liegen beim Hauptverband der 
 * �sterreichischen Sozialversicherungstr�ger. 
 * Insbesondere ist die Ver�nderung der Software oder einzelner Teile untersagt.
 */
package at.chipkarte.client.base.soap.constants;

/**
 * Fehlerkonstanten f�r Fehler im Zusammenhang mit dem aktuellen Dialog.
 * 
 * @ecardOk rule=ConstantNameCheck changing constant names on the SS12 interface is not advisable
 */

public final class DialogExceptionConstants {

  private DialogExceptionConstants() {
    // nothing to do
  }
  
  /**
   * Die angegebene Dialog-Id ist ung�ltig. 
   * <br>Der Dialog wurde nicht erfolgreich aufgebaut, eine falsche Dialog-Id wurde angegeben,
   * eine �berschreitung der Timeout-Zeit des Dialogs ist eingetreten bzw. wurde der Dialog nicht mit Failover aufgebaut,
   * eine Funktion aber im Failover-Fall mit Failover-Information aufgerufen. 
   * <br>ORCLI-Code: CL-01085
   */

  public static final int DIALOG_INVALID = 1;


  /**
   * Die angegebene Dialog-Id ist nicht mehr g�ltig. 
   * <br>Die Timeout-Zeit des Dialogs wurde �berschritten. Es muss ein neuer Dialog
   * aufgebaut werden. 
   * <br>ORCLI-Code: ZS-10001, ZS-10004, CL-00267
   */

  public static final int DIALOG_TIMEOUT = 2;


  /**
   * Die angegebene Dialog-Id ist nicht mehr g�ltig. 
   * <br>Aufgrund einer St�rung wurde der 
   * Dialog beendet und muss neu aufgebaut werden.  
   * <br>ORCLI-Code: ZS-10002
   */
  public static final int DIALOG_CANCELED = 3;

  /**
   * Die zur Authentifizierung verwendete Signatur wird vom e-card-Server nicht akzeptiert.  
   * <br>ORCLI-Code: CL-00020 (ZS-00043)
   * 
   */
  public static final int SIGNATURE_INVALID = 4;

  /**
   * Die zur Authentifizierung verwendete o-card ist am e-card-Serversystem gesperrt.  
   * <br>ORCLI-Code: CL-00020 (ZS-00044)
   * 
   */
  public static final int OCARD_INVALID = 5;

  /**
   * Die gew�hlte Ordination und/oder der T�tigkeitsbereich sind nicht (mehr) g�ltig. 
   * <br>ORCLI-Code: CL-A0046, ZS-00089
   * 
   */
  public static final int ORDINATION_ID_INVALID = 6;

  /**
   * Der letzte Schritt des Dialogaufbaus (Setzen einer Ordination und eines T�tigkeitsbereichs) wurde nicht ausgef�hrt. 
   * <br>ORCLI-Code: CL-A0044
   */
  public static final int ORDINATION_ID_NOTSET = 7;

  /**
   * Es sind zu viele offene Dialoge f�r diesen Vertragspartner am e-card-Serversystem ge�ffnet.
   * <br>ORCLI-Code: ZS-10003
   */
  public static final int TOO_MANY_OPEN_DIALOGS_FOR_VP = 8;

  /**
   * 
   * Es sind zu viele offene Dialoge auf diesem Ordinationsclient ge�ffnet.
   * <br>ORCLI-Code: CL-00003
   */
  public static final int TOO_MANY_OPEN_DIALOGS_FOR_OR_CLI = 9;

  /**
   * Der Dialog wurde noch nicht erfolgreich authentifiziert.
   * <br>ORCLI-Code: CL-A0008 
   */
  public static final int DIALOG_NOT_AUTHENTICATED = 10;

  /**
   * Der letzte Schritt des Dialogaufbaus (Setzen einer Ordination und eines T�tigkeitsbereichs) wurde bereits ausgef�hrt. 
   * <br>ORCLI-Code: CL-A0045 
   */
  public static final int ADDRESS_ALREADY_SET = 12;

  /**
   * Der angegebene Dialog wurde bereits authentifiziert.
   * <br>ORCLI-Code: CL-A0011
   */
  public static final int DIALOG_ALREADY_AUTHENTICATED = 13;

  /**
   * Der Dialog ist ung�ltig (es ist ein Wechsel vom Offline- zum Online-Modus
   * erfolgt). 
   * <br>Im Fall, dass
   * der Dialog offline aufgebaut wurde ist eine Neuanmeldung erforderlich, um Services, die im
   * Offline-Modus nicht zur Verf�gung stehen, nutzen zu k�nnen.
   * <br>ORCLI-Code: CL-A0012
   */
  public static final int DIALOG_OFFLINE_MODUS_CHANGED_ONLINE = 14;

  /**
   * Die ausgew�hlte Funktion ist im Online-Modus nicht erlaubt.
   * <br>ORCLI-Code: CL-A0013
   */
  public static final int FUNCTION_NOT_ALLOWED_IN_ONLINE_MODE = 15;

  /**
   * Die angegebene <i>OrdinationId</i> entspricht keiner g�ltigen Nachfolge-Ordination.
   * <br>ORCLI-Code: CL-A0014, ZS-00047
   */
  public static final int NACHFOLGE_ORDID_NOTFOUND = 17;

  /**
   * Es wurde von diesem Vertragspartner noch kein Dialog aufgebaut, deshalb ist keine Anmeldung im Offline-Modus m�glich.
   * <br>ORCLI-Code: CL-00196
   */
  public static final int DIALOG_NOT_CREATED_BEFORE = 18;

  /**
   * Der angegebene Fachgebietscode ist ung�ltig.
   * <br>ORCLI-Code: CL-A0015
   */
  public static final int INVALID_FG = 19;

  /**
   * Die angegebene Produkt-Information ist ung�ltig. 
   * <br>ORCLI-Code: CL-A0016
   */
  public static final int PRODUKTINFO_INVALID = 20;

  /** 
   * Die angegebene ext-UID ist ung�ltig.
   * <br>ORCLI-Code: CL-A0035
   */
  public static final int EXT_UID_INVALID = 21;

  /** 
   * Die angegebene Vertragspartnernummer hat ein ung�ltiges Format.
   * <br>ORCLI-Code: CL-A0041
   */
  public static final int INVALID_VPNR_FORMAT = 24;

  /**
   * Das zur Authentifizierung verwendete Software-Zertifikat oder die Vertragspartnernummer ist unbekannt,  
   * das Software-Zertifikat ist am e-card-Serversystem keiner Vertragspartnernummer zugeordnet,
   * das Software-Zertifikat ist gesperrt oder abgelaufen, das Software-Zertifikat ist semantisch ung�ltig 
   * oder die Pr�fung des Signaturformats ist fehlgeschlagen. 
   * <br>ORCLI-Code: ZS-10008, ZS-10009, ZS-10012, ZS-10015, CL-00272, CL-00274, CL-00280
   */
  public static final int INVALID_CERTIFICATE = 25;

  /** 
   * Die zur Dialogerzeugung verwendeten Parameter sind unzul�ssig:
   * <i>CardReaderId</i> und <i>VpNummer</i> d�rfen nicht gleichzeitig gesetzt sein.
   * <br>ORCLI-Code: CL-A0042
   */
  public static final int INVALID_PARAMETER_COMBINATION = 26;

  /**
   * Es wurde ein Failover versucht, aber die angegebene Dialog-Id ist am Server nicht bekannt. 
   * <br>Der Dialog wurde entweder noch nicht authentifiziert und die Ordinationsadresse noch nicht 
   * gesetzt oder es handelt sich um eine falsche Dialog-Id. Der Dialogaufbau muss erneut erfolgen.
   * <br>ORCLI-Code: ZS-10007
   */
  public static final int DIALOG_UNKNOWN = 27;

  /**
   * Es wurde ein Failover versucht und die Session zur angegebenen Dialog-Id am Server gefunden, 
   * nicht aber die zugeordnete Ordinationsadresse. Der Dialogaufbau muss erneut erfolgen.
   * <br>ORCLI-Code: ZS-10010
   */
  public static final int ORDINATION_ID_UNKNOWN = 28;

  /**
   * Es wurde ein Dialog mit Failover-Support aufgebaut und eine Dialog-Id erzeugt, 
   * die am e-card-Server bereits existiert.
   * <br>ORCLI-Code: ZS-10011
   */
  public static final int DIALOG_ID_ALREADY_EXISTS = 29;

  /**
   * Die vom externen System generierte <i>TransactionId</i> ist ung�ltig. 
   * <br>M�gliche Gr�nde: 
   * <ul>
   * <li>formale Angabefehler aufgrund <code>Null</code>- oder Leerstringangabe bzw. der Angabe 
   * einer zu langen <i>TransactionId</i> (max. 100 Zeichen) oder</li>
   * <li> 
   * technische Fehler aufgrund der Verwendung einer <i>TransactionId</i> die zuvor bereits bei einer 
   * anderen Methode (andere Funktion) verwendet wurde bzw. ist bereits die m�gliche Zeitspanne verstrichen, in der 
   * die Funktion erneut mit derselben <i>TransactionId</i> aufgerufen werden kann (Redo/Request-Wiederholung).</li>
   * <ul>
   * <br>ORCLI-Code: CL-00256, ZS-10013, ZS-10014
   */
  public static final int INVALID_TRANSACTION_ID = 30;

  /**
   * Es wurde eine Funktion mit Kartenleserzugriff aufgerufen, 
   * aber zuvor beziehungsweise in der Funktion kein Kartenleser zugeordnet/�bergeben.
   * <br>ORCLI-Code: CL-00255
   */
  public static final int NO_CARD_READER = 33;

  /**
   * Es wurde eine Authentifizierung mit Software-Zertifikat versucht, wobei die in der Funktion angegebene Dialog-Id nicht 
   * mit der Dialog-Id der Software-Signatur �bereinstimmt.
   * <br>ORCLI-Code: ZS-10016
   */
  public static final int DIALOG_ID_MISMATCH = 35;

  /**
   * Es wurde keine Signatur �bergeben.
   * <br>ORCLI-Code: CL-00261
   */
  public static final int NO_SIGNATURE = 36;

  /**
   * Es wurde bei der Dialogerzeugung keine Vertragspartnernummer angegeben, daher ist die 
   * Authentifizierung mit Software-Zertifikat nicht m�glich.
   * <br>ORCLI-Code: CL-00262
   */
  public static final int NO_VPNR_NUMBER = 37;

  /**
   * Die �bergebene Dialog-Id wurde vom System als korrupt erkannt.
   * <br>ORCLI-Code: ZS-10017
   */
  public static final int CORRUPT_DIALOGID = 38;
  
  /**
   * Es wurde der Dialog mit Nachrichten-Push-Mechanismus aufgebaut, daher ist der Nachrichten-Poll-Mechanismus nicht m�glich. 
   * <br>ORCLI-Code: CL-00263, ZS-10019
   */
  public static final int POLLMSG_NOT_ALLOWED = 39;
  
  /**
   * Es wurde der Dialog mit Nachrichten-Poll-Mechanismus aufgebaut, daher ist der Nachrichten-Push-Mechanismus nicht m�glich. 
   * <br>ORCLI-Code: CL-00264, ZS-10018
   */
  public static final int PUSHMSG_NOT_ALLOWED = 40;

  /**
   * Das zur Authentifizierung verwendete Software-Zertifikat stimmt nicht mit jenem der Anmeldung �berein. 
   * <br>ORCLI-Code: ZS-10024
   */
  public static final int CERTIFICATE_MISMATCH = 41;
  
  /**
   * Der Request enth�lt keine oder ung�ltig formatierte Zeitstempel. 
   * <br>ORCLI-Code: CL-00277, ZS-10026
   */
  public static final int CERTIFICATE_TIMESTAMPS_INVALID = 42;
  
  /**
   * Der im Request angegebene G�ltigkeitszeitraum (Zeitraum zwischen Timestamp <i>Created</i> und Timestamp <i>Expires</i>) ist zu gro� gew�hlt. 
   * <br>ORCLI-Code: CL-00278, ZS-10027
   */
  public static final int CERTIFICATE_TIMESTAMP_INTERVAL_INVALID = 43;
  
  /**
   * Der Request ist laut Zeitstempel zum aktuellen Zeitpunkt ung�ltig. 
   * <br>ORCLI-Code: CL-00279, ZS-10028
   */
  public static final int CERTIFICATE_REQUEST_OUT_OF_DATE = 44;
  
  /**
   * Die Daten des mit Software-Zertifikat signierten Requests stimmen nicht mit den Parametern der Anfrage �berein. 
   * <br>ORCLI-Code: ZS-10025
   */
  public static final int PARAMETER_MISMATCH_EXCEPTION = 45;
  
  /**
   * Es ist ein Problem bei der Verwendung des Software-Zertifikats im Offline-Modus zur Authentifizierung 
   * oder Signierung eines Requests aufgetreten. 
   * <br>M�gliche Gr�nde:
   * <ul>
   *    <li>Es ist kein Software-Zertifikat am Client vorhanden.</li> 
   *    <li>Das Software-Zertifikat am Client ist defekt.</li>
   *    <li>Das Software-Zertifikat ist abgelaufen.</li>
   * </ul>
   * ORCLI-Code: CL-00273, CL-00275, CL-00276
   */
  public static final int CERTIFICATE_PROBLEM_OCARD_DIALOG_REQUIRED = 46;
  
  /**
   * Die gesteckte Karte ist nicht zul�ssig f�r diese GINA. 
   * <br>ORCLI-Code: CL-00284
   */
  public static final int OCARD_GINA_MISMATCH = 48;
  
  /**
   * <u>Warnung:</u> Es sind noch nicht �bertragene Offline-Datens�tze f�r ihre alte Ordinationsadresse vorhanden! 
   * <br>ORCLI-Code: CL-00144
   */
  public static final int UEBERSIEDELN_OFFLINEDATA_DETECTED = 49;

  /**
   * Der angegebene Suchzeitpunkt ist ung�ltig. 
   * <br>ORCLI-Code: CL-00266
   */
  public static final int SUCHZEITPUNKT_INVALID = 50;
  
  /**
   * Der zur Erstellung der Software-Zertifikat-Signatur verwendete Algorithmus ist nicht zul�ssig. 
   * <br>ORCLI-Code: CL-00288, ZS-10030
   */
  public static final int CERTIFICATE_SIGNATURE_ALGORITHM_INVALID = 51;
  
  /**
   * Das Format von ELGA-Rolle ist ung�ltig.
   * <br>ORCLI-Code: CL-00290
   */
  public static final int ELGAROLLE_WRONG_FORMAT = 52;
  
  /**
   * GDAMA oder Prozess d�rfen nur angegeben werden, wenn auch eine ELGA-Rolle versorgt wurde.
   * <br>ORCLI-Code: CL-00291
   */
  public static final int GDAMA_OR_PROZESS_WITHOUT_ELGAROLLE_NOT_ALLOWED = 53;

  /**
   * Das Format von Titel vorne ist ung�ltig.
   * <br>ORCLI-Code: CL-00292
   */
  public static final int GDAMA_TITEL_VORNE_WRONG_FORMAT = 54;
  
  /**
   * Das Format von Vorname ist ung�ltig.
   * <br>ORCLI-Code: CL-00293
   */
  public static final int GDAMA_VORNAME_WRONG_FORMAT = 55;
  
  /**
   * Das Format von Nachname ist ung�ltig.
   * <br>ORCLI-Code: CL-00294
   */
  public static final int GDAMA_NACHNAME_WRONG_FORMAT = 56;
  
  /**
   * Das Format von Titel hinten ist ung�ltig.
   * <br>ORCLI-Code: CL-00295
   */
  public static final int GDAMA_TITEL_HINTEN_WRONG_FORMAT = 57;
  
  /**
   * Bei Angabe von GDA-MA m�ssen Vorname und Nachname angegeben werden.
   * <br>ORCLI-Code: CL-00296
   */
  public static final int GDAMA_VORNAME_NACHNAME_REQUIRED = 58;
  
  /**
   * Der Wert in ELGA-Rolle ist ung�ltig.
   * <br>ORCLI-Code: ZS-00159
   */
  public static final int ELGAROLLE_INVALID = 59;
  
  /**
   * Das Format von Zusatzinfo ist ung�ltig.
   * <br>ORCLI-Code: CL-00297
   */
  public static final int GDAMA_ZUSATZINFO_WRONG_FORMAT = 60;
  
  /**
   * Das Format von Prozess ist ung�ltig.
   * <br>ORCLI-Code: CL-00298
   */
  public static final int PROZESS_WRONG_FORMAT = 61;
  
  /**
   * Entweder GDAMA oder Prozess muss angegeben werden, da eine ELGA-Rolle versorgt wurde.
   * <br>ORCLI-Code: CL-00299
   */
  public static final int GDAMA_OR_PROZESS_REQUIRED = 62;

  
}