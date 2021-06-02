package com.ucreativa.vacunacion.entities;

public class Familia extends Persona {

    private String parentesco;

    public Familia(String nombre, String cedula, int edad, Boolean riesgo, String parentesco) {
        super(nombre, cedula, edad, riesgo);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }
}
