package com.pwc.rating.requestDto;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Insured {
    private Integer age;
    private String gender;
    private boolean primaryInsured;
    boolean smokingFlag;
}
