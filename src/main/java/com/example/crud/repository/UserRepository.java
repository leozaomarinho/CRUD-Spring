package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    //operacoes do banco de dados
    User findByUsername(String username); //metodo para buscar usuario por username

}
