package com.example.bankingtransactions.dto.response;

import com.example.bankingtransactions.dto.CardEnrollmentStatus;
import lombok.Data;

@Data
public class CardEnrollmentResponse {

    GeneralResponse generalResponse = new GeneralResponse();
    CardEnrollmentStatus cardEnrollmentStatus;
}
