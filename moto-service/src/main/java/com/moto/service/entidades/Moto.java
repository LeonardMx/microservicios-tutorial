package com.moto.service.entidades;

//import jakarta.persistence.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

@Entity
public class Moto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marca;
    private String modelo;
    private int usuarioId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Moto() {
    }

    public Moto(String marca, String modelo, int usuarioId) {
        this.marca = marca;
        this.modelo = modelo;
        this.usuarioId = usuarioId;
    }

    public Moto(int id, String marca, String modelo, int usuarioId) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.usuarioId = usuarioId;
    }
    
    

}
