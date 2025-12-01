import repository.TareaRepository;
import service.TareaService;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TareaRepository repo = new TareaRepository();
        TareaService service = new TareaService(repo);

        service.crearTarea(1, "Examen", "Estudiar", LocalDate.now().plusDays(2));

        System.out.println("Total tareas: " + service.obtenerTareas().size());
    }
}
