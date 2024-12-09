
package com.example.defsocbackend.web.rest;

import com.example.defsocbackend.domain.SummaryResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api/report")
public class ReportController {

    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping
    public ResponseEntity<SummaryResponse> getReports() throws IOException {
        ClassPathResource resource = new ClassPathResource("data/data.json");
        String content = new String(Files.readAllBytes(Paths.get(resource.getURI())));

        SummaryResponse summaryResponse = objectMapper.readValue(content, SummaryResponse.class);

        return new ResponseEntity<>(summaryResponse, HttpStatus.OK);
    }
}
