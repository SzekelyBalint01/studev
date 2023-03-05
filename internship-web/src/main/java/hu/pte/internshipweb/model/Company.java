package hu.pte.internshipweb.model;

import lombok.*;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;

@Entity
@Table(name = "company")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition ="SERIAL" , nullable = false)
    private Long id;

    private String companyName;

    private String city;

    private String  address;

    @ElementCollection
    private ArrayList<String> technologies;


    @ElementCollection
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

    @ElementCollection
    private ArrayList<Long> internships;

    @ElementCollection
    private ArrayList<Long> thesisTopics;

    private Timestamp registrationDate;

    private String role;

    private boolean deleted = false;

}
