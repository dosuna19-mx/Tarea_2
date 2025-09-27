package org.example.demo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class JugadorUI extends VBox {
    private Jugador jugador;
    private Label nombreLabel;
    private Label puntosLabel;

    public JugadorUI(Jugador jugador) {
        this.jugador = jugador;
        nombreLabel = new Label(jugador.getNombre());
        puntosLabel = new Label("Puntos: 0");

        this.setSpacing(5);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new javafx.geometry.Insets(10));
        this.setStyle("-fx-border-color: lightgray; -fx-border-width: 2; -fx-background-color: #8D79FC;");

        nombreLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        puntosLabel.setStyle("-fx-font-size: 20px;");

        this.getChildren().addAll(nombreLabel, puntosLabel);
    }


    public void actualizar() {
        puntosLabel.setText("Puntos: " + jugador.getPuntos());
    }


}