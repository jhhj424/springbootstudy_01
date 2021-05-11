package com.study.carinfo.service;

import com.study.carinfo.domain.Company;
import com.study.carinfo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Transactional
    public Company saveCompanyInputDto(CompanyInputDTO companyInputDTO) {
        Company company = new Company();
        company.setCompanyName(companyInputDTO.getCompanyName());
        company.setCompanyNation(companyInputDTO.getCompanyNation());
        company.setCreatedAt(new Date());
        company.setUpdatedAt(new Date());

        return companyRepository.save(company);
    }

    public Company save(Company company) {
        return companyRepository.save(company);
    }

    public void saveAll(List<Company> companies) {
        companyRepository.saveAll(companies);
    }
}
