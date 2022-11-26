package com.devsuperior.dscommerce.exeptions;

public class DatabaseExeption extends RuntimeException {

    public DatabaseExeption(String msg){
        super(msg);
    }
}
