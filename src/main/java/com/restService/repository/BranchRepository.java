package com.restService.repository;

import com.restService.model.base.BranchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BranchRepository extends JpaRepository<BranchEntity, Integer> {


    List<BranchEntity> findByCode(@Param("code") String code);
    BranchEntity saveAndFlush(BranchEntity branchEntity);


	
}
