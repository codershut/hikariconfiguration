package com.hikaricpconfiguration.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hikaricpconfiguration.model.EmdModel;

@Repository
public interface HikariRepo extends JpaRepository<EmdModel, Integer> {

}
