package com.restService.controller;

import com.restService.model.base.dto.InquiryResult;
import com.restService.model.base.dto.cheque.Cheque;
import com.restService.model.base.dto.macna.Macna;
import com.restService.model.base.dto.macna.MacnaInfo;
import com.restService.model.base.dto.nahab.Nahab;
import com.restService.model.base.dto.nahab.NahabInfo;
import com.restService.model.base.dto.samat.Samat;
import com.restService.model.base.dto.sepam.Sepam;
import com.restService.model.tahlil.ActivityLog;
import com.restService.repository.GeneralRepository;
import com.restService.service.logmanagement.LogService;
import com.restService.utils.Roles;
import com.restService.utils.ValidatorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by EDW on 2/9/2021.
 */
@RestController
@RequestMapping("inquiry")
public class InquiryController {

    @Autowired
    private GeneralRepository generalRepository;

    @RequestMapping(value = "/{nationalCode}", method = RequestMethod.GET)
    @Secured(Roles.OTHER_SERVICE)
    public ResponseEntity<InquiryResult> /*InquiryResult*/ getInquiryResultByNationalCode(@PathVariable String nationalCode, HttpServletRequest request) {
        //TODO national code validation
        ActivityLog log = generalRepository.addLog(request.getUserPrincipal().getName(), "all", nationalCode);
        if(log == null) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
        nationalCode = ValidatorUtils.getValidId(nationalCode);
        if("NV".equals(nationalCode)) {
            generalRepository.completeLog(log, "BAD_REQUEST", "");
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        try {
            InquiryResult result = generalRepository.get(nationalCode);
            generalRepository.completeLog(log, "OK", "");
            generalRepository.increaseCount(log);
            return new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception ex) {
            generalRepository.completeLog(log, "INTERNAL_SERVER_ERROR", ex.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @RequestMapping(value = "/samat/{nationalCode}/{inquiryDate}", method = RequestMethod.GET)
    @Secured(Roles.SECONDARY_SERVICE)
    public ResponseEntity<Samat> getSamatInquiryResultByNationalCode(@PathVariable String nationalCode, @PathVariable String inquiryDate, HttpServletRequest request) {
        //TODO national code validation
        ActivityLog log = generalRepository.addLog(request.getUserPrincipal().getName(), "samat", nationalCode);
        if(log == null) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
        nationalCode = ValidatorUtils.getValidId(nationalCode);
        if("NV".equals(nationalCode)) {
            generalRepository.completeLog(log, "BAD_REQUEST", "");
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        try {
            Samat result = generalRepository.getSamat(nationalCode);
            generalRepository.completeLog(log, "OK", "");
            generalRepository.increaseCount(log);
            return new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception ex) {
            generalRepository.completeLog(log, "INTERNAL_SERVER_ERROR", ex.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @RequestMapping(value = "/sepam/{nationalCode}/{inquiryDate}", method = RequestMethod.GET)
    @Secured(Roles.OTHER_SERVICE)
    public ResponseEntity<Sepam> getSepamInquiryResultByNationalCode(@PathVariable String nationalCode, @PathVariable String inquiryDate, HttpServletRequest request) {
        //TODO national code validation
        ActivityLog log = generalRepository.addLog(request.getUserPrincipal().getName(), "sepam", nationalCode);
        if(log == null) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
        nationalCode = ValidatorUtils.getValidId(nationalCode);
        if("NV".equals(nationalCode)) {
            generalRepository.completeLog(log, "BAD_REQUEST", "");
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        try {
            Sepam result = generalRepository.getSepam(nationalCode);
            generalRepository.completeLog(log, "OK", "");
            generalRepository.increaseCount(log);
            return new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception ex) {
            generalRepository.completeLog(log, "INTERNAL_SERVER_ERROR", ex.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @RequestMapping(value = "/macna/{nationalCode}/{accountDate}", method = RequestMethod.GET)
    @Secured(Roles.OTHER_SERVICE)
    public ResponseEntity<Macna> getMacnaInquiryResultByNationalCode(@PathVariable String nationalCode, @PathVariable String accountDate, HttpServletRequest request) {
        //TODO national code validation
        ActivityLog log = generalRepository.addLog(request.getUserPrincipal().getName(), "macna", nationalCode);
        if(log == null) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
        if(log == null) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
        nationalCode = ValidatorUtils.getValidId(nationalCode);
        if("NV".equals(nationalCode)) {
            generalRepository.completeLog(log, "BAD_REQUEST", "");
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        try {
            Macna result = generalRepository.getMacna(nationalCode, accountDate);
            generalRepository.completeLog(log, "OK", "");
            generalRepository.increaseCount(log);
            return new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception ex) {
            generalRepository.completeLog(log, "INTERNAL_SERVER_ERROR", ex.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

//    @RequestMapping(value = "/macna2/{nationalCode}/{accountDate}", method = RequestMethod.GET)
//    @Secured(Roles.OTHER_SERVICE)
//    public ResponseEntity<Macna> getMacnaInquiryResultByNationalCode2(@PathVariable String nationalCode, @PathVariable String accountDate, HttpServletRequest request) {
//        //TODO national code validation
//        ActivityLog log = generalRepository.addLog(request.getUserPrincipal().getName(), "macna", nationalCode);
//        if(log == null) {
//            return new ResponseEntity(HttpStatus.FORBIDDEN);
//        }
//        if(log == null) {
//            return new ResponseEntity(HttpStatus.FORBIDDEN);
//        }
//        nationalCode = ValidatorUtils.getValidId(nationalCode);
//        if("NV".equals(nationalCode)) {
//            generalRepository.completeLog(log, "BAD_REQUEST", "");
//            return new ResponseEntity(HttpStatus.BAD_REQUEST);
//        }
//        try {
//            Macna result = generalRepository.getMacna2(nationalCode, accountDate);
//            generalRepository.completeLog(log, "OK", "");
//            generalRepository.increaseCount(log);
//            return new ResponseEntity(result, HttpStatus.OK);
//        } catch (Exception ex) {
//            generalRepository.completeLog(log, "INTERNAL_SERVER_ERROR", ex.getMessage());
//            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//
//    }

//    @RequestMapping(value = "/nahab/{nationalCode}/{inquiryDate}", method = RequestMethod.GET)
//    @Secured(Roles.OTHER_SERVICE)
//    public ResponseEntity<Nahab> getNahabInquiryResultByNationalCode(@PathVariable String nationalCode, @PathVariable String inquiryDate, HttpServletRequest request) {
//        //TODO national code validation
//        ActivityLog log = generalRepository.addLog(request.getUserPrincipal().getName(), "nahab", nationalCode);
//        if(log == null) {
//            return new ResponseEntity(HttpStatus.FORBIDDEN);
//        }
//        nationalCode = ValidatorUtils.getValidId(nationalCode);
//        if("NV".equals(nationalCode)) {
//            generalRepository.completeLog(log, "BAD_REQUEST", "");
//            return new ResponseEntity(HttpStatus.BAD_REQUEST);
//        }
//        try {
//            Nahab result = generalRepository.getNahab(nationalCode);
//            generalRepository.completeLog(log, "OK", "");
//            generalRepository.increaseCount(log);
//            return new ResponseEntity(result, HttpStatus.OK);
//        } catch (Exception ex) {
//            generalRepository.completeLog(log, "INTERNAL_SERVER_ERROR", ex.getMessage());
//            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//
//    }

    @RequestMapping(value = "/nahab/{nationalCode}/{inquiryDate}", method = RequestMethod.GET)
    @Secured(Roles.OTHER_SERVICE)
    public ResponseEntity<Nahab> getNahabInquiryResultByNationalCode2(@PathVariable String nationalCode, @PathVariable String inquiryDate, HttpServletRequest request) {
        //TODO national code validation
        ActivityLog log = generalRepository.addLog(request.getUserPrincipal().getName(), "nahab", nationalCode);
        if(log == null) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
        nationalCode = ValidatorUtils.getValidId(nationalCode);
        if("NV".equals(nationalCode)) {
            generalRepository.completeLog(log, "BAD_REQUEST", "");
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        try {
            Nahab result = generalRepository.getNahab2(nationalCode);
            generalRepository.completeLog(log, "OK", "");
            generalRepository.increaseCount(log);
            return new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception ex) {
            generalRepository.completeLog(log, "INTERNAL_SERVER_ERROR", ex.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @RequestMapping(value = "/cheque/{nationalCode}/{inquiryDate}", method = RequestMethod.GET)
    @Secured(Roles.SECONDARY_SERVICE)
    public ResponseEntity<Cheque> getChequeInquiryResultByNationalCode(@PathVariable String nationalCode, @PathVariable String inquiryDate, HttpServletRequest request) {
        //TODO national code validation
        ActivityLog log = generalRepository.addLog(request.getUserPrincipal().getName(), "cheque", nationalCode);
        if(log == null) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
        nationalCode = ValidatorUtils.getValidId(nationalCode);
        if("NV".equals(nationalCode)) {
            generalRepository.completeLog(log, "BAD_REQUEST", "");
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        try {
            Cheque result = generalRepository.getCheque(nationalCode);
            generalRepository.completeLog(log, "OK", "");
            generalRepository.increaseCount(log);
            return new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception ex) {
            generalRepository.completeLog(log, "INTERNAL_SERVER_ERROR", ex.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
