package com.team7.enterpriseexpensemanagementsystem.exception;

public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }
}
