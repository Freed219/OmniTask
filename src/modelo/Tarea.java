/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.time.*;
/**import java.
 *
 * @author admin
 */
public class Tarea {
    
    private int id;
    private String Descripcion;
    private LocalDate fechaIicio;
    private LocalTime horaInicio;
    private LocalDate fechaFin;
    private LocalTime horaFin;
    private int estado;
    private int idGrupo;
    private boolean cumplida;
    private LocalDate fechaRegistro;

    public Tarea() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public LocalDate getFechaIicio() {
        return fechaIicio;
    }

    public void setFechaIicio(LocalDate fechaIicio) {
        this.fechaIicio = fechaIicio;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public boolean isCumplida() {
        return cumplida;
    }

    public void setCumplida(boolean cumplida) {
        this.cumplida = cumplida;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", Descripcion=" + Descripcion + ", fechaIicio=" + fechaIicio + ", horaInicio=" + horaInicio + ", fechaFin=" + fechaFin + ", horaFin=" + horaFin + ", estado=" + estado + ", idGrupo=" + idGrupo + ", cumplida=" + cumplida + ", fechaRegistro=" + fechaRegistro + '}';
    }
    
    
}
