package com.pwc.rating.controller;

import com.pwc.rating.requestDto.Policy;
import com.pwc.rating.responseDto.ResponseDTOCI;
import com.pwc.rating.service.ExternalRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*Controller defined for sending response to EIS*/

@RestController
@RequestMapping("/rating")
public class ExternalRatingController {

    @Autowired
    ExternalRatingService externalService;


    @PostMapping("/criticalIllness")
    public ResponseDTOCI getRate(@RequestBody Policy policy){

        return externalService.getResponse(policy);
    }
}