package com.xxzx.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxzx.manage.entity.GgwFaultsMaintenance;
import com.xxzx.manage.repository.GgwFaultsMaintenanceRepository;

@Service
public class GgwFaultsMaintenanceServiceImpl implements GgwFaultsMaintenanceService {

    @Autowired
    GgwFaultsMaintenanceRepository ggwFaultsMaintenanceRepository;

    @Override
    public Iterable<GgwFaultsMaintenance> listAllGgwFaultsMaintenance() {
        return ggwFaultsMaintenanceRepository.findAll();
    }

    @Override
    public GgwFaultsMaintenance getGgwFaultsMaintenanceById(Integer id) {
        return ggwFaultsMaintenanceRepository.findById(id).get();
    }

    @Override
    public GgwFaultsMaintenance saveGgwFaultsMaintenance(GgwFaultsMaintenance ggwFaultsMaintenance) {
        return ggwFaultsMaintenanceRepository.save(ggwFaultsMaintenance);
    }

    @Override
    public void deleteGgwFaultsMaintenance(Integer id) {
        ggwFaultsMaintenanceRepository.deleteById(id);
    }

    @Override
    public GgwFaultsMaintenance setGgwFaultsMaintenance(GgwFaultsMaintenance newGgwFaultsMaintenance, Integer id) {
        GgwFaultsMaintenance ggwFaultsMaintenance = ggwFaultsMaintenanceRepository.findById(id).get();

        ggwFaultsMaintenance.setResolvedBy(newGgwFaultsMaintenance.getResolvedBy());
        ggwFaultsMaintenance.setMaintenanceLocation(newGgwFaultsMaintenance.getMaintenanceLocation());

        ggwFaultsMaintenance.setTypeOfMaintenance(newGgwFaultsMaintenance.getTypeOfMaintenance());
        ggwFaultsMaintenance.setIsRemote(newGgwFaultsMaintenance.getIsRemote());

        ggwFaultsMaintenance.setStartTime(newGgwFaultsMaintenance.getStartTime());
        ggwFaultsMaintenance.setEndTime(newGgwFaultsMaintenance.getEndTime());

        ggwFaultsMaintenance.setFaultDescription(newGgwFaultsMaintenance.getFaultDescription());
        ggwFaultsMaintenance.setMaintenanceProcess(newGgwFaultsMaintenance.getMaintenanceProcess());
        ggwFaultsMaintenance.setRootCause(newGgwFaultsMaintenance.getRootCause());

        ggwFaultsMaintenance.setMaintenanceResult(newGgwFaultsMaintenance.getMaintenanceResult());

        return ggwFaultsMaintenanceRepository.save(ggwFaultsMaintenance);
    }

}
