package org.herencia;

public class Ordinario extends Profesor{
    private int aniosServicio;

    public Ordinario(int aniosServicio) {
        this.aniosServicio = aniosServicio;
    }

    public Ordinario(String nombre, String apellido, String dedicacion, int aniosServicio) {
        super(nombre, apellido, dedicacion);
        this.aniosServicio = aniosServicio;
    }

    public int getAniosServicio() {
        return aniosServicio;
    }

    public void setAniosServicio(int aniosServicio) {
        this.aniosServicio = aniosServicio;
    }

    @Override
    public String inclusion() {
        return "Hola soy inclusion desde ordinario";
    }

    @Override
    public String eliminacion() {
        return "Hola soy eliminacion desde ordinario";
    }

    @Override
    public String modificacion() {
        return "Hola soy modificacion desde ordinario";
    }

    @Override
    public String reporte1() {
        return "Hola soy " + getNombre() + " y soy profesor ordinario";
    }

    @Override
    public String reporte2() {
        return "Hola soy " + getNombre()
                + " mi apellido es " + getApellido()
                + " me medico a " + getDedicacion()
                + " y soy profesor ordinario";
    }
}
