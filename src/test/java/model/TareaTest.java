package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TareaTest {

    @Test
    void deberiaCrearTareaYRetornarSusValores() {
        LocalDate fecha = LocalDate.now().plusDays(3);
        Tarea tarea = new Tarea(10, "Examen Final", "Estudiar Capítulos", fecha);

        assertEquals(10, tarea.getId());
        assertEquals("Examen Final", tarea.getTitulo());
        assertEquals("Estudiar Capítulos", tarea.getDescripcion());
        assertEquals(fecha, tarea.getFechaLimite());
    }
}
