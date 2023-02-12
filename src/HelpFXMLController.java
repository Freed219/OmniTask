/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Jose
 */
public class HelpFXMLController implements Initializable {

    @FXML
    private AnchorPane Tareas;
    @FXML
    private Button AddTask;
    @FXML
    private Button Historial;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void EnterKeyPressed(KeyEvent event) {
    }

    @FXML
    private void MouseClicked(MouseEvent event) {
    }

    @FXML
    private void changeHistorial(ActionEvent event) {
    }
    
}
