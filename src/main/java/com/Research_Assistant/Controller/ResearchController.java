package com.Research_Assistant.Controller;

import com.Research_Assistant.Research.ResearchRequest;
import com.Research_Assistant.Service.ResearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/research")
@CrossOrigin(origins = "*")
public class ResearchController {
    private final ResearchService researchService;

    public ResearchController(ResearchService researchService) {
        this.researchService = researchService;
    }
    @PostMapping("/process")
    private ResponseEntity<String> processContent(@RequestBody ResearchRequest request) {
        String result=researchService.processContent(request);
        return ResponseEntity.ok(result);
    }
}
