package com.example.tinkoffservice.Exception;

public class StockNotFoundException extends RuntimeException {
    public StockNotFoundException(String message){
        super(message);
    }
}
