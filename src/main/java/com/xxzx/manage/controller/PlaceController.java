package com.xxzx.manage.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxzx.manage.entity.Place;
import com.xxzx.manage.service.PlaceService;

@RestController()
@RequestMapping("/place")
public class PlaceController {
    @Autowired
    private PlaceService placeService;

    /**
     * List all Member.
     *
     */
    @GetMapping("/list")
    public List<Place> list() {
        List<Place> placeList = (List<Place>) placeService.listAllPlace();
        return placeList;
    }
}
