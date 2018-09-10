package com.j4ware.languagefeaturesjava7;

public class MyExceptionType1 extends Exception {

    public MyExceptionType1() {
    }

    public MyExceptionType1(String message) {
        super(message);
    }

    public MyExceptionType1(String message, Throwable cause) {
        super(message, cause);
    }

    public MyExceptionType1(Throwable cause) {
        super(cause);
    }
}

