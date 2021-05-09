package com.study.carinfo.controller;

import com.study.carinfo.service.CompanyInputDTO;
import com.study.carinfo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BasicController {

    @Autowired
    CompanyService companyService;

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/companyForm")
    public String companyForm(Model model) {
        return "companyForm";
    }

    @RequestMapping("/saveCompany")
    public String saveCompany(@ModelAttribute(name = "comapnyInputDTO")CompanyInputDTO companyInputDTO, Model model) {
        companyService.saveCompanyInputDto(companyInputDTO);

        return "index";
    }
}
