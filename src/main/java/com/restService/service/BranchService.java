package com.restService.service;

import com.restService.model.base.BranchEntity;

import java.util.List;

public interface BranchService {
	
	List<BranchEntity> getBranchList();
    List<BranchEntity> getBranchByCode(String code);
    BranchEntity saveAndFlush(BranchEntity branchEntity);
    void delete(List<BranchEntity> branchEntity);

}
