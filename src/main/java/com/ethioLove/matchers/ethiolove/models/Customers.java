package com.ethioLove.matchers.ethiolove.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers", uniqueConstraints={@UniqueConstraint(columnNames = "name"),@UniqueConstraint(columnNames = "nick_name")})
public class Customers {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="nick_name")
    private String nickName;
    @Column(name="sex")
    private String sex;
    @Column(name="education")
    private String education;
    @Column(name="occupation")
    private String occupation;
    @Column(name="face_color")
    private String faceColor;
    @Column(name="height")
    private String height;
    @Column(name="weight")
    private String weight;
    @Column(name="religion")
    private String religion;
    @Column(name="hair_Style")
    private String hairStyle;
    @Column(name="background")
    private String background;
    @Column(name="politics")
    private String politics;
    @Column(name="ethnicity")
    private String ethnicity;
    @Column(name="country")
    private String country;
    @Column(name="sexual_desire")
    private String sexualDesire;
    @Column(name="age")
    private String age;


}
