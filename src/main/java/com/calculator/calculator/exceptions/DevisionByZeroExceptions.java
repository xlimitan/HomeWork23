package com.calculator.calculator.exceptions;

public class DevisionByZeroExceptions extends IllegalArgumentException{
    public DevisionByZeroExceptions() {
    }

    public DevisionByZeroExceptions(String s) {
        super(s);
    }

    public DevisionByZeroExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public DevisionByZeroExceptions(Throwable cause) {
        super(cause);
    }
}
