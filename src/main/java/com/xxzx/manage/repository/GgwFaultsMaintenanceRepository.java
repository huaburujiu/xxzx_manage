package com.xxzx.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.xxzx.manage.entity.GgwFaultsMaintenance;

public interface GgwFaultsMaintenanceRepository extends JpaRepository<GgwFaultsMaintenance,Integer>,JpaSpecificationExecutor<GgwFaultsMaintenance>{

}
