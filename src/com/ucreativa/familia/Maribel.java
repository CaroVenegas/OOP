package com.ucreativa.familia;

public class Maribel {
     private int edad;


    public Maribel(String saludo){
        this.edad = 53;
        System.out.println(saludo);
    }

    public Void setcumple() {
        this.edad = this.edad *1;
    }
    public int getEdad(){
        return this.edad;
    }

}

