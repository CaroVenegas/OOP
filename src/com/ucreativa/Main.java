package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familia;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Familia mama  = new Familia("Maribel","103450678",53,true,"mama");
        Amigo jose = new Amigo("jose","406870987",35,false,"amigo","N/A" );
        Familia hermano = new Familia("Ricardo","402060476",34,true,"hermano");

        ArrayList<BitacoraVacunas> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacunas(mama,"Pfizer", new Date()));
        bitacora.add(new BitacoraVacunas(jose,"Astra",new Date()));
        bitacora.add(new BitacoraVacunas(hermano,"Johnson",new Date()));


    }
}
