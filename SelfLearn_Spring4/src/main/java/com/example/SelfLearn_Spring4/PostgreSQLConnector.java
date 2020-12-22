package com.example.SelfLearn_Spring4;

public class PostgreSQLConnector extends DatabaseConnector {

    @Override
    public void connect(){
        System.out.println("PostgreSQL DataBase connected! Url: " + getUrl());
    }
}
