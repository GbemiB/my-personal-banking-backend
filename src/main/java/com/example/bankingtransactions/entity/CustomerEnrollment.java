package com.example.bankingtransactions.entity;

import lombok.Data;

@Data
public class CustomerEnrollment {

    private String accountId;
    private String accountFirstName;
    private String accountLastName;
    private String accountMiddleName;
    private String accountNumber;
    private String accountType;
    private String accountBVN;
    private String accountBranchCode;
    private String accountCityCode;
    private String accountCountryCode;
}
