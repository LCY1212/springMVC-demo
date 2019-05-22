package com.practice.exception;

public class Myexception extends Exception {

    private String message;

    public Myexception(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
