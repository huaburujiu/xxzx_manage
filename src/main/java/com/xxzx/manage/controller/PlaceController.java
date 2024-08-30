package com.xxzx.manage.controller;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * 模糊查询
     * 参数：nameLike
     */
    @GetMapping("/like/name")
    public List<Place> selectList(@RequestParam(name = "nameLike", required = true) String nameLike) {
        List<Place> placeList = (List<Place>) placeService.selectPlaceLikeName(nameLike);
        return placeList;
    }

    /**
     * 查询
     * 参数: ids[1,2]
     */
    @PostMapping("/ids")
    public List<Place> listByIds(@RequestBody List<Integer> ids) {
        List<Place> placeList = (List<Place>) placeService.selectPlaceByIds(ids);
        return placeList;
    }
}
