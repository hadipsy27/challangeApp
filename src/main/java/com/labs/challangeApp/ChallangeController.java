package com.labs.challangeApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChallangeController {

    private ChallengeService challengeService;

    public ChallangeController(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    @GetMapping("/challanges")
    public List<Challange> getAllChallanges() {
        return challengeService.getAllChallenges();
    }

    @PostMapping("/challanges")
    public String addChallange(@RequestBody Challange challange){
        boolean isChallengeAdded = challengeService.addChallange(challange);
        if(isChallengeAdded){
            return "Challange added successfully";
        } else  {
            return "Challange could not be added";
        }
    }
}
