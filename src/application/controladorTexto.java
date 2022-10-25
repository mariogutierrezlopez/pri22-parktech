package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class controladorTexto {

    @FXML
    private Label miLabel;
    
    public void verTexto(String mensaje) {
    	miLabel.setText(mensaje);
    };

}
