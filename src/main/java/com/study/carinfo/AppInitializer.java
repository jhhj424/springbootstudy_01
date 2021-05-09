package com.study.carinfo;

import com.study.carinfo.domain.Company;
import com.study.carinfo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
public class AppInitializer {

    @Autowired
    CompanyService companyService;

    @PostConstruct
    private void init() {
        Company company1 = new Company();
        company1.setCompanyName("페라리");
        company1.setCompanyNation("이탈리아");
        company1.setCreatedAt(new Date());
        company1.setUpdatedAt(new Date());

        Company company2 = new Company();
        company2.setCompanyName("람보르기니");
        company2.setCompanyNation("이탈리아");
        company2.setCreatedAt(new Date());
        company2.setUpdatedAt(new Date());

        Company company3 = new Company();
        company3.setCompanyName("벤츠");
        company3.setCompanyNation("독일");
        company3.setCreatedAt(new Date());
        company3.setUpdatedAt(new Date());

        Company company4 = new Company();
        company4.setCompanyName("BMW");
        company4.setCompanyNation("독일");
        company4.setCreatedAt(new Date());
        company4.setUpdatedAt(new Date());

        Company company5 = new Company();
        company5.setCompanyName("현대차");
        company5.setCompanyNation("한국");
        company5.setCreatedAt(new Date());
        company5.setUpdatedAt(new Date());

        companyService.save(company1);
        companyService.save(company2);
        companyService.save(company3);
        companyService.save(company4);
        companyService.save(company5);
    }
}
