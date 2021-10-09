package com.example.bankingtransactions.repository.impl;

import com.example.bankingtransactions.entity.CustomerEnrollment;
import com.example.bankingtransactions.repository.CustomerEnrollmentRep;
import com.example.bankingtransactions.utility.DbConnection;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.internal.OracleCallableStatement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

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

        logger.info("Persisting customer details for enrollment" );
        System.out.println("love............");

        String responseCode = "";
        String responseMessage = "";

        Connection conn = null;
        OracleCallableStatement callableStatement = null;

        try {
            conn = dbConnection.connect();
            callableStatement = (OracleCallableStatement) conn
                    .prepareCall("{ call " + dataBase + ".save_customer(?,?,?,?,?,?,?,?,?,?,?,?) }");

            callableStatement.registerOutParameter(1, OracleTypes.VARCHAR);
            callableStatement.registerOutParameter(2, OracleTypes.VARCHAR);
            callableStatement.setString(3, customerEnrollment.getAccountId());
            callableStatement.setString(4, customerEnrollment.getAccountFirstName());
            callableStatement.setString(5, customerEnrollment.getAccountLastName());
            callableStatement.setString(6, customerEnrollment.getAccountMiddleName());
            callableStatement.setString(7, customerEnrollment.getAccountNumber());
            callableStatement.setString(8, customerEnrollment.getAccountType());
            callableStatement.setString(9, customerEnrollment.getAccountBVN());
            callableStatement.setString(10, customerEnrollment.getAccountBranchCode());
            callableStatement.setString(11, customerEnrollment.getAccountCityCode());
            callableStatement.setString(12, customerEnrollment.getAccountCountryCode());
            callableStatement.execute();

            responseCode = callableStatement.getString(1);
            responseMessage = callableStatement.getString(2);

            logger.debug("Persisting customer details for enrollment: {}", responseCode);

        } catch (Exception ex) {
            logger.error("Error persisting customer details for enrollment {}", ex.getMessage());
            throw ex;
        } finally {
            dbConnection.closeConnection(conn, callableStatement);
        }

        return responseCode;
    }

}
