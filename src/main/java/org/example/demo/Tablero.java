package org.example.demo;

import javafx.scene.layout.BorderPane;

public class Tablero extends BorderPane {
    private JugadorUI ui1;
    private JugadorUI ui2;
    private JugadorUI ui3;
    private JugadorUI ui4;
    private CentroTablero centroTablero;

    public Tablero(Jugador j1, Jugador j2, Jugador j3, Jugador j4) {

        ui1 = new JugadorUI(j1);
        ui2 = new JugadorUI(j2);
        ui3 = new JugadorUI(j3);
        ui4 = new JugadorUI(j4);


        centroTablero = new CentroTablero();

        //Se posicionan los elementos en el BorderPane
        this.setTop(ui1);
        this.setBottom(ui3);
        this.setLeft(ui2);
        this.setRight(ui4);
        this.setCenter(centroTablero);
    }

    public JugadorUI getUi1() { return ui1; }
    public JugadorUI getUi2() { return ui2; }
    public JugadorUI getUi3() { return ui3; }
    public JugadorUI getUi4() { return ui4; }
    public CentroTablero getCentroTablero() { return centroTablero; }
}
