package com.xxzx.manage.service;

import com.xxzx.manage.entity.Place;

public interface PlaceService {
        Iterable<Place> listAllPlace();

        Place getPlaceById(Integer id);
}
