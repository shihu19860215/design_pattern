package com.msh.model.factory.one;

public class SimpleFactory {
    public ICar getCarByName(String name){
        if("BMW".equals(name)){
            return new BMW();
        }else if("Benz".equals(name)){
            return new Benz();
        }else {
            throw new RuntimeException("not this type name:" + name);
        }
    }
}
