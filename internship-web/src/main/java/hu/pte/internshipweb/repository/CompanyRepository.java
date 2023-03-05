package hu.pte.internshipweb.repository;

import hu.pte.internshipweb.model.Company;


import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long>{

    @Query("SELECT c FROM Company c WHERE c.isValid = true")
    List<Company> findValidCompanies();
}
