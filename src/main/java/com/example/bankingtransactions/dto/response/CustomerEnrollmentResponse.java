package com.example.bankingtransactions.dto.response;

import lombok.Data;

@Data
public class CustomerEnrollmentResponse {
    GeneralResponse generalResponse = new GeneralResponse();
    boolean isCustomerEnrolled;
    boolean isCustomerEligibleForEnrollment;
    private String enrollmentErrorMessage;
}
