package com.restService.service;

import com.restService.model.base.MacnaEntity;

import java.util.List;

public interface MacnaService {
	
	List<MacnaEntity> getMacnaList();
    MacnaEntity getMacnaById(String id);
    List<MacnaEntity> getMacnaByCardNo(String cardno);


}
