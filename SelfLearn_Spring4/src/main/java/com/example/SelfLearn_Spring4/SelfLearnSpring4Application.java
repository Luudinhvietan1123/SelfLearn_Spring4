package com.example.SelfLearn_Spring4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SelfLearnSpring4Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SelfLearnSpring4Application.class);

		DatabaseConnector mysql = (DatabaseConnector) context.getBean("MySQLConnector");
		mysql.connect();

		DatabaseConnector postgresql = (DatabaseConnector) context.getBean("PostgreSQLConnector");
		postgresql.connect();

		DatabaseConnector mongodb = (DatabaseConnector) context.getBean("MongoDbConnector");
		mongodb.connect();
	}

}
