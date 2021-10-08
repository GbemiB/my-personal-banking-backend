package com.example.bankingtransactions.validation;

import com.example.bankingtransactions.dto.request.CustomerEnrollmentRequest;
import com.example.bankingtransactions.dto.response.CustomerEnrollmentResponse;
import org.springframework.stereotype.Component;

@Component
public interface AgeValidation {
   boolean ageValidator(CustomerEnrollmentRequest enrollmentRequest, CustomerEnrollmentResponse enrollmentResponse);
}
