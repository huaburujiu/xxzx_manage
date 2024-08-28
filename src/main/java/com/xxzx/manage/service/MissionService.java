package com.xxzx.manage.service;

import com.xxzx.manage.entity.Mission;

public interface MissionService {
    Iterable<Mission> listAllMission();

    Mission getMissionById(Integer id);

    Mission saveMission(Mission mission);

    void deleteMission(Integer id);
}
