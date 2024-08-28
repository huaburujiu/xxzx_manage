package com.xxzx.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxzx.manage.entity.Place;
import com.xxzx.manage.repository.PlaceRepository;

@Service
public class PlaceServiceImpl implements PlaceService {
    @Autowired
    PlaceRepository placeRepository;

    @Override
    public Iterable<Place> listAllPlace() {
        return placeRepository.findAll();
    }

    @Override
    public Place getPlaceById(Integer id) {
        return placeRepository.findById(id).get();
    }

}
