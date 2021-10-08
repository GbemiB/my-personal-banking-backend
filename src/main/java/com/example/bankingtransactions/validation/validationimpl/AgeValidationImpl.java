package com.example.bankingtransactions.validation.validationimpl;

import com.example.bankingtransactions.dto.request.CustomerEnrollmentRequest;
import com.example.bankingtransactions.dto.response.CustomerEnrollmentResponse;
import com.example.bankingtransactions.validation.AgeValidation;
import org.springframework.stereotype.Component;


@Component
public class AgeValidationImpl implements AgeValidation {

    @Override
    public boolean ageValidator(CustomerEnrollmentRequest enrollmentRequest,
                                CustomerEnrollmentResponse enrollmentResponse) {

        if (enrollmentRequest.getAge() < 18 ){
            enrollmentResponse.setEnrollmentErrorMessage("Customer less than 18 years of age cannot be enrolled");
            enrollmentResponse.setCustomerEligibleForEnrollment(false);
        }
        enrollmentResponse.setCustomerEligibleForEnrollment(true);
        return true;
    }

}
