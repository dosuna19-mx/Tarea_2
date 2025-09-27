package org.example.demo;

public class Juego3Daditos {
    private Dado2 dado1;
    private Dado2 dado2;
    private Dado2 dado3;

    // CONSTRUCTOR
    public Juego3Daditos(){
        this.dado1=new Dado2();
        this.dado2=new Dado2();
        this.dado3=new Dado2();
    }

    public void lanzar3Dados(){
        dado1.lanzar();
        dado2.lanzar();
        dado3.lanzar();
    }

    public boolean los3Iguales(){
        if (dado1.getCaraActual()==dado2.getCaraActual() && dado2.getCaraActual()==dado3.getCaraActual() && dado1.getCaraActual()==dado3.getCaraActual()){
            return true;
        }
        return false;
    }


    public int sumaDados(){
        return dado1.getCaraActual()+dado2.getCaraActual()+dado3.getCaraActual();
    }


    public boolean ganador(){
        if (los3Iguales()==true || sumaDados() >14){
            return true;
        }else{
            return false;
        }
    }

    public void jugar(){
        lanzar3Dados();
        sumaDados();
        los3Iguales();
        ganador();

        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(dado3);
        System.out.println("La suma de los dados es de: " + sumaDados());
        String resultado = ganador()? "Has GANADO!" : "HAS PERDIDO. VUELVE A INTENTAR!";
        System.out.println(resultado);
    }

    public int getValorDado1(){
        return dado1.getCaraActual();
    }
    public int getValorDado2(){
        return dado2.getCaraActual();
    }
    public int getValorDado3(){
        return dado3.getCaraActual();
    }


}
