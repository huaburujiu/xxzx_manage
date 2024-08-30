package com.xxzx.manage.specification;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import com.xxzx.manage.entity.Place;


public class PlaceSpecifications {
    public static Specification<Place> likeName(String nameLike) {
        return (root, query, cb) -> {
            if (StringUtils.hasText(nameLike)) {
                return cb.like(root.get("name"), "%" + nameLike + "%");
            }
            return cb.conjunction(); // 返回空的criteria（无影响）
        };
    }
}
