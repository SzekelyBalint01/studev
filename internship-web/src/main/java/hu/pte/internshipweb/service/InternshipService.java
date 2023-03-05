package hu.pte.internshipweb.service;

import hu.pte.internshipweb.model.Company;
import hu.pte.internshipweb.model.Internship;
import hu.pte.internshipweb.repository.InternshipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipService {
    private final InternshipRepository internshipRepository;

    public InternshipService(InternshipRepository internshipRepository) {
        this.internshipRepository = internshipRepository;
    }

    public List<Internship> getAllVisibleInternship() {
        List<Internship> Internship = internshipRepository.findVisibleInternship();
        return Internship;
    }

    public List<Internship> getAllInternship(){
        List<Internship> Internship = internshipRepository.findAll();
        return Internship;
    }
}
