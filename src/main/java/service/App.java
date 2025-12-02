import java.time.LocalDate;

import repository.TareaRepository;
import service.TareaService;

/**
 * Punto de entrada principal de la aplicación de gestión de tareas.
 */
public class App {

    /**
     * Método principal que ejecuta la aplicación.
     *
     * @param args argumentos de ejecución (no utilizados)
     */
    public static void main(String[] args) {
        TareaRepository repo = new TareaRepository();
        TareaService service = new TareaService(repo);

        service.crearTarea(1, "Examen", "Estudiar", LocalDate.now().plusDays(2));

        System.out.println("Total tareas: " + service.obtenerTareas().size());
    }
}
