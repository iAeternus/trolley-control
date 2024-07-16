package com.ricky.trolley.control.types.exception;

import com.ricky.trolley.control.types.constants.ExceptionCodeConstant;

public class NotFoundException extends BaseException {
    public NotFoundException(String message) {
        super(message, ExceptionCodeConstant.NOT_FOUND_EXCEPTION);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause, ExceptionCodeConstant.NOT_FOUND_EXCEPTION);
    }

    public NotFoundException(Throwable cause) {
        super(cause, ExceptionCodeConstant.NOT_FOUND_EXCEPTION);
    }
}
