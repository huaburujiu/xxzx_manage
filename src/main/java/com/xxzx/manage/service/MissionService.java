package com.xxzx.manage.service;

import com.xxzx.manage.entity.Mission;

public interface MissionService {
    Iterable<Mission> listAllMission();

    Mission getMissionById(Integer id);

    Mission saveMission(Mission mission);

    Mission setMission(Mission mission, Integer id);

    void deleteMission(Integer id);
}
