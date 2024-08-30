package com.xxzx.manage.specification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import com.xxzx.manage.entity.Member;

public class MemberSpecifications {
    public static Specification<Member> likeName(String nameLike) {
        return (root, query, cb) -> {
            if (StringUtils.hasText(nameLike)) {
                return cb.like(root.get("name"), "%" + nameLike + "%");
            }
            return cb.conjunction(); // 返回空的criteria（无影响）
        };
    }
}
