package hu.pte.internshipweb.controller;

import hu.pte.internshipweb.dto.CompanyDto;
import hu.pte.internshipweb.model.Company;
import hu.pte.internshipweb.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    /*
    * getAllCompany ---> list every VALID company on the landing page
    * GetCompanyById ---> selected company
    * creatCompany  --->  new company add to db (required data: email, password, companyName, companyRegistrationNumber
    * */


    /*list only the VALID companies*/
    @GetMapping("/companies")
    public ResponseEntity<List<Company>> getAllCompany(){
        List<Company> company = companyService.getAllValidCompany();
        return new ResponseEntity(company, HttpStatus.OK);
    }

    @PostMapping("/companyRegistration")
    public ResponseEntity<Company> companyRegistration(@RequestBody String email, String password, String companyName, String companyRegistrationNumber ){

        CompanyDto companyDto = new CompanyDto();

        companyDto.setRegistrationEmail(email);
        companyDto.setPassword(password);
        companyDto.setCompanyName(companyName);
        companyDto.setCompanyRegistrationNumber(companyRegistrationNumber);

        Company newCompany = companyService.createCompany(companyDto);

        return ResponseEntity.ok(newCompany);
    }

}
