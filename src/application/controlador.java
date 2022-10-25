package application;



import java.awt.Event;
import java.security.acl.Owner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class controlador {

    @FXML
    private TextField miTexto;

    @FXML
    private Button miBoton;

    @FXML
    private Label miLabel;

    @FXML
    void mostrarTexto(ActionEvent event) {
    	String texto = miTexto.getText();
    	
    	try {
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/verTexto.fxml"));
			
			controladorTexto control2 = new controladorTexto();
			
			loader2.setController(control2);
			
			Parent root = loader2.load();
			
			control2.verTexto(texto);
			
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			
			stage.initModality(Modality.WINDOW_MODAL);
			stage.initOwner(((Node) (event.getSource())).getScene().getWindow());
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

}
