package com.example.bankingtransactions.validation.validationimpl;

import com.example.bankingtransactions.dto.ValidationResponse;
import com.example.bankingtransactions.dto.request.CustomerEnrollmentRequest;
import com.example.bankingtransactions.validation.CustomerDetailsValidation;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import static java.util.Objects.nonNull;

@Component
public class CustomerDetailsValidationImpl implements CustomerDetailsValidation {

    @Override
    public Boolean validateAccountName(CustomerEnrollmentRequest enrollmentRequest, ValidationResponse response) {
        response.setStatus(HttpStatus.BAD_REQUEST);
        if ((!nonNull(enrollmentRequest.getAccountFirstName())) && (!nonNull(enrollmentRequest.getAccountLastName()))
                || enrollmentRequest.getAccountFirstName().trim().isEmpty() || enrollmentRequest.getAccountLastName()
                .trim().isEmpty()) {
            response.setResponseMessage("First name or last name cannot be empty");
            return false;
        }
        response.setStatus(HttpStatus.OK);
        return true;
    }

    @Override
    public Boolean validateAccountNumeric(CustomerEnrollmentRequest enrollmentRequest, ValidationResponse response) {
        response.setStatus(HttpStatus.BAD_REQUEST);
        if (!nonNull(enrollmentRequest.getAccountBVN()) || (enrollmentRequest.getAccountBVN().length() < 11)) {
            response.setResponseMessage("BVN cannot be less than eleven figures");
            return false;
        }

        if (!nonNull(enrollmentRequest.getAccountNumber()) || (enrollmentRequest.getAccountBVN().length() < 11)) {
            response.setResponseMessage("Account number cannot be less than eleven figures");
            return false;
        }
        response.setStatus(HttpStatus.OK);
        return  true;
    }

    @Override
    public Boolean validateCustomerLocation(CustomerEnrollmentRequest enrollmentRequest, ValidationResponse response) {

        if(!nonNull(enrollmentRequest.getAccountOwnerCountryOfResidence()) ||
                enrollmentRequest.getAccountOwnerCountryOfResidence().trim().isEmpty()) {
            response.setResponseMessage("Country of residence cannot be empty");
            return  false;
        }

        if(!nonNull(enrollmentRequest.getAccountOwnerCityOfResidence()) ||
                enrollmentRequest.getAccountOwnerCityOfResidence().trim().isEmpty()) {
            response.setResponseMessage("City of residence cannot be empty");
            return  false;
        }

        if(!nonNull(enrollmentRequest.getAccountCountryCode()) ||
                enrollmentRequest.getAccountCountryCode().trim().isEmpty()) {
            response.setResponseMessage("Country code cannot be empty");
            return  false;
        }

        if(!nonNull(enrollmentRequest.getAccountCityCode()) ||
                enrollmentRequest.getAccountCityCode().trim().isEmpty()) {
            response.setResponseMessage("City code cannot be empty");
            return  false;
        }
        response.setStatus(HttpStatus.OK);
        return  true;
    }
}
