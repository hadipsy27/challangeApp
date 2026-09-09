package com.labs.challangeApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChallangeController {

    private List<Challange> challanges = new ArrayList<>();

    public ChallangeController() {
        Challange challange1 = new Challange(1L, "January", "Learn a new programming language");
        challanges.add(challange1);
    }

    @GetMapping("/challanges")
    public List<Challange> getAllChallanges() {
        return challanges;
    }
}
