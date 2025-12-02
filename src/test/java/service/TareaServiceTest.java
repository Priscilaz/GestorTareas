package service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDate;

import model.Tarea;
import repository.TareaRepository;

import org.junit.jupiter.api.Test;

public class TareaServiceTest {

    @Test
    void deberiaCrearTareaCorrectamente() {
        TareaRepository repo = new TareaRepository();
        TareaService service = new TareaService(repo);

        service.crearTarea(1, "Proyecto", "Desarrollar sistema", LocalDate.now());

        assertEquals(1, service.obtenerTareas().size());
    }

    @Test
    void deberiaDetectarTareaAtrasada() {
        TareaRepository repo = new TareaRepository();
        TareaService service = new TareaService(repo);

        Tarea tarea = new Tarea(2, "Entrega", "Trabajo final", LocalDate.now().minusDays(1));

        assertTrue(service.estaAtrasada(tarea));
    }

    @Test
    void noDeberiaDetectarTareaAtrasadaSiFechaEsPosterior() {
        TareaRepository repo = new TareaRepository();
        TareaService service = new TareaService(repo);

        Tarea tarea = new Tarea(3, "Tarea", "Resolver ejercicios", LocalDate.now().plusDays(1));

        assertFalse(service.estaAtrasada(tarea));
    }
}
