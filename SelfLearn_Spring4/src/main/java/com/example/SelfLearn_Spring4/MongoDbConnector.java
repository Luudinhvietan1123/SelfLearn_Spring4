package com.example.SelfLearn_Spring4;

public class MongoDbConnector extends DatabaseConnector {

    @Override
    public void connect(){
        System.out.println("Mongo DataBase connected! Url: " + getUrl());
    }
}
