package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity //sera uma tabela na db
@Data
public class User {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private Long id;
    private String username;
    private String password; //senha armazenada em texto puro, altera para armazenar em hash

    private String email;

}
