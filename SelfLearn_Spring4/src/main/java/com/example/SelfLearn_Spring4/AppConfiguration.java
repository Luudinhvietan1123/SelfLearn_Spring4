package com.example.SelfLearn_Spring4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean("MySQLConnector")
    DatabaseConnector MySQLConfigure(){
        DatabaseConnector MySQLConnector = new MySQLConnector();
        MySQLConnector.setUrl("MySQL url");
        return MySQLConnector;
    }

    @Bean("MongoDbConnector")
    DatabaseConnector MongoDbConfigure(){
        DatabaseConnector MongoDbConnector = new MongoDbConnector();
        MongoDbConnector.setUrl("MongoDb url");
        return MongoDbConnector;
    }

    @Bean("PostgreSQLConnector")
    DatabaseConnector PostgreSQLConnector(){
        DatabaseConnector PostgreSQLConnector = new PostgreSQLConnector();
        PostgreSQLConnector.setUrl("PostgreSQL url");
        return PostgreSQLConnector;
    }
}
