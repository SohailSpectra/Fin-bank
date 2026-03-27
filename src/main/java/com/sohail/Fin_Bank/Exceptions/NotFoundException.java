package com.sohail.Fin_Bank.Exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String error) {
        super(error);
    }
}
