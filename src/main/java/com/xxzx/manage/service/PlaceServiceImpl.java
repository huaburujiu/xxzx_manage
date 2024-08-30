package com.xxzx.manage.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxzx.manage.entity.Place;
import com.xxzx.manage.repository.PlaceRepository;
import com.xxzx.manage.specification.PlaceByIdsSpecification;
import com.xxzx.manage.specification.PlaceSpecifications;

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

    @Override
    public Iterable<Place> selectPlaceLikeName(String nameLike) {
        return placeRepository.findAll(PlaceSpecifications.likeName(nameLike));
    }

    @Override
    public Iterable<Place> selectPlaceByIds(Collection<Integer> ids) {
        return placeRepository.findAll(new PlaceByIdsSpecification(ids));
    }
}
