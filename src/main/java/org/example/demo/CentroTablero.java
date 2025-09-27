package org.example.demo;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Priority;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CentroTablero extends VBox { // Cambiar de HBox a VBox
    private DadoUI dadoUI1;
    private DadoUI dadoUI2;
    private DadoUI dadoUI3;
    private Button lanzar;
    private HBox contenedorDados;
    private Label jugadorActualEtiqueta;
    private Label jugadorGanador;;

    public CentroTablero() {

        dadoUI1 = new DadoUI();
        dadoUI2 = new DadoUI();
        dadoUI3 = new DadoUI();
        lanzar = new Button("Lanzar");
        lanzar.setStyle("-fx-font-size: 16px;");


        jugadorActualEtiqueta = new Label("Turno de: ");
        jugadorActualEtiqueta.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: #333333;");

        jugadorGanador = new Label("GANADOR: ");
        jugadorGanador.setStyle("-fx-font-size: 48px; -fx-font-weight: bold; -fx-text-fill: white; -fx-background-color: rgba(0, 0, 0, 0.8); -fx-padding: 20;");
        jugadorGanador.setVisible(false);
        jugadorGanador.setManaged(false);
        jugadorGanador.setAlignment(Pos.CENTER);
        jugadorGanador.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        VBox.setVgrow(jugadorGanador, Priority.ALWAYS);

        jugadorGanador.setVisible(false);
        jugadorGanador.setManaged(false);

        contenedorDados = new HBox(20);
        contenedorDados.setAlignment(Pos.CENTER);
        contenedorDados.getChildren().addAll(dadoUI1, dadoUI2, dadoUI3);

        this.setSpacing(20);
        this.setAlignment(Pos.CENTER);
        this.setStyle("-fx-background-color: #FFFFFF;");
        this.getChildren().addAll(jugadorGanador, jugadorActualEtiqueta, contenedorDados, lanzar);
    }

    public Button getLanzarButton() {
        return lanzar;
    }

    public void actualizarDados(int val1, int val2, int val3) {
        dadoUI1.cambiarEmojis(val1);
        dadoUI2.cambiarEmojis(val2);
        dadoUI3.cambiarEmojis(val3);
    }

    public void actualizarJugadorActual(String nombreJugador) {
        jugadorActualEtiqueta.setText("¡Turno de " + nombreJugador + "!");
    }

    public void mostrarGanador(String nombreGanador, int puntos) {

        jugadorActualEtiqueta.setVisible(false);
        jugadorActualEtiqueta.setManaged(false);
        contenedorDados.setVisible(false);
        contenedorDados.setManaged(false);
        lanzar.setVisible(false);
        lanzar.setManaged(false);

        jugadorGanador.setText("¡JUEGO TERMINADO!\nGanador: " + nombreGanador + "\ncon " + puntos + " puntos.");
        jugadorGanador.setVisible(true);
        jugadorGanador.setManaged(true);
    }
}
