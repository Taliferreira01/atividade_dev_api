package com.example.demo.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String ru;
    private String tarefa;
    private String data; // você pode trocar para LocalDate se quiser trabalhar com data de verdade

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    // hashCode, equals e toString
    @Override
    public int hashCode() {
        return Objects.hash(id, name, ru, tarefa, data);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contato other = (Contato) obj;
        return Objects.equals(id, other.id) &&
               Objects.equals(name, other.name) &&
               Objects.equals(ru, other.ru) &&
               Objects.equals(tarefa, other.tarefa) &&
               Objects.equals(data, other.data);
    }

    @Override
    public String toString() {
        return "Contato [id=" + id + ", name=" + name + ", ru=" + ru + ", tarefa=" + tarefa + ", data=" + data + "]";
    }
}
