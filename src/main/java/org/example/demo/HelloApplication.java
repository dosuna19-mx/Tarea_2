package org.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        ControlJuego3Dados controlJuego3Dados = new ControlJuego3Dados();

        Tablero tablero = controlJuego3Dados.getTablero();
        Scene scene = new Scene(tablero, 1200, 600);
        stage.setTitle("JUEGO DE 3 DADOS");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}