package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ControladorVuelos {


    //Función de filtrado donde recibe la lista de vuelos y según las fechas recibidas la filtra y devuelve
    public static List<Vuelo> filtrarVuelos(List<Vuelo> vuelos, Optional<LocalDate> fechaDesde, Optional<LocalDate> fechaHasta) {
        //Caso donde recibe ambas fechas
        if (fechaDesde.isPresent() && fechaHasta.isPresent())
            return vuelos.stream().filter(n -> !n.getFechaInicio().isBefore(fechaDesde.get()) && !n.getFechaInicio().isAfter(fechaHasta.get())).toList();
        //Caso donde recibe fecha desde
        if (fechaDesde.isPresent())
            return vuelos.stream().filter(n -> !n.getFechaInicio().isBefore(fechaDesde.get())).toList();
        //Caso donde recibe fecha hasta
        if (fechaHasta.isPresent())
            return vuelos.stream().filter(n -> !n.getFechaInicio().isAfter(fechaHasta.get())).toList();

        //Caso final donde no recibe las fechas
        return vuelos.stream().toList();
    }


}
