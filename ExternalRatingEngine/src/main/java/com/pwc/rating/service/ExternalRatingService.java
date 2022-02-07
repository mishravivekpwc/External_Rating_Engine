package com.pwc.rating.service;

import com.pwc.rating.requestDto.Policy;
import com.pwc.rating.responseDto.ResponseDTOCI;

public interface ExternalRatingService {

/*Service response method*/
     ResponseDTOCI getResponse(Policy policy);

}
