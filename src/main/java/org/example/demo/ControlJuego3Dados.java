package org.example.demo;

public class ControlJuego3Dados {

    private ManejadorJuego manejadorJuego;
    private Tablero tablero;
    private JugadorUI[] jugadoresUI;

    public ControlJuego3Dados() {

        manejadorJuego = new ManejadorJuego();

        tablero = new Tablero(
                manejadorJuego.getJugador(0), manejadorJuego.getJugador(3),
                manejadorJuego.getJugador(2), manejadorJuego.getJugador(1)
        );

        jugadoresUI = new JugadorUI[]{
                tablero.getUi1(), tablero.getUi4(), tablero.getUi2(), tablero.getUi3()
        };

        tablero.getCentroTablero().getLanzarButton().setOnAction(event -> {
            if (!manejadorJuego.juegoTerminado()) {
                manejadorJuego.jugarTurno();
                actualizarVistaCompleta();
            }

            if (manejadorJuego.juegoTerminado()) {
                Jugador ganador = manejadorJuego.getGanador();
                tablero.getCentroTablero().mostrarGanador(ganador.getNombre(), ganador.getPuntos());
            }
        });

        actualizarVistaCompleta();
    }

    private void actualizarVistaCompleta() {

        tablero.getCentroTablero().actualizarDados(
                manejadorJuego.getJuego3Dados().getValorDado1(),
                manejadorJuego.getJuego3Dados().getValorDado2(),
                manejadorJuego.getJuego3Dados().getValorDado3()
        );

        if (!manejadorJuego.juegoTerminado()) {
            Jugador jugadorActual = manejadorJuego.getJugadorActual();
            tablero.getCentroTablero().actualizarJugadorActual(jugadorActual.getNombre());


        }

        for (JugadorUI ui : jugadoresUI) {
            ui.actualizar();
        }
    }

    public Tablero getTablero() {
        return tablero;
    }
}
