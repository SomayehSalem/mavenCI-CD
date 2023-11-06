
package com.restService.service.ws.soap.branch;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BranchInquirySoapImplService", targetNamespace = "http://branchInquiry.isc.co.ir/", wsdlLocation = "http://192.168.161.69:4141/axis2/services/BranchInqServices?wsdl")
public class BranchInquirySoapImplService
    extends Service
{

    private final static URL BRANCHINQUIRYSOAPIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException BRANCHINQUIRYSOAPIMPLSERVICE_EXCEPTION;
    private final static QName BRANCHINQUIRYSOAPIMPLSERVICE_QNAME = new QName("http://branchInquiry.isc.co.ir/", "BranchInquirySoapImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.161.69:4141/axis2/services/BranchInqServices?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BRANCHINQUIRYSOAPIMPLSERVICE_WSDL_LOCATION = url;
        BRANCHINQUIRYSOAPIMPLSERVICE_EXCEPTION = e;
    }

    public BranchInquirySoapImplService() {
        super(__getWsdlLocation(), BRANCHINQUIRYSOAPIMPLSERVICE_QNAME);
    }

    public BranchInquirySoapImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BRANCHINQUIRYSOAPIMPLSERVICE_QNAME, features);
    }

    public BranchInquirySoapImplService(URL wsdlLocation) {
        super(wsdlLocation, BRANCHINQUIRYSOAPIMPLSERVICE_QNAME);
    }

    public BranchInquirySoapImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BRANCHINQUIRYSOAPIMPLSERVICE_QNAME, features);
    }

    public BranchInquirySoapImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BranchInquirySoapImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BranchInquirySoapInterface
     */
    @WebEndpoint(name = "BranchInquiryPort")
    public BranchInquirySoapInterface getBranchInquiryPort() {
        return super.getPort(new QName("http://branchInquiry.isc.co.ir/", "BranchInquiryPort"), BranchInquirySoapInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BranchInquirySoapInterface
     */
    @WebEndpoint(name = "BranchInquiryPort")
    public BranchInquirySoapInterface getBranchInquiryPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://branchInquiry.isc.co.ir/", "BranchInquiryPort"), BranchInquirySoapInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BRANCHINQUIRYSOAPIMPLSERVICE_EXCEPTION!= null) {
            throw BRANCHINQUIRYSOAPIMPLSERVICE_EXCEPTION;
        }
        return BRANCHINQUIRYSOAPIMPLSERVICE_WSDL_LOCATION;
    }

}
