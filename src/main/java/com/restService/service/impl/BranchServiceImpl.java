package com.restService.service.impl;

import com.restService.model.base.BranchEntity;
import com.restService.repository.BranchRepository;
import com.restService.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {
	
	@Autowired
	private BranchRepository branchRepository;
	
	@Override
	public List<BranchEntity> getBranchList() {
		return branchRepository.findAll();
	}

	@Override
	public List<BranchEntity> getBranchByCode(String code) {
		return branchRepository.findByCode(code);

	}

	@Transactional
	@Override
	public BranchEntity saveAndFlush(BranchEntity branchEntity) {
		BranchEntity response =  branchRepository.saveAndFlush(branchEntity);
		return response;
	}

	@Override
	public void delete(List<BranchEntity> branchEntity) {
		branchRepository.delete(branchEntity);
	}

}
