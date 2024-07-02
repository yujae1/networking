// src/main/java/com/example/networking/JobController.java
package com.example.networking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/saramin")
    public String getSaraminJobs() {
        return jobService.fetchJobs();
    }
}
