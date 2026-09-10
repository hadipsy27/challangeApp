package com.labs.challangeApp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChallengeService {

    private List<Challange> challanges = new ArrayList<>();
    private Long nextId = 1L;

    public ChallengeService(){
    }


    public List<Challange> getAllChallenges(){
        return challanges;
    }

    public boolean addChallange(Challange challange){
        if(challange != null){
            challange.setId(nextId++);
            challanges.add(challange);
            return true;
        } else {
            return false;
        }

    }
}
