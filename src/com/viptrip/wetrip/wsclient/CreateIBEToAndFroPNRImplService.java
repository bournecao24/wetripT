package com.viptrip.wetrip.wsclient;

import java.io.IOException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

import com.viptrip.resource.Const;
import com.viptrip.util.PropertiesUtils;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-11-19T19:55:15.809+08:00
 * Generated source version: 2.7.6
 *  @说明： copy from viptrip365  
 *  @author jetty 2017-04-19
 */
@WebServiceClient(name = "CreateIBEToAndFroPNRImplService", 
                  wsdlLocation = "/new_ws/CreateIBEToAndFroPNRImplPort?wsdl",
                  targetNamespace = "http://webservice.viptrip.com/") 
public class CreateIBEToAndFroPNRImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.viptrip.com/", "CreateIBEToAndFroPNRImplService");
    public final static QName CreateIBEToAndFroPNRImplPort = new QName("http://webservice.viptrip.com/", "CreateIBEToAndFroPNRImplPort");
    static {
        URL url = null;
        StringBuffer partURL=new StringBuffer();
		try {
			partURL.append(PropertiesUtils.getProperty(Const.PRO_IBESERVER_IP,Const.FILE_IBESERVER));
			partURL.append(PropertiesUtils.getProperty(Const.PRO_IBESERVER_PORT,Const.FILE_IBESERVER));
		} catch (IOException e) {
			e.printStackTrace();
		}
        try {
             url=new URL("http://" + partURL.toString() + "/new_ws/CreateIBEToAndFroPNRImplPort?wsdl");
        } catch (Exception e) {
                java.util.logging.Logger.getLogger(CreateIBEToAndFroPNRImplService.class.getName())
                    .log(java.util.logging.Level.INFO, 
                         "Can not initialize the default wsdl from {0}", "http://" + partURL.toString()+ 
                		"/new_ws/CreateIBEToAndFroPNRImplPort?wsdl"+";"+e.getMessage());
        }
        WSDL_LOCATION = url;
    }

    public CreateIBEToAndFroPNRImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CreateIBEToAndFroPNRImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CreateIBEToAndFroPNRImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns CreateIBEToAndFroPNR
     */
    @WebEndpoint(name = "CreateIBEToAndFroPNRImplPort")
    public CreateIBEToAndFroPNR getCreateIBEToAndFroPNRImplPort() {
        return super.getPort(CreateIBEToAndFroPNRImplPort, CreateIBEToAndFroPNR.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreateIBEToAndFroPNR
     
    @WebEndpoint(name = "CreateIBEToAndFroPNRImplPort")
    public CreateIBEToAndFroPNR getCreateIBEToAndFroPNRImplPort(WebServiceFeature... features) {
        return super.getPort(CreateIBEToAndFroPNRImplPort, CreateIBEToAndFroPNR.class, features);
    }
*/
}