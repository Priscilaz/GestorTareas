package repository;

import java.util.ArrayList;
import java.util.List;

import model.Tarea;

/**
 * Repositorio encargado de almacenar y gestionar las tareas en memoria.
 */
public class TareaRepository {

    /** Lista que almacena todas las tareas registradas. */
    private List<Tarea> tareas = new ArrayList<>();

    /**
     * Guarda una nueva tarea en el repositorio.
     *
     * @param tarea objeto de tipo Tarea a almacenar
     */
    public void guardar(Tarea tarea) {
        tareas.add(tarea);
    }

    /**
     * Obtiene todas las tareas registradas.
     *
     * @return lista completa de tareas
     */
    public List<Tarea> obtenerTodas() {
        return tareas;
    }

    /**
     * Busca y devuelve una tarea que coincida con su ID.
     *
     * @param id identificador de la tarea
     * @return la tarea encontrada o null si no existe
     */
    public Tarea obtenerPorId(int id) {
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
}
