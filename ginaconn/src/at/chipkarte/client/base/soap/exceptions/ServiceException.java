/*
 * S�mtliche Werknutzungs-und Verwertungsrechte an dieser Software liegen beim Hauptverband der �sterreichischen
 * Sozialversicherungstr�ger. Insbesondere ist die Ver�nderung der Software oder einzelner Teile untersagt.
 */

package at.chipkarte.client.base.soap.exceptions;

import javax.xml.ws.WebFault;

/**
 * Allgemeine Exception. Fehlercodes siehe
 * {@link at.chipkarte.client.base.soap.constants.ServiceExceptionConstants ServiceExceptionConstants}
 */
@WebFault(targetNamespace = "http://exceptions.soap.base.client.chipkarte.at")
public class ServiceException extends Exception {

  private ServiceExceptionContent _faultInfo;
  
  public ServiceExceptionContent getFaultInfo() {
    return _faultInfo;
  }

  public void setFaultInfo(ServiceExceptionContent faultInfo) {
    _faultInfo = faultInfo;
  }

}
