package com.xxzx.manage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.xxzx.manage.entity.GgwFaultsMaintenance;
import com.xxzx.manage.entity.Member;
import com.xxzx.manage.entity.Place;
import com.xxzx.manage.repository.MemberRepository;
import com.xxzx.manage.repository.MissionRepository;
import com.xxzx.manage.service.GgwFaultsMaintenanceService;
import com.xxzx.manage.service.MemberService;
import com.xxzx.manage.service.MissionServiceImpl;
import com.xxzx.manage.service.PlaceService;

@SpringBootTest
class ManageApplicationTests {

	@Autowired
	GgwFaultsMaintenanceService ggwFaultsMaintenanceService;

	@Test
	void contextLoads() {
		GgwFaultsMaintenance ggwFaultsMaintenance = ggwFaultsMaintenanceService.getGgwFaultsMaintenanceById(1);
		System.out.println("desc:" + ggwFaultsMaintenance.getFaultDescription());

	}

}
