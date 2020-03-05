package com.ethioLove.matchers.ethiolove.models;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;
    @Column(name="fName")
    private String fName;
    @Column(name="lName")
    private String lName;
    @Column(name="email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name="phone")
    private String phone;
    @Column(name="sex")
    private String sex;

}
