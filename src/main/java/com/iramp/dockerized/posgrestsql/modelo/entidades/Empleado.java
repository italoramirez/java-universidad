package com.iramp.dockerized.posgrestsql.modelo.entidades;

import com.iramp.dockerized.posgrestsql.modelo.entidades.enums.TipoEmpleado;

import java.math.BigDecimal;

public class Empleado extends Persona {
    private BigDecimal sueldo;
    private TipoEmpleado tipoEmpleado;

    public Empleado() {
    }

    public Empleado(Integer id, String nombre, String apellido, String dni, Direccion direccion, BigDecimal sueldo) {
        super(id, nombre, apellido, dni, direccion);
        this.sueldo = sueldo;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }
}
