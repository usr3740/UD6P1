package net.salesianos;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

import javax.security.auth.login.FailedLoginException;

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

        
        int total = lista.size();
        int totalHoras = lista.stream().mapToInt(Videojuegos::gethorasJugadas).sum();
        double media = (total == 0) ? 0 : (double) totalHoras / total;

        Videojuegos max = lista.stream()
            .max(Comparator.comparingInt(Videojuegos::gethorasJugadas))
            .orElse(null);

        try (PrintWriter pw = new PrintWriter(new FileWriter("resumen_videojuegos.txt"))){
            pw.println("Total videojuegos: " + total);
            pw.println("Total horas jugadas: " + totalHoras);
            pw.println("Media de horas: " + media);
            pw.println("Videojuegos con más horas: " + max);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (PrintWriter log = new PrintWriter(new FileWriter("log_videojuegos.txt", true))) {
            log.println("Ejecucion correcta: " + new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
}
