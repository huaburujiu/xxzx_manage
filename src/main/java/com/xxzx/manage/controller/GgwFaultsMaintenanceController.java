package com.xxzx.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xxzx.manage.entity.GgwFaultsMaintenance;

import com.xxzx.manage.service.GgwFaultsMaintenanceService;

@RestController()
@RequestMapping("/ggwFaultsMaintenance")
public class GgwFaultsMaintenanceController {
    @Autowired
    GgwFaultsMaintenanceService ggwFaultsMaintenanceService;

    /**
     * List all GgwFaultsMaintenance
     *
     */
    @GetMapping("/list")
    public List<GgwFaultsMaintenance> list() {
        List<GgwFaultsMaintenance> list = (List<GgwFaultsMaintenance>) ggwFaultsMaintenanceService
                .listAllGgwFaultsMaintenance();
        return list;
    }

    /**
     * View a specific mission by its id.
     *
     * @return
     */
    @GetMapping("/show/{id}")
    public GgwFaultsMaintenance showGgwFaultsMaintenance(@PathVariable Integer id) {
        return ggwFaultsMaintenanceService.getGgwFaultsMaintenanceById(id);
    }

    // Afficher le formulaire de modification GgwFaultsMaintenance
    @PutMapping("/edit/{id}")
    public String edit(@RequestBody GgwFaultsMaintenance ggwFaultsMaintenance, @PathVariable Integer id) {
        ggwFaultsMaintenanceService.setGgwFaultsMaintenance(ggwFaultsMaintenance, id);
        return "ok";
    }

    /**
     * Save ggwFaultsMaintenanceService to database.
     *
     * @param ggwFaultsMaintenanceService
     * @return
     */
    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String saveMission(@RequestBody GgwFaultsMaintenance ggwFaultsMaintenance) {
        ggwFaultsMaintenanceService.saveGgwFaultsMaintenance(ggwFaultsMaintenance);
        return ggwFaultsMaintenance.getId().toString();
    }

    /**
     * Delete mission by its id.
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        ggwFaultsMaintenanceService.deleteGgwFaultsMaintenance(id);
        return "redirect:/missions";
    }
}
