package service;

import model.Tarea;
import repository.TareaRepository;

import java.time.LocalDate;
import java.util.List;

public class TareaService {

    private final TareaRepository repo;

    public TareaService(TareaRepository repo) {
        this.repo = repo;
    }

    public void crearTarea(int id, String titulo, String descripcion, LocalDate fecha) {
        System.out.println("Creando tarea...");
        Tarea t = new Tarea(id, titulo, descripcion, fecha);
        repo.guardar(t);
    }

    public List<Tarea> obtenerTareas() {
        return repo.obtenerTodas();
    }

    
    public boolean estaAtrasada(Tarea tarea) {
        return tarea.getFechaLimite().isBefore(LocalDate.now());
    }
}
