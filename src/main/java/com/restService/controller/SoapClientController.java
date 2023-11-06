package com.restService.controller;

import com.restService.model.base.BranchEntity;
import com.restService.service.BranchService;
import com.restService.service.ws.soap.branch.SoapClient;
import com.restService.service.ws.soap.branch.Branch;
import com.restService.utils.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("soapRequest")
public class SoapClientController {

	@Autowired
	private SoapClient soapClient;

	@Autowired
	private BranchService branchService;

//	@GetMapping(value="/branch", produces = MediaType.TEXT_PLAIN_VALUE)
	@RequestMapping(value="/getBranchesInfo/{baseDate}/{id}",method=RequestMethod.GET)
	@Secured(Roles.OTHER_SERVICE)
	public List<Branch> getBranchesInfo(@PathVariable String baseDate,@PathVariable String id) {
		save(baseDate,id);
		return soapClient.getBranchesInfo(baseDate,id);
	}

	@RequestMapping(value="/getBranchesInfoStr/{baseDate}/{id}",method=RequestMethod.GET)
	@Secured(Roles.OTHER_SERVICE)
	public List<String> getBranchesInfoStr(@PathVariable String baseDate, @PathVariable String id) {
		return soapClient.getBranchesInfoStr(baseDate,id);
	}


	public void save(String baseDate,String id){
		List<BranchEntity> branchEntityList=branchService.getBranchList();
		branchService.delete(branchEntityList);
		List<Branch> entities=soapClient.getBranchesInfo(baseDate,id);
		entities.forEach((x) -> {
			BranchEntity branchEntity= new BranchEntity();
			branchEntity.setActivitytype(x.getActivityType());
			branchEntity.setAddr(x.getAddr());
			branchEntity.setBicode(x.getBICcode());
			branchEntity.setCitycode(x.getCityCode());
			branchEntity.setCode(x.getCode());
			branchEntity.setFax(x.getFax());
			branchEntity.setMergedbiccode(x.getMergedBICcode());
			branchEntity.setMergedbranchcode(x.getMergedBranchCode());
			branchEntity.setName(x.getName());
			branchEntity.setOwnershipstate(x.getOwnershipState());
			branchEntity.setProvincecode(x.getProvinceCode());
			branchEntity.setRegion(x.getRegion());
			branchEntity.setStatus(x.getStatus());
			branchEntity.setTel(x.getTel());
			branchEntity.setUpdatedate(x.getUpdateDate());
			branchEntity.setZipcode(x.getZipCode());
			BranchEntity branchResponse = branchService.saveAndFlush(branchEntity);
		});


		}



}
