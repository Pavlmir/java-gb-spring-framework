package ru.gb.config;

public class BadRequestException extends Throwable {
    public BadRequestException(String msg){
        super(msg);
    }
}