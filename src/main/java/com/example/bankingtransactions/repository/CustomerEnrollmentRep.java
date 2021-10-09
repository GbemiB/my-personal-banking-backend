package com.example.bankingtransactions.repository;

import com.example.bankingtransactions.entity.CustomerEnrollment;

public interface CustomerEnrollmentRep {

    String saveCustomer(CustomerEnrollment customerEnrollment) throws Exception;
}
