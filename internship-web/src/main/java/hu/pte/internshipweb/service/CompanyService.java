package hu.pte.internshipweb.service;

import hu.pte.internshipweb.dto.CompanyDto;
import hu.pte.internshipweb.model.Company;
import hu.pte.internshipweb.repository.CompanyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAllValidCompany() {
        List<Company> companies = companyRepository.findValidCompanies();
        return companies;
    }

    public List<Company> getAllCompany() {
        List<Company> companies = companyRepository.findAll();
        return companies;
    }

    @Transactional
    public Company createCompany(CompanyDto companyDto) {

        Company newCompany =
                Company.builder()
                        .registrationEmail(companyDto.getRegistrationEmail())
                        .password(companyDto.getPassword())
                        .companyName(companyDto.getCompanyName())
                        .companyRegistrationNumber(companyDto.getCompanyRegistrationNumber())
                        .build();
        companyRepository.save(newCompany);

        return  newCompany;
    }
}
