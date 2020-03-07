package cl.talentodigital.series;

import java.util.ArrayList;
import java.util.List;

public class Series {
    private int id;
    private String nombre;
    private String temporada;
    private List<String> personajes;

    public Series(int id, String nombre, String temporada, List<String> personajes) {
        this.id = id;
        this.nombre = nombre;
        this.temporada = temporada;
        this.personajes = personajes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public List<String> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<String> personajes) {
        this.personajes = personajes;
    }

    public List<String> buscarPersonajes(String nombre){
        List<String> nombresEncontrados = new ArrayList<>();
        for(String aux : personajes){
            //Acá buscas
            if(aux.contains(nombre)){
                nombresEncontrados.add(aux);
            }
        }
        return nombresEncontrados;
    }

    private String obtenerListadoConSaltoDeLinea(List<String> personajesABuscar){
        String nombresConSaltoDeLinea = "";
        for(String aux : personajesABuscar){
            nombresConSaltoDeLinea = nombresConSaltoDeLinea + aux + "\n";
        }
        return nombresConSaltoDeLinea;
    }


    @Override
    public String toString() {
        return "Series :" +
                "Id: " + id + "\n" +
                "Nombre: '" + nombre + '\'' + "\n" +
                "Temporada: '" + temporada + '\'' + "\n" +
                "Personajes: \n" + obtenerListadoConSaltoDeLinea(personajes);
    }
}
