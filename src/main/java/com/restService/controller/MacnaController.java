package com.restService.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restService.model.base.MacnaEntity;
import com.restService.model.base.logmanagement.LogEntity;
import com.restService.service.MacnaService;
import com.restService.service.logmanagement.LogService;
import com.restService.utils.DateUtils;
import com.restService.utils.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.String;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("macna")
public class MacnaController {

	@Autowired
	private MacnaService macnaService;

	@Autowired
	private LogService logService;


	public MacnaController() {}


	@RequestMapping(value = "/macnaList", method = RequestMethod.GET)
	@Secured(Roles.OTHER_SERVICE)
	public ResponseEntity<List<MacnaEntity>> list(HttpServletRequest request) throws Exception {
		SecurityContext context = SecurityContextHolder.getContext();
		LogEntity logEntity = new LogEntity("/makna/maknaList",
				DateUtils.format(new Date(), "yyyyMMdd:HHmmssss"),
				request.getRemoteAddr(),
				context.getAuthentication().getName());
		try {
			Collection<? extends GrantedAuthority> lst = context.getAuthentication().getAuthorities();
			if (lst != null) {
				for (GrantedAuthority x : lst) {
					if (x.getAuthority().equalsIgnoreCase("MAKNA_GET_LIST")) {

						List<MacnaEntity> maknaList = macnaService.getMacnaList();
						logService.saveSuccessLog(logEntity, new ObjectMapper().writeValueAsString(maknaList).getBytes());
						return new ResponseEntity(maknaList, HttpStatus.OK);
					}
				}
				logService.saveFailureLog(logEntity, "ACCESS DENIED.".getBytes());
				return new ResponseEntity("ACCESS DENIED.", HttpStatus.FORBIDDEN);
			} else {
				logService.saveFailureLog(logEntity, "ACCESS DENIED.".getBytes());
				return new ResponseEntity("ACCESS DENIED.", HttpStatus.FORBIDDEN);
			}
		} catch (Exception e) {
			logService.saveFailureLog(logEntity, e.getClass().getName().getBytes());
			return new ResponseEntity(e.getClass().getName() + ".", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// crud
//	@RequestMapping(value = "macnaList", method = RequestMethod.POST)
//	public MacnaEntity create(@RequestBody MacnaEntity macna) {
//		return MacnaService.createMacna(MacnaEntity);
//	}

	@RequestMapping(value = "/macnaList/{id}", method = RequestMethod.GET)
	@Secured(Roles.OTHER_SERVICE)
	public MacnaEntity get(@PathVariable String id) {
		return macnaService.getMacnaById(id);
	}

	@RequestMapping(value = "/macnaByCardNo/{cardno}", method = RequestMethod.GET)
	@Secured(Roles.OTHER_SERVICE)
	public List<MacnaEntity> getMacnaByCardNo(@PathVariable(value="cardno") String cardno) {
		System.out.println("cardno is "+cardno);
		try{
			return macnaService.getMacnaByCardNo(cardno);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();

		}
		return null;

	}
//	@RequestMapping(value = "consultants/{id}", method = RequestMethod.PUT)
//	public Consultant update(@PathVariable Long id, @RequestBody Consultant shipwreck) {
//		return MacnaService.updateConsultantById(id, shipwreck);
//	}
//
//	@RequestMapping(value = "consultants/{id}", method = RequestMethod.DELETE)
//	public Consultant delete(@PathVariable Long id) {
//		return consultantService.deleteConsultantById(id);
//	}
//
}
