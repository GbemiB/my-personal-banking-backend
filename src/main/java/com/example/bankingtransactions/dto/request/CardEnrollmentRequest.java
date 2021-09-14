package com.example.bankingtransactions.dto.request;

import lombok.Data;

@Data
public class CardEnrollmentRequest {

    GeneralRequest generalRequest = new GeneralRequest();
    private String accountId;
    private String accountName;
    private String accountNumber;
    private String accountType;
    private String accountBVN;
}
