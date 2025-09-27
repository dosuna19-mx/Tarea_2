package org.example.demo;

public class ManejadorJuego {

    private Juego3Daditos juego3Dados;
    private Jugador[] jugadores;
    private int turnoActual;
    private int rondasTotales;
    private int turnosJugados;

    public ManejadorJuego() {
        juego3Dados = new Juego3Daditos();
        jugadores = new Jugador[4];
        jugadores[0] = new Jugador("Ana");
        jugadores[1] = new Jugador("Daniel");
        jugadores[2] = new Jugador("Armando");
        jugadores[3] = new Jugador("Karla");

        this.rondasTotales = 3;
        this.turnoActual = 0;
        this.turnosJugados = 0;
    }

    public void jugarTurno() {
        if (juegoTerminado()) {
            System.out.println("El juego ya ha terminado.");
            return;
        }

        Jugador jugadorActual = jugadores[turnoActual];
        juego3Dados.lanzar3Dados();
        jugadorActual.agregarPuntos(juego3Dados.sumaDados());

        turnoActual = (turnoActual + 1) % 4;
        turnosJugados++;
    }

    public boolean juegoTerminado() {

        return turnosJugados >= jugadores.length * rondasTotales;
    }

    public Jugador getGanador() {
        if (!juegoTerminado()) {
            return null;
        }

        Jugador ganador = jugadores[0];
        for (int i = 1; i < jugadores.length; i++) {
            if (jugadores[i].getPuntos() > ganador.getPuntos()) {
                ganador = jugadores[i];
            }
        }
        return ganador;
    }

    public Jugador getJugador(int idx) {
        return jugadores[idx];
    }

    public Jugador getJugadorActual() {
        return jugadores[turnoActual];
    }

    public Juego3Daditos getJuego3Dados() {
        return juego3Dados;
    }
}
