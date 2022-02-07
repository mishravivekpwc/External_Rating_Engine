package com.pwc.rating.service.impl;

import com.pwc.rating.requestDto.Policy;
import com.pwc.rating.responseDto.ResponseCoverageRate;
import com.pwc.rating.responseDto.ResponseDTOCI;
import com.pwc.rating.responseDto.ResponseRiderRate;
import com.pwc.rating.service.ExternalRatingService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExternalServiceImpl implements ExternalRatingService {


     /*Service implemetation part*/

    public ResponseDTOCI getResponse(Policy policy) {


        ResponseDTOCI response = new ResponseDTOCI();



        List<ResponseDTOCI.SubGroup> subGroup = new ArrayList<>();
        ResponseDTOCI.SubGroup subgrp = new ResponseDTOCI.SubGroup();
        subgrp.setSubGroupName("Testing");
        subgrp.setRate(BigDecimal.valueOf(3.00000000));
        subGroup.add(subgrp);

        List<ResponseDTOCI.ClassificationGroup> classificationGroups = new ArrayList<>();
        ResponseDTOCI.ClassificationGroup classification = new ResponseDTOCI.ClassificationGroup();

        classification.setClassificationGroupName("Test");
        classification.setRateStructure("rate_structure");
        classification.setSubGroups(subGroup);
        classificationGroups.add(classification);

        List<ResponseDTOCI.Plan> plans = new ArrayList<>();
        ResponseDTOCI.Plan plan = new ResponseDTOCI.Plan();
        plan.setPlanName("plant1");
        plan.setCoverageCd("ABC");
        plan.setClassificationGroups(classificationGroups);
        plans.add(plan);

        response.setPlanOutput(plans);

        response.setMonthlyPremium(new BigDecimal("23.88"));
        response.setRenewalDiscount(new BigDecimal("15.01"));

        List<ResponseCoverageRate> coverageRateList = new ArrayList<>();
        ResponseCoverageRate responseCoverageRate = new ResponseCoverageRate();
        responseCoverageRate.setName("coverage1");
        responseCoverageRate.setRate(new BigDecimal("123.8"));

        coverageRateList.add(responseCoverageRate);

        List<ResponseRiderRate> responseRiderRatesList = new ArrayList<>();

        ResponseRiderRate responseRiderRate = new ResponseRiderRate();
        responseRiderRate.setName("Rider1");
        responseRiderRate.setRate(new BigDecimal("13.8"));


        responseRiderRatesList.add(responseRiderRate);

        response.setCoverageRates(coverageRateList);
        response.setRiderRates(responseRiderRatesList);

        return response;





    }
}
