package com.restService.controller;

import com.restService.model.tahlil.ActivityLog;
import com.restService.model.tahlil.ChequeTotal;
import com.restService.model.tahlil.FactCmsReserve;
import com.restService.repository.GeneralRepository;
import com.restService.utils.Roles;
import com.restService.utils.TextUtils;
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
 * Created by EDW on 3/14/2021.
 */
@RestController
@RequestMapping("cheque")
public class ChequeController {

    @Autowired
    private GeneralRepository generalRepository;


    @RequestMapping(value = "/{nationalCode}", method = RequestMethod.GET)
    @Secured(Roles.CHEQUE_INQUIRY)
    public ResponseEntity<List<FactCmsReserve>> list(@PathVariable String nationalCode, HttpServletRequest request) {

        ActivityLog log = generalRepository.addLog(request.getUserPrincipal().getName(), "cheque", nationalCode);
        if(nationalCode == null || nationalCode.trim().length() == 0 || nationalCode.trim().length() > 20 || !ValidatorUtils.isNumber(nationalCode)) {
            generalRepository.completeLog(log, "BAD_REQUEST", "");
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        try {
            List<FactCmsReserve> lst = generalRepository.getFactCmsReserveByNationalCode(nationalCode);
            generalRepository.completeLog(log, "OK", "");
            return new ResponseEntity(lst, HttpStatus.OK);
        } catch (Exception ex) {
            generalRepository.completeLog(log, "INTERNAL_SERVER_ERROR", ex.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @RequestMapping(value = "/total/{nationalCode}", method = RequestMethod.GET)
    @Secured(Roles.CHEQUE_INQUIRY)
    public ResponseEntity<List<ChequeTotal>> listTotal(@PathVariable String nationalCode, HttpServletRequest request) {

        ActivityLog log = generalRepository.addLog(request.getUserPrincipal().getName(), "cheque-total", nationalCode);
        if(nationalCode == null || nationalCode.trim().length() == 0 || nationalCode.trim().length() > 20 || !ValidatorUtils.isNumber(nationalCode)) {
            generalRepository.completeLog(log, "BAD_REQUEST", "");
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        try {
            List<ChequeTotal> lst = generalRepository.getChequeTotalByNationalCode(nationalCode);
            generalRepository.completeLog(log, "OK", "");
            return new ResponseEntity(lst, HttpStatus.OK);
        } catch (Exception ex) {
            generalRepository.completeLog(log, "INTERNAL_SERVER_ERROR", ex.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
