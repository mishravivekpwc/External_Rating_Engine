package com.pwc.rating.responseDto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ResponseDTOCI {



    private List<Plan> planOutput = new ArrayList<>();

    public ResponseDTOCI() {
        //Default Constructor
    }
    public void setPlanOutput(List<Plan> planOutput) {
        this.planOutput = planOutput;
    }

    public List<Plan> getPlanOutput() {
        return planOutput;
    }

    public static class Plan {
        private String planName;
        private String coverageCd;
        private List<ClassificationGroup> classificationGroups = new ArrayList<>();

        public String getPlanName() {
            return planName;
        }

        public void setPlanName(String planName) {
            this.planName = planName;
        }

        public String getCoverageCd() {
            return coverageCd;
        }

        public void setCoverageCd(String coverageCd) {
            this.coverageCd = coverageCd;
        }

        public List<ClassificationGroup> getClassificationGroups() {
            return classificationGroups;
        }

        public void setClassificationGroups(List<ClassificationGroup> classificationGroups) {
            this.classificationGroups = classificationGroups;
        }
    }

    public static class ClassificationGroup {
        private String classificationGroupName;
        private String rateStructure;
        private List<SubGroup> subGroups = new ArrayList<>();

        public String getClassificationGroupName() {
            return classificationGroupName;
        }

        public void setClassificationGroupName(String classificationGroupName) {
            this.classificationGroupName = classificationGroupName;
        }

        public String getRateStructure() {
            return rateStructure;
        }

        public void setRateStructure(String rateStructure) {
            this.rateStructure = rateStructure;
        }

        public List<SubGroup> getSubGroups() {
            return subGroups;
        }

        public void setSubGroups(List<SubGroup> subGroups) {
            this.subGroups = subGroups;
        }
    }

    public static class SubGroup {
        private String subGroupName;
        private BigDecimal rate;

        public BigDecimal getRate() {
            return rate;
        }

        public void setRate(BigDecimal rate) {
            this.rate = rate;
        }

        public String getSubGroupName() {
            return subGroupName;
        }

        public void setSubGroupName(String subGroupName) {
            this.subGroupName = subGroupName;
        }

    }

    @JsonProperty("RatePerCoverage")
    private List<ResponseCoverageRate> coverageRates;

    @JsonProperty("RatePerRider")
    private List<ResponseRiderRate> riderRates;

    @JsonProperty("RenewalDiscount")
    private BigDecimal renewalDiscount;

    @JsonProperty("TotalMonthlyPremium")
    private BigDecimal monthlyPremium;

    public List<ResponseCoverageRate> getCoverageRates() {
        return coverageRates;
    }

    public void setCoverageRates(List<ResponseCoverageRate> coverageRates) {
        this.coverageRates = coverageRates;
    }

    public List<ResponseRiderRate> getRiderRates() {
        return riderRates;
    }

    public void setRiderRates(List<ResponseRiderRate> riderRates) {
        this.riderRates = riderRates;
    }

    public BigDecimal getRenewalDiscount() {
        return renewalDiscount;
    }

    public void setRenewalDiscount(BigDecimal renewalDiscount) {
        this.renewalDiscount = renewalDiscount;
    }

    public BigDecimal getMonthlyPremium() {
        return monthlyPremium;
    }

    public void setMonthlyPremium(BigDecimal monthlyPremium) {
        this.monthlyPremium = monthlyPremium;
    }
}

