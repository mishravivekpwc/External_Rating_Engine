package com.pwc.rating.requestDto;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Plan {


    private String planName;
    private List<Coverage> coverages;
    private String pricingTier;
    private List<Rider> riders;
    private BigDecimal individualFaceAmountPct;
    private BigDecimal spouseFaceAmountPct;
    private BigDecimal childFaceAmountPct;

}
