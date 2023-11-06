package com.restService.repository;


import com.restService.model.base.BranchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchJPARepository extends JpaRepository<BranchEntity, Integer> {
}
