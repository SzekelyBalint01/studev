package hu.pte.internshipweb.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.ArrayList;

@Entity
@Table(name = "internship")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Internship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition ="SERIAL" , nullable = false)
    private Long id;

    private String name;

    private String place;

    private String contactPersonName;

    private String contactPersonEmail;

    private String contactPersonPhoneNumber;

    private Timestamp startDate;

    private Timestamp endDate;

    @ElementCollection
    private ArrayList<String> technologies;

    @ElementCollection
    private ArrayList<String> majors;

    private boolean isContiguous;

    private boolean isPaid;

    private String description;

    private boolean isVisible;
}
