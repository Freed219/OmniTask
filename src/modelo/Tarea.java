/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Date;
import java.sql.Time;
/**import java.
 *
 * @author admin
 */
public class Tarea {
    
    private int id;
    private String Descripcion;
    private Date fechaIicio;
    private Time horaInicio;
    private Date fechaFin;
    private Time horaFin;
    private int estado;
    private int idGrupo;
    private boolean cumplida;
    private Date fechaRegistro;

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

    public Date getFechaIicio() {
        return fechaIicio;
    }

    public void setFechaIicio(Date fechaIicio) {
        this.fechaIicio = fechaIicio;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
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

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", Descripcion=" + Descripcion + ", fechaIicio=" + fechaIicio + ", horaInicio=" + horaInicio + ", fechaFin=" + fechaFin + ", horaFin=" + horaFin + ", estado=" + estado + ", idGrupo=" + idGrupo + ", cumplida=" + cumplida + ", fechaRegistro=" + fechaRegistro + '}';
    }
    
    
}
