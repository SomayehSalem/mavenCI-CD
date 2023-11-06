package com.restService.service.impl;

import com.restService.model.base.MacnaEntity;
import com.restService.repository.MacnaRepository;
import com.restService.service.MacnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MacnaServiceImpl implements MacnaService {
	
	@Autowired
	private MacnaRepository macnaRepository;
	
	@Override
	public List<MacnaEntity> getMacnaList() {
		return macnaRepository.findAll();
	}

	@Override
	public MacnaEntity getMacnaById(String id) {
		return macnaRepository.findOne(id);
	}

	public List<MacnaEntity> getMacnaByCardNo(String cardno) {
		return macnaRepository.findByCardno(cardno);
	}

}
