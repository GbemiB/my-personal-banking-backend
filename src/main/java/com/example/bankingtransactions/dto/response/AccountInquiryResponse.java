package com.example.bankingtransactions.dto.response;

import com.example.bankingtransactions.dto.AccountBeneficiary;
import lombok.Data;

@Data
public class AccountInquiryResponse {

    GeneralResponse generalResponse = new GeneralResponse();
    private String accountId;
    private String accountName;
    private String accountNumber;
    private String accountType;
    private String accountBVN;
    private String accountBranchCode;
    private String accountCityCode;
    private String accountCountryCode;
    private AccountBeneficiary accountBeneficiary = new AccountBeneficiary();
    private String accountOfficer;
    private String tellerAgent;

}
