package com.xxzx.manage.specification;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import com.xxzx.manage.entity.Place;

import jakarta.persistence.criteria.Predicate;

public class PlaceSpecifications {
    public static Specification<Place> likeName(String nameLike) {
        return (root, query, cb) -> {
            if (StringUtils.hasText(nameLike)) {
                return cb.like(root.get("name"), "%" + nameLike + "%");
            }
            return cb.conjunction(); // 返回空的criteria（无影响）
        };
    }

    public static Specification<Place> byIds(Collection<Integer> ids) {
        return (root, query, cb) -> {
            List<Predicate> predicates = ids.stream()
                    .map(id -> cb.equal(root.get("id"), id))
                    .collect(Collectors.toList());

            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}
