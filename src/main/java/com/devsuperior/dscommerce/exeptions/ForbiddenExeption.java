package com.devsuperior.dscommerce.exeptions;

public class ForbiddenExeption extends RuntimeException {

    public ForbiddenExeption(String msg){
        super(msg);
    }
}
