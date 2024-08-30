package com.xxzx.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xxzx.manage.entity.Mission;
import com.xxzx.manage.service.MissionService;

@RestController()
@RequestMapping("/mission")
public class MissionController {

    @Autowired
    private MissionService missionService;

    /**
     * List all Mission.
     *
     */
    @GetMapping("/list")
    public List<Mission> list() {
        List<Mission> list = (List<Mission>) missionService.listAllMission();
        return list;
    }

    /**
     * View a specific mission by its id.
     *
     * @return
     */
    @GetMapping("/show/{id}")
    public Mission showmission(@PathVariable Integer id) {
        return missionService.getMissionById(id);
    }

    // Afficher le formulaire de modification du Mission
    @PutMapping("/edit/{id}")
    public String edit(@PathVariable Mission mission) {
        missionService.saveMission(mission);
        return "ok";
    }

    /**
     * New Mission.
     *
     */
    @RequestMapping("/new")
    public String newMission(Model model) {
        model.addAttribute("mission", new Mission());
        return "missionform";
    }

    /**
     * Save mission to database.
     *
     * @param mission
     * @return
     */
    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String saveMission(@RequestBody Mission mission) {
        missionService.saveMission(mission);
        return mission.getId().toString();
    }

    /**
     * Delete mission by its id.
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        missionService.deleteMission(id);
        return "redirect:/missions";
    }
}
