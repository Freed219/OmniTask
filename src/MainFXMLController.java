/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
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
    private AnchorPane Tareas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void ChangeScreenButtonPushed(ActionEvent event) throws IOException
    {
        Parent hist = FXMLLoader.load(getClass().getResource("HistoricalFXML.fxml"));
        Scene histscene = new Scene(hist);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(histscene);
        window.show();
    }
    
    @FXML
    private void ChangeScreenButtonPushed(javafx.event.ActionEvent event) {
    }

    @FXML
    private void EnterKeyPressed(KeyEvent event) {
    }

    @FXML
    private void MouseClicked(MouseEvent event) {
    }

}
