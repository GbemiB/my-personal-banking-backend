package com.example.bankingtransactions.repository.impl;

import com.example.bankingtransactions.entity.CustomerEnrollment;
import com.example.bankingtransactions.repository.CustomerEnrollmentRep;
import com.example.bankingtransactions.utility.DbConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerEnrollmentRepImpl implements CustomerEnrollmentRep {

    private static final Logger logger = LoggerFactory.getLogger(CustomerEnrollmentRepImpl.class);

    @Value("${db.package}")
    private String dataBase;

    private final DbConnection dbConnection;

    public CustomerEnrollmentRepImpl(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }


    @Override
    public String saveCustomer(CustomerEnrollment customerEnrollment) throws Exception {
        return null;
    }
}
