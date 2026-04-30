package net.salesianos;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;

import net.salesianos.videojuegos.Videojuegos;

public class AppVideojuegos {

     public static void main(String[] args) {
        ArrayList<Videojuegos> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("videojuegos.csv"))){

        br.readLine();

        String linea;
        while ((linea = br.readLine()) != null) {


            String[] partes = linea.split(",");
            String titulo = partes[0].trim();
            String genero = partes[1].trim();
            int horas = Integer.parseInt(partes[2].trim());

            lista.add(new Videojuegos(titulo, genero, horas));
        }

        } catch (Exception e){
            e.printStackTrace();
        }



     }
    
}
