package com.restService.repository;

import com.restService.model.base.MacnaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface MacnaRepository extends JpaRepository<MacnaEntity, String> {

//	List<MacnaEntity> list();
	// CRUD
//	MacnaEntity create(MacnaEntity macna);
//	MacnaEntity get(Long id);
//	MacnaEntity update(Long id, MacnaEntity macna);
//	MacnaEntity delete(Long id);
    List<MacnaEntity> findByCardno(@Param("cardno") String cardno);

	
}
