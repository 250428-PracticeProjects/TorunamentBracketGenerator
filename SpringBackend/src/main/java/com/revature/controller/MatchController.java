package com.revature.controller;
import com.revature.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("matches")
@RestController
public class MatchController {

    private final MatchService matchService;

    // Constructor-based dependency injection
    @Autowired
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }
    // Add methods to handle match-related requests here
}
