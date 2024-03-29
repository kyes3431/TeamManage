package com.gold.teammanage.entity;

import lombok.Data;

import jakarta.persistence.*;
@Entity
@Data
public class Member {

    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String grade; // 회원 등급

    private String name; // 이름

    private String type; // 등록종목

    private String day; // 신청일자 (ex: 2021-09-22)

    private String end; // 종료일자 (신청일자day + 잔여일수last)

    private int last; // 잔여일수

    private int money; // 지불금액

    private String phone;

    private String address;

}
