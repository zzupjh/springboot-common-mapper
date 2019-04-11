package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "a_student") //作用在类上 指定数据库表名
public class User {
    @Id
    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    private Integer stuGender;

}
