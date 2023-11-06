package com.restService.service.ws.soap.branch;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import java.util.List;

@Service
@Component("BranchInqServices")
public class SoapClient extends WebServiceGatewaySupport {

    private String endpoint = "http://192.168.161.69:4141/axis2/services/BranchInqServices?wsdl";

    public List<Branch> getBranchesInfo(String baseDate,String id) {
         BranchInquirySoapImplService service = new BranchInquirySoapImplService();
        BranchInquirySoapInterface port = service.getBranchInquiryPort();


        return port.getBranchesInfo(baseDate,id).getItem();

//        BranchInquirySoapImplService request = new BranchInquirySoapImplService();
//        BranchInquirySoapInterface response = (BranchInquirySoapInterface) getWebServiceTemplate().marshalSendAndReceive(endpoint,request);
//        return response.getBranchesInfo(baseDate,id).getItem();


    }

    public List<String> getBranchesInfoStr(String baseDate, String id) {
        BranchInquirySoapImplService service = new BranchInquirySoapImplService();
        BranchInquirySoapInterface port = service.getBranchInquiryPort();
        return port.getBranchesInfoStr(baseDate, id).getItem();
    }
//
//    private static BranchArray branchInqServicesHttpSoap12Endpoint(java.lang.String baseDate, java.lang.String id) {
//        ir.co.isc.branchinquiry.BranchInquirySoapImplService service = new ir.co.isc.branchinquiry.BranchInquirySoapImplService();
//        ir.co.isc.branchinquiry.BranchInquirySoapInterface port = service.getBranchInquiryPort();
//        return port.branchInqServicesHttpSoap12Endpoint(baseDate, id);
//    }
}
