package com.example.bankingtransactions.dto.request;

import lombok.Data;

@Data
public class GeneralRequest {
    private String bankCode;
    private String tellerCode;
    private String signatory;
}
