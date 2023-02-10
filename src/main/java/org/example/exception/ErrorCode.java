package org.example.exception;

public enum ErrorCode {

    WRONG_JSON("Incorrect data in json");

    private final String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
