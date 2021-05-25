package com.ucreativa;

import com.ucreativa.familia.Carolina;
import com.ucreativa.familia.Carolina;
import com.ucreativa.familia.Maribel;

public class Main {

    public static void main(String[] args) {
        Carolina yo = new Carolina();
        Maribel mama =new Maribel("hola chiquillos");
        mama.setcumple();
        int edad = mama.getEdad();
        System.out.println("mi edad es" + edad);
        System.out.println("le gusta " + mama.getHobby());

        System.out.println("bye clase " + edad);

    }
}
