package com.labs.challangeApp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChallengeService {

    private List<Challange> challanges = new ArrayList<>();

    public ChallengeService(){
        Challange challange1 = new Challange(1L, "January", "Learn a new programming language");
        challanges.add(challange1);
    }


    public List<Challange> getAllChallenges(){
        return challanges;
    }

    public boolean addChallange(Challange challange){
        if(challange != null){
            challanges.add(challange);
            return true;
        } else {
            return false;
        }

    }
}
