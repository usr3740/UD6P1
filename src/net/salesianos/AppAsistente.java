package net.salesianos;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;

import net.salesianos.centroeducativo.Asistente;


public class AppAsistente {
    public static void main(String[] args) {

     HashSet<Asistente> asistentes = new HashSet<>();

     Asistente[] datos = {
        new Asistente("111A", "Elena", "DAM1"),
        new Asistente("222B", "Hugo", "DAM1"),
        new Asistente("333C", "Sara", "DAW1"),
        new Asistente("111A", "Elena repetida", "DAM2"),
        new Asistente("444D", "Marcos", "DAW1"),
        new Asistente("555E", "Lucía", "DAM1")
     };

     int intentos = datos.length;
     for(Asistente a : datos) {
        asistentes.add(a);
     }

     System.out.println("Contenido del Hashset: ");
    for (Asistente a : asistentes) {
        System.out.println(a);
    }

    System.out.println("Intentos de añadidos: " + intentos);

    System.out.println("Asistentes reales si repetir: " + asistentes.size());

    HashMap<String, Integer> mapaGrupo = new HashMap<>();

    for(Asistente a : asistentes) {
    mapaGrupo.put(a.getGrupo(), mapaGrupo.getOrDefault(a.getGrupo(), 0) + 1);
    }

    System.out.println("Mapa de asistentes por grupo: ");
    System.out.println(mapaGrupo);

    System.out.println("Asistentes en DAM1: " + mapaGrupo.getOrDefault("DAM1", 0));

    System.out.println("¿Existe ASIR1? " + mapaGrupo.containsKey("ASIR1"));

    mapaGrupo.remove("ASIR1");

    System.out.println("Claves mapa: ");
    System.out.println(mapaGrupo.keySet());
    }
    
}
