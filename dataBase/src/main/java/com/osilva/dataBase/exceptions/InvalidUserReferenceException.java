package com.osilva.dataBase.exceptions;

public class InvalidUserReferenceException extends RuntimeException {
    public InvalidUserReferenceException(String errorMessage){
        super(errorMessage);
    }
}
