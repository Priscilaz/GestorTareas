package service;

import java.time.LocalDate;
import java.util.List;

import model.Tarea;
import repository.TareaRepository;

/**
 * Servicio encargado de gestionar las operaciones relacionadas con tareas.
 */
public class TareaService {

    /** Repositorio utilizado para almacenar y recuperar tareas. */
    private final TareaRepository repo;

    /**
     * Crea una nueva instancia del servicio de tareas.
     *
     * @param repo repositorio donde se almacenarán las tareas
     */
    public TareaService(TareaRepository repo) {
        this.repo = repo;
    }

    /**
     * Crea una nueva tarea y la almacena en el repositorio.
     *
     * @param id          identificador de la tarea
     * @param titulo      título de la tarea
     * @param descripcion descripción de la tarea
     * @param fecha       fecha límite de la tarea
     */
    public void crearTarea(int id, String titulo, String descripcion, LocalDate fecha) {
        Tarea tarea = new Tarea(id, titulo, descripcion, fecha);
        repo.guardar(tarea);
    }

    /**
     * Obtiene todas las tareas almacenadas.
     *
     * @return lista completa de tareas
     */
    public List<Tarea> obtenerTareas() {
        return repo.obtenerTodas();
    }

    /**
     * Verifica si una tarea está atrasada respecto a la fecha actual.
     *
     * @param tarea tarea a evaluar
     * @return true si la tarea está vencida, false en caso contrario
     */
    public boolean estaAtrasada(Tarea tarea) {
        return tarea.getFechaLimite().isBefore(LocalDate.now());
    }
}
