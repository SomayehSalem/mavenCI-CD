package com.restService.controller;

import com.restService.model.base.BranchEntity;
import com.restService.service.BranchService;
import com.restService.service.ws.soap.branch.SoapClient;
import com.restService.utils.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("branch")
public class BranchController {

	@Autowired
	private BranchService branchService;
	@Autowired
	private SoapClient soapClient;

	public BranchController() {}


	@RequestMapping(value = "/branchList", method = RequestMethod.GET)
	@Secured(Roles.OTHER_SERVICE)
	public List<BranchEntity> list() {
		return branchService.getBranchList();
	}
//	public BranchEntity save(BranchEntity branchEntity) {
//		soapClient.getBranchesInfo("13990515","1").forEach((x) -> {
//			BranchEntity branchResponse = (BranchEntity) branchService.saveAndFlush(branchEntity);
//		});
//
//		return null;
//	}


//	public BranchEntity saveBranch(SoapClient soapClient) {
//		soapClient.getBranchesInfo("13990515","1").forEach((x) -> {
//			branchService.save(x);
//		});
//		return  null;
//
//	}



//	@RequestMapping(value = "/saveAndFlush", method = RequestMethod.POST)
//	public BranchEntity save(BranchEntity branchEntity) {
//		soapClient.getBranchesInfo("13990515","1").forEach((x) -> {
//			BranchEntity branchResponse = (BranchEntity) branchService.saveAndFlush(branchEntity);
//		});
//
//		return null;
//	}

	@RequestMapping(value = "/branchByCode/{code}", method = RequestMethod.GET)
	@Secured(Roles.OTHER_SERVICE)
	public List<BranchEntity> getBranchByCode(@PathVariable(value="code") String code) {
		System.out.println("code is "+ code);
		try{
			return branchService.getBranchByCode(code);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();

		}
		return null;

	}

}
