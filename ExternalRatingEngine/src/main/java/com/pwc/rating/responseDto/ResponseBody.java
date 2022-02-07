package com.pwc.rating.responseDto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

public class ResponseBody {

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
