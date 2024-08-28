package com.xxzx.manage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.xxzx.manage.entity.Member;
import com.xxzx.manage.entity.Place;
import com.xxzx.manage.repository.MemberRepository;
import com.xxzx.manage.repository.MissionRepository;
import com.xxzx.manage.service.MemberService;
import com.xxzx.manage.service.MissionServiceImpl;
import com.xxzx.manage.service.PlaceService;

@SpringBootTest
class ManageApplicationTests {

	@Autowired
	PlaceService placeService;

	@Test
	void contextLoads() {
		Place place = placeService.getPlaceById(1);
		System.out.println(place.getName());

	}

}
