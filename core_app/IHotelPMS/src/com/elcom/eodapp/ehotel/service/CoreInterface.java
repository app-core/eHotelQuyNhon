
package com.elcom.eodapp.ehotel.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CoreInterface", targetNamespace = "http://service.ehotel.eodapp.elcom.com", wsdlLocation="http://172.16.9.159:8383/eHotel/services/CoreInterface?wsdl")
public class CoreInterface  extends Service
{

    private final static URL COREINTERFACE_WSDL_LOCATION;
    private final static WebServiceException COREINTERFACE_EXCEPTION;
    private final static QName COREINTERFACE_QNAME = new QName("http://service.ehotel.eodapp.elcom.com", "CoreInterface");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://172.16.9.159:8383/eHotel/services/CoreInterface?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COREINTERFACE_WSDL_LOCATION = url;
        COREINTERFACE_EXCEPTION = e;
    }

    public CoreInterface() {
        super(__getWsdlLocation(), COREINTERFACE_QNAME);
    }

    public CoreInterface(WebServiceFeature... features) {
        super(__getWsdlLocation(), COREINTERFACE_QNAME, features);
    }

    public CoreInterface(URL wsdlLocation) {
        super(wsdlLocation, COREINTERFACE_QNAME);
    }

    public CoreInterface(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COREINTERFACE_QNAME, features);
    }

    public CoreInterface(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CoreInterface(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CoreInterfacePortType
     */
    @WebEndpoint(name = "CoreInterfaceHttpSoap11Endpoint")
    public CoreInterfacePortType getCoreInterfaceHttpSoap11Endpoint() {
        return super.getPort(new QName("http://service.ehotel.eodapp.elcom.com", "CoreInterfaceHttpSoap11Endpoint"), CoreInterfacePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CoreInterfacePortType
     */
    @WebEndpoint(name = "CoreInterfaceHttpSoap11Endpoint")
    public CoreInterfacePortType getCoreInterfaceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.ehotel.eodapp.elcom.com", "CoreInterfaceHttpSoap11Endpoint"), CoreInterfacePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COREINTERFACE_EXCEPTION!= null) {
            throw COREINTERFACE_EXCEPTION;
        }
        return COREINTERFACE_WSDL_LOCATION;
    }

}
