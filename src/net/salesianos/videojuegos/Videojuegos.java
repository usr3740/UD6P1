
package net.salesianos.videojuegos;

public class Videojuegos {

    private String titulo;
    private String genero;
    private int horasJugadas;

    public Videojuegos(String titulo, String genero, int horasJugadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.horasJugadas = horasJugadas;
    }

    public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getgenero() {
        return genero;
    }

    public void setgenero(String genero) {
        this.genero = genero;
    }

    public int gethorasJugadas() {
        return horasJugadas;
    }

    public void sethorasJugadas(int horasJugadas) {
        this.horasJugadas = horasJugadas;
    }

    @Override
    public String toString() {
        return ("El juego se llama: " + titulo + " el genero del juego es: " + genero + " y tienes " + horasJugadas
                + " jugadas.");
    }

}