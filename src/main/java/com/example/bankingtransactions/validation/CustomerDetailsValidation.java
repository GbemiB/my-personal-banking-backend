package com.example.bankingtransactions.validation;

import com.example.bankingtransactions.dto.ValidationResponse;
import com.example.bankingtransactions.dto.request.CustomerEnrollmentRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface CustomerDetailsValidation {

    Boolean validateAccountName(CustomerEnrollmentRequest enrollmentRequest, ValidationResponse response);
    Boolean validateAccountNumeric(CustomerEnrollmentRequest enrollmentRequest, ValidationResponse response);
    Boolean validateCustomerLocation(CustomerEnrollmentRequest enrollmentRequest, ValidationResponse response);

}
