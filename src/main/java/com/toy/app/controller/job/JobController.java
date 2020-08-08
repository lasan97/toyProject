package com.toy.app.controller.job;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobController {

	@GetMapping("/job")
    public String jobInit() throws Exception {
    	return "job/jobList"; 
    }
}
