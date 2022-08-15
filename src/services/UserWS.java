
package services;

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
@WebServiceClient(name = "UserWS", targetNamespace = "http://service/", wsdlLocation = "http://192.168.1.12:8585/UserService?wsdl")
public class UserWS
    extends Service
{

    private final static URL USERWS_WSDL_LOCATION;
    private final static WebServiceException USERWS_EXCEPTION;
    private final static QName USERWS_QNAME = new QName("http://service/", "UserWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.1.22:8585/UserService?wsdl");
            // CODE A MODIFIER EN FONCTION DE L'ADRESSE DE LA MACHINE
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERWS_WSDL_LOCATION = url;
        USERWS_EXCEPTION = e;
    }

    public UserWS() {
        super(__getWsdlLocation(), USERWS_QNAME);
    }

    public UserWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERWS_QNAME, features);
    }

    public UserWS(URL wsdlLocation) {
        super(wsdlLocation, USERWS_QNAME);
    }

    public UserWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERWS_QNAME, features);
    }

    public UserWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "UserServicePort")
    public UserService getUserServicePort() {
        return super.getPort(new QName("http://service/", "UserServicePort"), UserService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "UserServicePort")
    public UserService getUserServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "UserServicePort"), UserService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERWS_EXCEPTION!= null) {
            throw USERWS_EXCEPTION;
        }
        return USERWS_WSDL_LOCATION;
    }

}
