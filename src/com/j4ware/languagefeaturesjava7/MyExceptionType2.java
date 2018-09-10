package com.j4ware.languagefeaturesjava7;

public class MyExceptionType2 extends Exception {

    public MyExceptionType2() {
    }

    public MyExceptionType2(String message) {
        super(message);
    }

    public MyExceptionType2(String message, Throwable cause) {
        super(message, cause);
    }

    public MyExceptionType2(Throwable cause) {
        super(cause);
    }
}

