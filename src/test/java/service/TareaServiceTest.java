package service;

import model.Tarea;
import repository.TareaRepository;
import service.TareaService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;


public class TareaServiceTest {

    @Test
    void testCrearTarea() {
        TareaRepository repo = new TareaRepository();
        TareaService service = new TareaService(repo);

        service.crearTarea(1, "Prueba", "Descripción", LocalDate.now().plusDays(2));

        assertEquals(1, repo.obtenerTodas().size());
    }

    @Test
    void testObtenerTareas() {
        TareaRepository repo = new TareaRepository();
        TareaService service = new TareaService(repo);

        service.crearTarea(1, "A", "B", LocalDate.now());

        assertFalse(service.obtenerTareas().isEmpty());
    }

    
}
