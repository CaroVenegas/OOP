package com.ucreativa.familia;

public class Maribel {
     private int edad;
     private String hobby;


    public Maribel(String saludo){
        this.edad = 53;
        this.hobby = "cocinar";
        System.out.println(saludo);
    }

    public void setcumple() {
        this.edad = this.edad +1;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getHobby(){
        return hobby;
    }

}

