package com.xxzx.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxzx.manage.entity.Mission;
import com.xxzx.manage.repository.MissionRepository;

@Service
public class MissionServiceImpl implements MissionService {
    @Autowired
    private MissionRepository missionRepository;

    @Override
    public Iterable<Mission> listAllMission() {
        return missionRepository.findAll();
    }

    @Override
    public Mission getMissionById(Integer id) {
        return missionRepository.findById(id).get();
    }

    @Override
    public Mission saveMission(Mission mission) {
        return missionRepository.save(mission);
    }

    @Override
    public void deleteMission(Integer id) {
        missionRepository.deleteById(id);
    }

    @Override
    public Mission setMission(Mission newMission, Integer id) {
        Mission mission = missionRepository.findById(id).get();
        mission.setContent(newMission.getContent());
        mission.setE_date(newMission.getE_date());
        mission.setS_date(newMission.getS_date());
        mission.setMember(newMission.getMember());
        mission.setPlace(newMission.getPlace());
        mission.setVehicle(newMission.getVehicle());
        return missionRepository.save(mission);
    }

}
