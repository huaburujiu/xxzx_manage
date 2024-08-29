package com.xxzx.manage.service;

import java.util.Collection;

import com.xxzx.manage.entity.Place;

public interface PlaceService {
        Iterable<Place> listAllPlace();

        Iterable<Place> selectPlaceLikeName(String nameLike);

        Iterable<Place> selectPlaceByIds(Collection<Integer> ids);

        Place getPlaceById(Integer id);
}
