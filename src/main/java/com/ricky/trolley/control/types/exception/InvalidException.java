package com.ricky.trolley.control.types.exception;

import com.ricky.trolley.control.types.constants.ExceptionCodeConstant;

public class InvalidException extends BaseException {

    public InvalidException(String message) {
        super(message, ExceptionCodeConstant.INVALID_EXCEPTION);
    }

    public InvalidException(String message, Throwable cause) {
        super(message, cause, ExceptionCodeConstant.INVALID_EXCEPTION);
    }

    public InvalidException(Throwable cause) {
        super(cause, ExceptionCodeConstant.INVALID_EXCEPTION);
    }

}
