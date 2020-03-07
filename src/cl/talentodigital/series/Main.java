package cl.talentodigital.series;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] blablabla) {

        //Polimorfismo
        List<String> personajes = new ArrayList();
        personajes.add("Monkey D. Luffy");
        personajes.add("Marshall D. Teach");
        personajes.add("Gol D. Royer");


        Series onePice = new Series(1, "One Piece", "Wano", personajes);
        System.out.println("One Piece: " + onePice.toString());
        System.out.println("Buscando M......");
        System.out.println("Personajes encontrados: " + onePice.buscarPersonajes("M"));
    }
}
