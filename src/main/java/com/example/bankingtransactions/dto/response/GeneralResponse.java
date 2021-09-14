package com.example.bankingtransactions.dto.response;

import lombok.Data;

@Data
public class GeneralResponse {
    private String bankCode;
    private String tellerCode;
    private String responseCode;
    private String responseMessage;
}
