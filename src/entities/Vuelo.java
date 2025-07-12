package entities;

import java.time.LocalDate;

public class Vuelo {

    //Atributos de nuestra clase vuelo
    int id;
    String nombreVuelo;
    String empresa;
    String lugarSalida;
    String lugarLlegada;
    LocalDate fechaInicio;
    LocalDate fechaFinal;

    //Constructor
    public Vuelo(int id, String nombreVuelo, String empresa, String lugarSalida, String lugarLlegada, LocalDate fechaInicio, LocalDate fechaFinal) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    //Getters y setters. Dado que en este proyecto no los usamos en ningún momento incluimos solo el getter que necesitamos
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }


    //To string usado para imprimir después
    @Override
    public String toString() {
        return "Vuelo{" +
                "id=" + id +
                ", nombreVuelo='" + nombreVuelo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", lugarSalida='" + lugarSalida + '\'' +
                ", lugarLlegada='" + lugarLlegada + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinal=" + fechaFinal +
                '}';
    }
}
