package com.pwc.rating.responseDto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ResponseCoverageRate {

    @JsonProperty("CoverageName")
    private String name;

    @JsonProperty("TotalRate")
    private BigDecimal rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}
