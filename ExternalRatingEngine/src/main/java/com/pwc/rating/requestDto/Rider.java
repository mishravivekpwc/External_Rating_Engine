package com.pwc.rating.requestDto;

import lombok.*;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Rider {


    private BigDecimal limitAmount;
    private String riderName;
    private BigDecimal limitAmountPct;
    private Integer maxPeriod;
    private Integer requiredDays;
    private Integer monthsAfterDiagnosis;
    private String additionalDiagnosisInd;
}
