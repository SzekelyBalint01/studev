package hu.pte.internshipweb.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Entity
@Table(name = "thesis_topic")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ThesisTopic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition ="SERIAL" , nullable = false)
    private Long id;

    private String name ;

    private String contactPersonName;

    private String contactPersonEmail;

    private String contactPersonPhoneNumber;

    @ElementCollection
    private ArrayList<String> technologies;

    @ElementCollection
    private ArrayList<String> majors;

    private String description;

    private boolean isVisible;

}
