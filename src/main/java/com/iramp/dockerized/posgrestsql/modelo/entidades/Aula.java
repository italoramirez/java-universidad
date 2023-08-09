package com.iramp.dockerized.posgrestsql.modelo.entidades;

import com.iramp.dockerized.posgrestsql.modelo.entidades.enums.Pizarron;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Aula implements Serializable {
    private Integer id;
    private String nroAula;
    private String medidas;
    private Integer cantidadPupitres;
    private Pizarron pizarron;

    private LocalDate fechaAlta;
    private LocalDate fechaModificacion;

    public Aula() {
    }

    public Aula(Integer id, String nroAula, String medidas, Integer cantidadPupitres, Pizarron pizarron, LocalDate fechaAlta, LocalDate fechaModificacion) {
        this.id = id;
        this.nroAula = nroAula;
        this.medidas = medidas;
        this.cantidadPupitres = cantidadPupitres;
        this.pizarron = pizarron;
        this.fechaAlta = fechaAlta;
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", nroAula='" + nroAula + '\'' +
                ", medidas='" + medidas + '\'' +
                ", cantidadPupitres=" + cantidadPupitres +
                ", pizarron=" + pizarron +
                ", fechaAlta=" + fechaAlta +
                ", fechaModificacion=" + fechaModificacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aula aula = (Aula) o;
        return Objects.equals(id, aula.id) && Objects.equals(nroAula, aula.nroAula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nroAula);
    }
}
