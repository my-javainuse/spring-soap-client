
package com.example.spring.soap.client.loanandeligibility;

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
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LoanAndEligibilityPortTypeService", targetNamespace = "http://www.example.com/spring/soap/api/loanEligibility", wsdlLocation = "file:/G:/java-practice/spring-soap-client/src/main/resources/wsdl/LoanAndElibility.wsdl")
public class LoanAndEligibilityPortTypeService
    extends Service
{

    private final static URL LOANANDELIGIBILITYPORTTYPESERVICE_WSDL_LOCATION;
    private final static WebServiceException LOANANDELIGIBILITYPORTTYPESERVICE_EXCEPTION;
    private final static QName LOANANDELIGIBILITYPORTTYPESERVICE_QNAME = new QName("http://www.example.com/spring/soap/api/loanEligibility", "LoanAndEligibilityPortTypeService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/G:/java-practice/spring-soap-client/src/main/resources/wsdl/LoanAndElibility.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOANANDELIGIBILITYPORTTYPESERVICE_WSDL_LOCATION = url;
        LOANANDELIGIBILITYPORTTYPESERVICE_EXCEPTION = e;
    }

    public LoanAndEligibilityPortTypeService() {
        super(__getWsdlLocation(), LOANANDELIGIBILITYPORTTYPESERVICE_QNAME);
    }

    public LoanAndEligibilityPortTypeService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOANANDELIGIBILITYPORTTYPESERVICE_QNAME, features);
    }

    public LoanAndEligibilityPortTypeService(URL wsdlLocation) {
        super(wsdlLocation, LOANANDELIGIBILITYPORTTYPESERVICE_QNAME);
    }

    public LoanAndEligibilityPortTypeService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOANANDELIGIBILITYPORTTYPESERVICE_QNAME, features);
    }

    public LoanAndEligibilityPortTypeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoanAndEligibilityPortTypeService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LoanAndEligibilityPortType
     */
    @WebEndpoint(name = "LoanAndEligibilityPortTypeSoap11")
    public LoanAndEligibilityPortType getLoanAndEligibilityPortTypeSoap11() {
        return super.getPort(new QName("http://www.example.com/spring/soap/api/loanEligibility", "LoanAndEligibilityPortTypeSoap11"), LoanAndEligibilityPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoanAndEligibilityPortType
     */
    @WebEndpoint(name = "LoanAndEligibilityPortTypeSoap11")
    public LoanAndEligibilityPortType getLoanAndEligibilityPortTypeSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.example.com/spring/soap/api/loanEligibility", "LoanAndEligibilityPortTypeSoap11"), LoanAndEligibilityPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOANANDELIGIBILITYPORTTYPESERVICE_EXCEPTION!= null) {
            throw LOANANDELIGIBILITYPORTTYPESERVICE_EXCEPTION;
        }
        return LOANANDELIGIBILITYPORTTYPESERVICE_WSDL_LOCATION;
    }

}
