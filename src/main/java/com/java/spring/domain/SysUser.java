package com.java.spring.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SYS_USER")
public class SysUser  implements Serializable {

    private static final long serialVersionUID = -7768637914227571159L;

    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @Column(name = "ID", nullable = false, length = 42)
    private String id;

    @Column(name = "NAME",length = 12)
    private String name;

    @Column(name = "ADDRESS")
    private String addreess;

    @Column(name = "ID_CARD",length = 20)
    private String idCard;

    @Column(name = "SEX")
    private Integer sex;

    @Column(name = "YEAR",length = 4)
    private Integer year;

    @Column(name = "MONTH",length = 2)
    private Integer month;

    @Column(name = "DAY",length = 2)
    private Integer day;

    @Column(name = "CARD",length = 20)
    private String card;

    @Column(name = "NATURE",length = 10)
    private String nature;

    @Column(name = "EDUCATION",length = 10)
    private String education;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddreess() {
        return addreess;
    }

    public void setAddreess(String addreess) {
        this.addreess = addreess;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
