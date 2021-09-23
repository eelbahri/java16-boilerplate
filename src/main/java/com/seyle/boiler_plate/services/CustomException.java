package com.seyle.boiler_plate.services;

public class CustomException extends Exception {
    public CustomException(String errorMessage) {
        super(errorMessage);
    }
}
