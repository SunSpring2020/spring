package com.java.spring.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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

    @Column(name = "PHONE",length = 11)
    private String phone;

    @Column(name = "SEX")
    private Integer sex;

    @Column(name = "BRITH_DAY", nullable = true, length = 7)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date brithDay;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBrithDay() {
        return brithDay;
    }

    public void setBrithDay(Date brithDay) {
        this.brithDay = brithDay;
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
