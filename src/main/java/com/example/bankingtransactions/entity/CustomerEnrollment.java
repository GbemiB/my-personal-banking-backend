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

    @Override
    public String toString() {
        return "CustomerEnrollment{" +
                "accountId='" + accountId + '\'' +
                ", accountFirstName='" + accountFirstName + '\'' +
                ", accountLastName='" + accountLastName + '\'' +
                ", accountMiddleName='" + accountMiddleName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountBVN='" + accountBVN + '\'' +
                ", accountBranchCode='" + accountBranchCode + '\'' +
                ", accountCityCode='" + accountCityCode + '\'' +
                ", accountCountryCode='" + accountCountryCode + '\'' +
                '}';
    }
}
