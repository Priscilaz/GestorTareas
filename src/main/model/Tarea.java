package model;

import java.time.LocalDate;

public class Tarea {

    private int id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaLimite;

    private String auxiliar;

    public Tarea(int id, String titulo, String descripcion, LocalDate fechaLimite) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
    }

    public int getId() {
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    
    public void setAuxiliar(String auxiliar) {
        this.auxiliar = auxiliar;
    }
}
