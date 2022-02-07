package com.pwc.rating.requestDto;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Policy {

    private Long policyID;
    private Date currentDate;
    private  String lob;
    private Insured insureds;
    private Plan plan;
    private String quoteType;
    private Date effectiveDate;
    private Date requestDate;
}
