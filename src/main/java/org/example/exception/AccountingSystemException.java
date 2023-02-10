package org.example.exception;

public class AccountingSystemException extends Exception {

    private final ErrorCode errorCode;

    public AccountingSystemException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
