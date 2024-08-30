package com.xxzx.manage.specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import java.util.Collection;
import java.util.Collections;

import org.springframework.data.jpa.domain.Specification;

import com.xxzx.manage.entity.Member;

// 假设这是你的Specification实现  
public class MemberByIdsSpecification implements Specification<Member> {

    private final Collection<Integer> ids;

    public MemberByIdsSpecification(Collection<Integer> ids) {
        this.ids = ids != null ? ids : Collections.emptyList(); // 防止null值
    }

    @Override
    public Predicate toPredicate(Root<Member> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        if (ids.isEmpty()) {
            return cb.isFalse(cb.literal(true));
        }

        return cb.in(root.get("id")).value(ids);
    }
}
