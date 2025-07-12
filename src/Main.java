import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static utils.ControladorVuelos.filtrarVuelos;

public class Main {
    // En este fragmento declaramos las constantes requeridas, tenemos las dos opciones vacías comentadas para hacer más sencillas las pruebas con estas
    static final Optional<LocalDate> fechaDesde = Optional.of(LocalDate.of(2025, 1, 1));
//    static final Optional<LocalDate> fechaDesde = Optional.ofNullable(null);
    static final Optional<LocalDate> fechaHasta = Optional.of(LocalDate.of(2025, 11, 12));
//    static final Optional<LocalDate> fechaHasta = Optional.ofNullable(null);


    public static void main(String[] args) {

        List<Vuelo> vuelos = List.of(
                new Vuelo(1, "Vuelo-1", "Iberia", "Madrid", "Buenos Aires", LocalDate.of(2025, 4, 10), LocalDate.of(2025, 4, 10)),
                new Vuelo(2, "Vuelo-2", "Vueling", "Barcelona", "Sevilla", LocalDate.of(2025, 6, 18), LocalDate.of(2025, 6, 18)),
                new Vuelo(3, "Vuelo-3", "Ryanair", "Malaga", "", LocalDate.of(2025, 5, 20), LocalDate.of(2025, 5, 20)),
                new Vuelo(4, "Vuelo-4", "Iberia", "Sevilla", "Roma", LocalDate.of(2025, 12, 1), LocalDate.of(2025, 12, 1)),
                new Vuelo(5, "Vuelo-5", "Vueling", "Salamanca", "Lisboa", LocalDate.of(2025, 2, 25), LocalDate.of(2025, 2, 25)),
                new Vuelo(6, "Vuelo-6", "Ryanair", "Madrid", "Japon", LocalDate.of(2025, 8, 10), LocalDate.of(2025, 8, 11)),
                new Vuelo(7, "Vuelo-7", "Iberia", "Barcelona", "Barcelona", LocalDate.of(2025, 8, 17), LocalDate.of(2025, 8, 17)),
                new Vuelo(8, "Vuelo-8", "Vueling", "Madrid", "Berlin", LocalDate.of(2025, 10, 15), LocalDate.of(2025, 10, 15)),
                new Vuelo(9, "Vuelo-9", "Ryanair", "Valencia", "Dublín", LocalDate.of(2025, 11, 20), LocalDate.of(2025, 11, 20)),
                new Vuelo(10, "Vuelo-10", "Iberia", "Barcelona", "Berlin", LocalDate.of(2025, 3, 30), LocalDate.of(2025, 3, 30))
        );

        // Con esto filtramos los vuelos y además lo ordenamos e imprimimos como se solicitaba
        filtrarVuelos(vuelos,fechaDesde,fechaHasta).stream().sorted(Comparator.comparing(Vuelo::getFechaInicio)).forEach(System.out::println);





    }
}