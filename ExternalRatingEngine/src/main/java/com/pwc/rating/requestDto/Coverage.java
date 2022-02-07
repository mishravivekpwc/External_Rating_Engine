package com.pwc.rating.requestDto;

import lombok.*;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Coverage {


    private String coverageName;
    private BigDecimal limitAmount;
}
