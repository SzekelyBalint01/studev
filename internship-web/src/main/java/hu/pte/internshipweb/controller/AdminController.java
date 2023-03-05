package hu.pte.internshipweb.controller;

import hu.pte.internshipweb.model.Company;
import hu.pte.internshipweb.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    private final CompanyService companyService;

    public AdminController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/allCompanies")
    public ResponseEntity<List<Company>> getAllCompany(){

        List<Company> company = companyService.getAllCompany();

        return new ResponseEntity(company, HttpStatus.OK);
    }
}
