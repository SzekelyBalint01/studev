package hu.pte.internshipweb.controller;

import hu.pte.internshipweb.model.Company;
import hu.pte.internshipweb.model.Internship;
import hu.pte.internshipweb.service.InternshipService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InternshipController {


    private final InternshipService internshipService;

    public InternshipController(InternshipService internshipService) {
        this.internshipService = internshipService;
    }

    @GetMapping("/internship")
    public ResponseEntity<List<Internship>> getAllVisibleInternship(){

        List<Internship> Internship = internshipService.getAllVisibleInternship();

        return new ResponseEntity(Internship, HttpStatus.OK);
    }
}
