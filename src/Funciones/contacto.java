package Funciones;

public class contacto {
    private String nombre;
    private long numero;

    public contacto(String nombre, long numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +"\nTeléfono: " + numero + "\n==================";
    }

}
