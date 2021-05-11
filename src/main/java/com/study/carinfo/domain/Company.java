package com.study.carinfo.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "company")
@Data
public class Company extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_nation")
    private String companyNation;

    public Company() {
    }

    public Company(String companyName, String companyNation) {
        this.companyName = companyName;
        this.companyNation = companyNation;
        super.setCreatedAt(new Date());
        super.setUpdatedAt(new Date());
    }
}
