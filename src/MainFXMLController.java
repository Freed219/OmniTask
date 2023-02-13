/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
import java.util.List;
import dao.TareaDao;
import modelo.Tarea;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.sql.Date;
import java.sql.Time;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.ObservableList;
/**
 * FXML Controller class
 *
 * @author Jose
 */
public class MainFXMLController implements Initializable {
    
    @FXML
    Button Tareas;
    @FXML
    Button Historial;
    @FXML
    Button Ayuda;
    @FXML
    Button AcercaDe;
    @FXML
    Button AddTask;
    @FXML
    private TableView<?> TablaTareas;
    @FXML
    private TableColumn<Tarea, String> Descripcion;
    @FXML
    private TableColumn<Tarea, Integer> Estado;
    @FXML
    private TableColumn<Tarea, Date> FechaInicio;
    @FXML
    private TableColumn<Tarea, Time> HoraInicio;
    @FXML
    private TableColumn<Tarea, Date> FechaFin;
    @FXML
    private TableColumn<Tarea, Time> HoraFin;
    @FXML
    private TableView employeeTable;
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
        Parent main = FXMLLoader.load(getClass().getResource("MainFXML.fxml"));
        Scene mainscene = new Scene(main, 1140, 750);
        Stage window = (Stage) Tareas.getScene().getWindow();
        window.setScene(mainscene);
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
        Parent acerca = FXMLLoader.load(getClass().getResource("AboutFXML.fxml"));
        Scene acercascene = new Scene(acerca, 1140, 750);
        Stage window = (Stage) AcercaDe.getScene().getWindow();
        window.setScene(acercascene);
        window.show();
    }
    
    @FXML
    public void AddTask() throws IOException
    {
        Parent addt = FXMLLoader.load(getClass().getResource("AddTaskFXML.fxml"));
        Stage newstage = new Stage();
        Scene newwindow = new Scene(addt);
        newstage.setTitle("AÃ±adir tarea");
        newstage.setScene(newwindow);
        newstage.initModality(Modality.APPLICATION_MODAL);
        newstage.show();
    }
    
    private void populateTable(ObservableList<Tarea> tarea){
        employeeTable.setItems(tarea);
    }
    @FXML
    private void initializer()throws Exception{

     
     Descripcion.setCellValueFactory(cellData ->new ReadOnlyStringWrapper(cellData.getValue().getDescripcion()));
     Estado.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getEstado()));
     FechaInicio.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getFechaIicio()));
     HoraInicio.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getHoraInicio()));
     FechaFin.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getFechaFin()));
     HoraFin.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getHoraFin()));
     TareaDao Dao=new TareaDao();
     ObservableList<Tarea> tarea=Dao.listarTareas(false);
     populateTable(tarea);
    }
}
