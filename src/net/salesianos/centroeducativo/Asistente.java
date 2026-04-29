package net.salesianos.centroeducativo;

public class Asistente {

    private String dni;
    private String nombre;
    private String grupo;

    public Asistente(String dni, String nombre, String grupo) {
        this.dni = dni;
        this.nombre = nombre;
        this.grupo = grupo;
    }

    public String getdni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return ("El dni de la persona es" + dni + " su nombre es" + nombre + " y su grupo es " + grupo);
    }

}
