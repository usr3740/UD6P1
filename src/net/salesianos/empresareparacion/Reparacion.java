package net.salesianos.empresareparacion;

public class Reparacion {

    private String codigo;
    private String cliente;
    private String descripcion;
    private boolean urgente;

    public Reparacion(String codigo, String cliente, String descripcion, boolean urgente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.urgente = urgente;
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getcliente() {
        return cliente;
    }

    public void setcliente(String cliente) {
        this.cliente = cliente;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean geturgente() {
        return urgente;
    }

    public void seturgente(boolean urgente) {
        this.urgente = urgente;
    }

    @Override
    public String toString() {
        return ("El codigo de reparacion del producto es: " + codigo + " del cliente " + cliente
                + ", y su descrición es " + descripcion + " y es " + urgente);

    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Reparacion other = (Reparacion) obj;
        return this.codigo.equals(other.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
}
