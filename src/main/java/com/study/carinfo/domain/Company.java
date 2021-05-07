package com.study.carinfo.domain;

import lombok.Data;

import javax.persistence.*;

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
}
