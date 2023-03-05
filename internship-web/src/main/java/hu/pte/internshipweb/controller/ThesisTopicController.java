package hu.pte.internshipweb.controller;

import hu.pte.internshipweb.model.ThesisTopic;
import hu.pte.internshipweb.service.ThesisTopicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ThesisTopicController {
    private final ThesisTopicService thesisTopicService;

    public ThesisTopicController(ThesisTopicService thesisTopicService) {
        this.thesisTopicService = thesisTopicService;
    }

    @GetMapping("/thesisTopic")
    public ResponseEntity<List<ThesisTopic>> getAllVisibleThesisTopic(){
        List<ThesisTopic> thesisTopics = thesisTopicService.getAllVisibleThesisTopic();
        return new ResponseEntity(thesisTopics, HttpStatus.OK);
    }
}
