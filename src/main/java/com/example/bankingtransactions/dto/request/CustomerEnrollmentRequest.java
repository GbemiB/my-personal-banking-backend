package com.example.bankingtransactions.dto.request;

import com.example.bankingtransactions.dto.AccountBeneficiary;
import lombok.Data;

@Data
public class CustomerEnrollmentRequest {
    GeneralRequest generalRequest = new GeneralRequest();
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
    private AccountBeneficiary accountBeneficiary = new AccountBeneficiary();
    private String accountOfficer;
    private String tellerAgent;
    private String AccountOwnerDOB;
    private int age;
    private String AccountOwnerWeight;
    private String AccountOwnerHeight;
    private String AccountOwnerPlaceOfBirth;
    private String AccountOwnerLocation;
    private String AccountOwnerCityOfResidence;
    private String AccountOwnerCountryOfResidence;
}
