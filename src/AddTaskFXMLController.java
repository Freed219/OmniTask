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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Jose
 */
public class AddTaskFXMLController implements Initializable {

    @FXML
    private Button agregarTarea;
    @FXML
    private TextField Descripcion;
    @FXML
    private DatePicker FechaIncio;
    @FXML
    private DatePicker HoraInico;
    @FXML
    private DatePicker FechaFin;
    @FXML
    private DatePicker HoraFin;
    @FXML
    private TextField Dias;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ButtonADD(ActionEvent event) {      
    }   
}
