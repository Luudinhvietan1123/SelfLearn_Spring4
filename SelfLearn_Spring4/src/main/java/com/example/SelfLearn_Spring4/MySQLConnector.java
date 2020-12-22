package com.example.SelfLearn_Spring4;

public class MySQLConnector extends DatabaseConnector{

    @Override
    public void connect(){
        System.out.println("MySQL DataBase connected! Url: " + getUrl());
    }
}
