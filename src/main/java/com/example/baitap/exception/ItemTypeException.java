package com.example.baitap.exception;

public class ItemTypeException extends Exception{
    private String message;
    public ItemTypeException (String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
