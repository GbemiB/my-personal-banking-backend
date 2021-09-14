package com.example.bankingtransactions.dto.response;

import lombok.Data;

@Data
public class AccountBalanceInquiryResponse {

    GeneralResponse generalResponse = new GeneralResponse();
    private String accountBalance;
    Boolean isAccountValidForTransfer;
    Boolean isAccountValidForDeposit;
    Boolean isAccountValidForWithdrawal;
    Boolean isAccountValidForAirtimeTopUp;
}
