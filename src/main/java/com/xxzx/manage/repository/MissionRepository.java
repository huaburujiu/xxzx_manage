package com.xxzx.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xxzx.manage.entity.Mission;
@Repository
public interface MissionRepository extends JpaRepository<Mission, Integer> {

}
