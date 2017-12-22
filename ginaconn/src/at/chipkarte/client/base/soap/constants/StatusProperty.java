/*
 * S�mtliche Werknutzungs-und Verwertungsrechte an dieser Software liegen beim Hauptverband der 
 * �sterreichischen Sozialversicherungstr�ger. 
 * Insbesondere ist die Ver�nderung der Software oder einzelner Teile untersagt.
 */
package at.chipkarte.client.base.soap.constants;

/**
 * Konstanten f�r Key-Werte einer Property zu Status-Werte und Informationen des Ordinationsclient.  
 */
public final class StatusProperty {

  private StatusProperty() {
    // nothing to do
  }
  
  /**
   * Key f�r den Verbindungsstatus des Ordinationsclient (des Service). 
   * <br>Value: "ONLINE" bzw. "OFFLINE", siehe auch die entsprechenden Werte in {@link Modus Modus}.
   */
  public static final String SERVICE_STATE = "SERVICESTATE";

  /**
   * Key f�r den Benachrichtigungsstatus des e-card-Systems. Dieser Key gibt an, 
   * ob eine neue Nachricht im Messaging-System vorhanden ist. 
   * <br>Value: "NEW", eine neue Nachricht liegt vor und kann �ber die Funktion
   * {@link at.chipkarte.client.base.soap.IBaseService#getMessages getMessages} abgeholt werden.
   */
  public static final String MESSAGE_FLAG = "MESSAGE_FLAG";

}
