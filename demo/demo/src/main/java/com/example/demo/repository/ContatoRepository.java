package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Contato;

@Repository
public interface ContatoRepository  extends JpaRepository <Contato, Long>{

}
