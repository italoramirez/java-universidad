package com.iramp.dockerized.posgrestsql.modelo.entidades;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity(name = "direcciones")
@Getter
@Setter
public class Direccion implements Serializable {

    private  String calle;
    private String numero;
    private String codigoPostal;
    private String dpto;
    private String piso;
    private String localidad;
}
