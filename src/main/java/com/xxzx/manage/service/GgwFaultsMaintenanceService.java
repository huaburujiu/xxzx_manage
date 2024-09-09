package com.xxzx.manage.service;

import com.xxzx.manage.entity.GgwFaultsMaintenance;

public interface GgwFaultsMaintenanceService {

    Iterable<GgwFaultsMaintenance> listAllGgwFaultsMaintenance();

    GgwFaultsMaintenance getGgwFaultsMaintenanceById(Integer id);

    GgwFaultsMaintenance saveGgwFaultsMaintenance(GgwFaultsMaintenance ggwFaultsMaintenance);

    GgwFaultsMaintenance setGgwFaultsMaintenance(GgwFaultsMaintenance newGgwFaultsMaintenance, Integer id);

    void deleteGgwFaultsMaintenance(Integer id);
}
