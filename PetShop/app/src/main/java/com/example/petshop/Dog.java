package com.example.petshop;

public class Dog extends Pet implements Pettable{

    public Dog(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "bark";
    }

    @Override
    public Void pet(){
        return null;
    }
}
