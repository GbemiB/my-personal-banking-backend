package com.example.bankingtransactions.testcontroller;

import com.example.bankingtransactions.entity.CustomerEnrollment;
import com.example.bankingtransactions.repository.CustomerEnrollmentRep;
import com.example.bankingtransactions.repository.impl.CustomerEnrollmentRepImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enrollment")
public class CustomerEnrollmentRepTest {

    private static final Logger logger = LoggerFactory.getLogger(CustomerEnrollmentRepTest.class);

    @Autowired
    CustomerEnrollmentRep customerEnrollmentRep;

    @PostMapping
    public String testSaveCustomer(@RequestBody CustomerEnrollment customerEnrollment) throws Exception{
        logger.info("Persisting customer details for enrollment" );
        return customerEnrollmentRep.saveCustomer(customerEnrollment);

    }




}
