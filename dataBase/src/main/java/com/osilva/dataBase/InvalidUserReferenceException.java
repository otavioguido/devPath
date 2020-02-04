package com.osilva.dataBase;

public class InvalidUserReferenceException extends RuntimeException {
    public InvalidUserReferenceException(String errorMessage){
        super(errorMessage);
    }
}
