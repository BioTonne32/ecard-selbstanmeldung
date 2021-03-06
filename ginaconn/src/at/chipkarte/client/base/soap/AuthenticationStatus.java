/**
 * AuthenticationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package at.chipkarte.client.base.soap;

public class AuthenticationStatus  implements java.io.Serializable {
    private java.lang.Integer failedLoginAttempts;

    private java.lang.Integer failedPINAttempts;

    private java.lang.String lastLoginDate;

    public AuthenticationStatus() {
    }

    public AuthenticationStatus(
           java.lang.Integer failedLoginAttempts,
           java.lang.Integer failedPINAttempts,
           java.lang.String lastLoginDate) {
           this.failedLoginAttempts = failedLoginAttempts;
           this.failedPINAttempts = failedPINAttempts;
           this.lastLoginDate = lastLoginDate;
    }


    /**
     * Gets the failedLoginAttempts value for this AuthenticationStatus.
     * 
     * @return failedLoginAttempts
     */
    public java.lang.Integer getFailedLoginAttempts() {
        return failedLoginAttempts;
    }


    /**
     * Sets the failedLoginAttempts value for this AuthenticationStatus.
     * 
     * @param failedLoginAttempts
     */
    public void setFailedLoginAttempts(java.lang.Integer failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }


    /**
     * Gets the failedPINAttempts value for this AuthenticationStatus.
     * 
     * @return failedPINAttempts
     */
    public java.lang.Integer getFailedPINAttempts() {
        return failedPINAttempts;
    }


    /**
     * Sets the failedPINAttempts value for this AuthenticationStatus.
     * 
     * @param failedPINAttempts
     */
    public void setFailedPINAttempts(java.lang.Integer failedPINAttempts) {
        this.failedPINAttempts = failedPINAttempts;
    }


    /**
     * Gets the lastLoginDate value for this AuthenticationStatus.
     * 
     * @return lastLoginDate
     */
    public java.lang.String getLastLoginDate() {
        return lastLoginDate;
    }


    /**
     * Sets the lastLoginDate value for this AuthenticationStatus.
     * 
     * @param lastLoginDate
     */
    public void setLastLoginDate(java.lang.String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticationStatus)) return false;
        AuthenticationStatus other = (AuthenticationStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedLoginAttempts==null && other.getFailedLoginAttempts()==null) || 
             (this.failedLoginAttempts!=null &&
              this.failedLoginAttempts.equals(other.getFailedLoginAttempts()))) &&
            ((this.failedPINAttempts==null && other.getFailedPINAttempts()==null) || 
             (this.failedPINAttempts!=null &&
              this.failedPINAttempts.equals(other.getFailedPINAttempts()))) &&
            ((this.lastLoginDate==null && other.getLastLoginDate()==null) || 
             (this.lastLoginDate!=null &&
              this.lastLoginDate.equals(other.getLastLoginDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFailedLoginAttempts() != null) {
            _hashCode += getFailedLoginAttempts().hashCode();
        }
        if (getFailedPINAttempts() != null) {
            _hashCode += getFailedPINAttempts().hashCode();
        }
        if (getLastLoginDate() != null) {
            _hashCode += getLastLoginDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticationStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.base.client.chipkarte.at", "authenticationStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedLoginAttempts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.base.client.chipkarte.at", "failedLoginAttempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedPINAttempts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.base.client.chipkarte.at", "failedPINAttempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastLoginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.base.client.chipkarte.at", "lastLoginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
