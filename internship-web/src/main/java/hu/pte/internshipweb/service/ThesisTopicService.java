package hu.pte.internshipweb.service;

import hu.pte.internshipweb.model.ThesisTopic;
import hu.pte.internshipweb.repository.ThesisTopicRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThesisTopicService {

    private final ThesisTopicRepository thesisTopicRepository;

    public ThesisTopicService(ThesisTopicRepository thesisTopicRepository) {
        this.thesisTopicRepository = thesisTopicRepository;
    }

    public List<ThesisTopic> getAllVisibleThesisTopic(){
        List<ThesisTopic> thesisTopics = thesisTopicRepository.findVisibleThesisTopic();
        return thesisTopics;
    }
}
