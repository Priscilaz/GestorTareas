package repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;

import model.Tarea;

import org.junit.jupiter.api.Test;

public class TareaRepositoryTest {

    @Test
    void deberiaGuardarTareaYListarlas() {
        TareaRepository repo = new TareaRepository();
        Tarea tarea = new Tarea(1, "Examen", "Estudiar", LocalDate.now());

        repo.guardar(tarea);

        assertEquals(1, repo.obtenerTodas().size());
        assertEquals(tarea, repo.obtenerTodas().get(0));
    }

    @Test
    void deberiaRetornarTareaCuandoIdExiste() {
        TareaRepository repo = new TareaRepository();
        Tarea tarea = new Tarea(5, "Ensayo", "Redactar", LocalDate.now());

        repo.guardar(tarea);

        Tarea resultado = repo.obtenerPorId(5);

        assertEquals(tarea, resultado);
    }

    @Test
    void deberiaRetornarNullCuandoIdNoExiste() {
        TareaRepository repo = new TareaRepository();

        Tarea resultado = repo.obtenerPorId(999);

        assertNull(resultado);
    }
}
