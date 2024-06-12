package com.luna.springboot;

import com.luna.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class springboot implements CommandLineRunner{
    private static final Logger log = LoggerFactory.getLogger(springboot.class);

    public static void main(String args[]){
        SpringApplication.run(springboot.class, args);
        
    }

@Autowired
JdbcTemplate JdbcTemplate;

@Override
public void run(String... strings) throws Exception{

    log.info("Criando tabelas :3");

    JdbcTemplate.execute("DROP TABLE Produto IF EXISTS");
    JdbcTemplate.execute(" CREATE TABLE Produto(" +
        "id SERIAL, nome VARCHAR(50), desc VARCHAR(50), preco SERIAL, qnt SERIAL, categ VARCHAR(50))"
    );
}
}

