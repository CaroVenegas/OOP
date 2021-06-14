package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familia;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.repositories.Repository;


import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Repository repo = new FileRepository();
        String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca, print;
        Persona persona;
        boolean continuar = true;
        while (continuar) {
            System.out.println("Nombre");
            nombre = in.nextLine();
            System.out.println("Cedula");
            cedula = in.nextLine();
            System.out.println("Edad");
            edad = in.nextLine();
            System.out.println("Riesgo");
            riesgo = in.nextLine();
            System.out.println("Amigo(A)/Familiar(F):");
            isAmigo = in.nextLine();
            if (isAmigo.equals("A")){
                System.out.println(("Relacion:"));
                relacion = in.nextLine();
                System.out.println("Facebook:");
                facebook = in.nextLine();
                persona = new Amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), relacion, facebook);

            } else {
                System.out.println("Parentesco:");
                parentesco = in.nextLine();
                persona = new Familia(nombre, cedula,Integer.parseInt (edad), riesgo.equals("S"), parentesco );

            }
            System.out.println("Vacuna--Marca:");
            marca = in.nextLine();
            repo.save(persona,marca,new Date());
            System.out.println("Quiere imprimir Lista (S)");
            print = in.nextLine();

            if (print.equals("S")){
                for (String item : repo.get()) {
                    System.out.println(item);
                }
            }
            System.out.println("Desea continuar(S)");
            String txtContinuar = in.nextLine();
            continuar = !txtContinuar.equals("N");
        }
    }
}