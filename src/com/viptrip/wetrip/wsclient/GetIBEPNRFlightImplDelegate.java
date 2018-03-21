package com.viptrip.wetrip.wsclient;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-12-19T16:33:35.816+08:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://webservice.viptrip.com/", name = "GetIBEPNRFlightImplDelegate")
@XmlSeeAlso({ObjectFactory.class})
public interface GetIBEPNRFlightImplDelegate {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getPNRFlight", targetNamespace = "http://webservice.viptrip.com/", className = "com.viptrip.wetrip.wsclient.GetPNRFlight")
    @WebMethod
    @ResponseWrapper(localName = "getPNRFlightResponse", targetNamespace = "http://webservice.viptrip.com/", className = "com.viptrip.wetrip.wsclient.GetPNRFlightResponse")
    public java.util.List<java.lang.String> getPNRFlight(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getDETR", targetNamespace = "http://webservice.viptrip.com/", className = "com.viptrip.wetrip.wsclient.GetDETR")
    @WebMethod
    @ResponseWrapper(localName = "getDETRResponse", targetNamespace = "http://webservice.viptrip.com/", className = "com.viptrip.wetrip.wsclient.GetDETRResponse")
    public java.util.List<java.lang.String> getDETR(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
    
	
	@WebResult(name = "return",targetNamespace = "")
	@RequestWrapper(localName = "getOringinalRT", targetNamespace = "http://webservice.viptrip.com/", className = "com.viptrip.wetrip.wsclient.GetOringinalRT")
	@WebMethod
	@ResponseWrapper(localName = "getOringinalRTResponse", targetNamespace = "http://webservice.viptrip.com/", className = "com.viptrip.wetrip.wsclient.GetOringinalRTResponse")
	public java.util.List<String> getOringinalRT(
			@WebParam(name = "arg0", targetNamespace = "") 
			java.lang.String arg0);
}