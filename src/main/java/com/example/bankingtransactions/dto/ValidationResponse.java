package com.example.bankingtransactions.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ValidationResponse {
    private HttpStatus status = HttpStatus.OK;
    private String responseCode;
    private String responseMessage;
}
