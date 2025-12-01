package repository;

import model.Tarea;
import java.util.ArrayList;
import java.util.List;

public class TareaRepository {

    private List<Tarea> tareas = new ArrayList<>();

    public void guardar(Tarea tarea) {
        tareas.add(tarea);
    }

    public List<Tarea> obtenerTodas() {
        return tareas;
    }

    
    public Tarea obtenerPorId(int id) {
        for (Tarea t : tareas) {
            if (t.getId() == id) return t;
        }
        return null;
    }


    public Tarea buscarPorId(int id) {
        for (Tarea t : tareas) {
            if (t.getId() == id) return t;
        }
        return null;
    }
}
