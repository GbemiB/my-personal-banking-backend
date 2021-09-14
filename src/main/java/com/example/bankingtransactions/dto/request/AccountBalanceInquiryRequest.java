package com.example.bankingtransactions.dto.request;

import lombok.Data;

@Data
public class AccountBalanceInquiryRequest {

    GeneralRequest generalRequest = new GeneralRequest();
    private String accountName;
    private String accountNumber;
    private String accountBVN;

}
