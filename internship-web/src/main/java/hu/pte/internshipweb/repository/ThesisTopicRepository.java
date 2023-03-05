package hu.pte.internshipweb.repository;

import hu.pte.internshipweb.model.ThesisTopic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThesisTopicRepository extends JpaRepository<ThesisTopic, Long> {

    @Query("SELECT t FROM ThesisTopic t WHERE t.isVisible = true")
    List<ThesisTopic> findVisibleThesisTopic();
}
