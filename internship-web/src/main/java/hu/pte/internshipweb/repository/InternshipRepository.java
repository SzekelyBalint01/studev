package hu.pte.internshipweb.repository;

import hu.pte.internshipweb.model.Internship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InternshipRepository extends JpaRepository<Internship, Long> {

    @Query("SELECT c FROM Internship c WHERE c.isVisible = true")
    List<Internship> findVisibleInternship();
}
