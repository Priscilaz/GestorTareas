package model;

import java.time.LocalDate;

/**
 * Representa una tarea dentro del sistema, incluyendo su identificación,
 * título, descripción y fecha límite.
 */
public class Tarea {

    /** Identificador único de la tarea. */
    private int id;

    /** Título descriptivo de la tarea. */
    private String titulo;

    /** Detalle breve del contenido de la tarea. */
    private String descripcion;

    /** Fecha límite para completar la tarea. */
    private LocalDate fechaLimite;

    /**
     * Crea una nueva instancia de Tarea.
     *
     * @param id          identificador único
     * @param titulo      título de la tarea
     * @param descripcion descripción de la tarea
     * @param fechaLimite fecha límite de cumplimiento
     */
    public Tarea(int id, String titulo, String descripcion, LocalDate fechaLimite) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
    }

    /**
     * Obtiene el identificador de la tarea.
     *
     * @return id de la tarea
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el título de la tarea.
     *
     * @return título de la tarea
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene la descripción de la tarea.
     *
     * @return descripción de la tarea
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene la fecha límite establecida para la tarea.
     *
     * @return fecha límite
     */
    public LocalDate getFechaLimite() {
        return fechaLimite;
    }
}
