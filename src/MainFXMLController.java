/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jose
 */
public class MainFXMLController implements Initializable {
    @FXML
    private Button AddTask;
    @FXML
    private Button Tareas;
    @FXML
    Button Historial;
    @FXML
    Button Ayuda;
    @FXML
    private Button AcercaDe;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void changeHistorial() throws IOException
    {
        Parent hist = FXMLLoader.load(getClass().getResource("HistoricalFXML.fxml"));
        Scene histscene = new Scene(hist, 1140, 750);
        Stage window = (Stage) Historial.getScene().getWindow();
        window.setScene(histscene);
        window.show();
    }
    
    @FXML
    public void changeTareas() throws IOException
    {
        Parent hist = FXMLLoader.load(getClass().getResource("HistoricalFXML.fxml"));
        Scene histscene = new Scene(hist, 1140, 750);
        Stage window = (Stage) Historial.getScene().getWindow();
        window.setScene(histscene);
        window.show();
    }
    
    @FXML
    public void changeAyuda() throws IOException
    {
        Parent help = FXMLLoader.load(getClass().getResource("HelpFXML.fxml"));
        Scene helpscene = new Scene(help, 1140, 750);
        Stage window = (Stage) Ayuda.getScene().getWindow();
        window.setScene(helpscene);
        window.show();
    }
    
    @FXML
    public void changeAcercade() throws IOException
    {
        Parent hist = FXMLLoader.load(getClass().getResource("HistoricalFXML.fxml"));
        Scene histscene = new Scene(hist, 1140, 750);
        Stage window = (Stage) Historial.getScene().getWindow();
        window.setScene(histscene);
        window.show();
    }
    


}
