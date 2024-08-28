package com.xxzx.manage.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xxzx.manage.util.IntegerListToJsonConverter;
import com.xxzx.manage.util.StringListToJsonConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "mission")
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Convert(converter = IntegerListToJsonConverter.class)
    @Column(name = "member", nullable = false)
    private List<Integer> member;
    @Convert(converter = IntegerListToJsonConverter.class)
    @Column(name = "place", nullable = false)
    private List<Integer> place;
    @Column(name = "s_date", nullable = false)
    private LocalDateTime s_date;
    @Column(name = "e_date", nullable = false)
    private LocalDateTime e_date;
    @Column(name = "content", nullable = false, length = 100)
    private String content;
    @Column(name = "vehicle", nullable = false, length = 32)
    private String vehicle;
    @Column(name = "img", columnDefinition = "json")
    private String img;

    public Mission() {

    }

    public Mission(Integer id, List<Integer> member, List<Integer> place, LocalDateTime s_date, LocalDateTime e_date,
            String content,
            String vehicle,
            String img) {
        super();
        this.id = id;
        this.member = member;
        this.place = place;
        this.s_date = s_date;
        this.e_date = e_date;
        this.content = content;
        this.vehicle = vehicle;
        this.img = img;
    }
}
