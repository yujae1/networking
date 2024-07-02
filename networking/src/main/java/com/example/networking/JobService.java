package com.example.networking;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Arrays;

@Service
public class JobService {
    private final RestTemplate restTemplate;

    public JobService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

 
    public List<JobDTO> fetchJobsFromSaramin() {
        String url = "https://oapi.saramin.co.kr/job-search"; 
        ResponseEntity<JobDTO[]> response = restTemplate.getForEntity(url, JobDTO[].class);
        return Arrays.asList(response.getBody());
    }
}
