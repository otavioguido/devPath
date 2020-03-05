package com.osilva.dataBase.services;

public class InvalidUserReferenceException extends RuntimeException {
    public InvalidUserReferenceException(String errorMessage){
        super(errorMessage);
    }
}
