package com.viptrip.wetrip.wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-04-06T16:40:47.470+08:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://webservice.viptrip.com/", name = "ReadIBEDataImplDelegate")
@XmlSeeAlso({ObjectFactory.class, com.viptrip.wetrip.wsclient.base.ObjectFactory.class})
public interface ReadIBEDataImplDelegate {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getIBEFD", targetNamespace = "http://webservice.viptrip.com/", className = "com.viptrip.wetrip.wsclient.GetIBEFD")
    @WebMethod
    @ResponseWrapper(localName = "getIBEFDResponse", targetNamespace = "http://webservice.viptrip.com/", className = "com.viptrip.wetrip.wsclient.GetIBEFDResponse")
    public java.util.List<com.viptrip.wetrip.wsclient.base.StringArray> getIBEFD(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );

    
    /**
     * 
     * @param arg0 	起飞地点
     * @param arg1  目的地点
     * @param arg2  起飞日期 YYYYMMDD格式
     * @param arg3	
     * @param arg4	航空公司拼接字符串，格式：CA_MU,传null 或者 "" 认为是全部航空公司 
     * @return
     */
    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getIBEData", targetNamespace = "http://webservice.viptrip.com/", className = "com.viptrip.wetrip.wsclient.GetIBEData")
    @WebMethod
    @ResponseWrapper(localName = "getIBEDataResponse", targetNamespace = "http://webservice.viptrip.com/", className = "com.viptrip.wetrip.wsclient.GetIBEDataResponse")
    public java.util.List<com.viptrip.wetrip.wsclient.DispplayTrip> getIBEData(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        java.lang.String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        java.lang.String arg4
    );
}