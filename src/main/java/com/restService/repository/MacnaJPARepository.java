package com.restService.repository;


import com.restService.model.base.MacnaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MacnaJPARepository extends JpaRepository<MacnaEntity, Long> {
}
