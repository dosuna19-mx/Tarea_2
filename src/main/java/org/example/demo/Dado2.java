package org.example.demo;

import java.util.Random;

/**
 * Clase enfocada a las características principales de un dado.
 * Además de simular lanzamientos del mismo.
 * 
 * @author
 * @version 1.0
 */
public class Dado2 {
    private int caras;
    private String colorDado;
    private String colorPuntos;
    private int caraActual;

    public Dado2(){
        caras=6;
        lanzar();
    }
    
    public int getCaras(){
        return caras;
    }
    

    public int lanzar(){
        Random rmd=new Random();
        caraActual=rmd.nextInt(6)+1;
        return caraActual;
        
    }
    
    // METODO PARA OBTENER LA CARA ACTUAL DEL DADO
    public int getCaraActual(){
        return caraActual;
    }
    

    public String toString(){
        return("Dado1: " + getCaraActual());
    }
}


