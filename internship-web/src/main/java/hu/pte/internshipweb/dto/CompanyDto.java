package hu.pte.internshipweb.dto;

import jakarta.persistence.ElementCollection;
import lombok.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyDto {
    private Long id;

    private String companyName;

    private String city;

    private String  address;

    private ArrayList<String> technologies;


    private ArrayList<String> majorIndustries;

    private Integer maxStudents;

    private String registrationEmail;

    private String password;

    private String contactPersonFirstname;

    private String contactPersonLastname;

    private String contactPersonPhoneNumber;

    private String contactPersonEmail;

    private String companyRegistrationNumber;

    private String companyTaxNumber;

    private String description;

    private boolean isValid;

    private String companyLogoLink;

    private String facebook;

    private String linkedIn;

    private String twitter;

    private String youtube;

    private String website;

    private ArrayList<Long> internships;

    private ArrayList<Long> thesisTopics;

    private Timestamp registrationDate;

    private String role;

    private boolean deleted = false;
}
