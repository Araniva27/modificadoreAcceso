package org.herencia;

public class Contratado extends Profesor{
    private String fechaIngreso;
    private String fechaFinalizacionDeContrato;

    public Contratado(String fechaIngreso, String fechaFinalizacionDeContrato) {
        this.fechaIngreso = fechaIngreso;
        this.fechaFinalizacionDeContrato = fechaFinalizacionDeContrato;
    }

    public Contratado(String nombre, String apellido, String dedicacion, String fechaIngreso, String fechaFinalizacionDeContrato) {
        super(nombre, apellido, dedicacion);
        this.fechaIngreso = fechaIngreso;
        this.fechaFinalizacionDeContrato = fechaFinalizacionDeContrato;
    }

    @Override
    public String inclusion() {
        return "Soy inclusion desde profesor contratado";
    }

    @Override
    public String eliminacion() {
        return "Soy eliminacion desde profesor contratado";
    }

    @Override
    public String modificacion() {
        return "Soy modificacion desde profesor contratado";
    }

    @Override
    public String reporte1() {
        return "Hola mi nombre es: " + getNombre();
    }

    @Override
    public String reporte2() {
        return "Hola mi nombre es: " + getNombre()
                + " mi apellido es: " + getApellido()
                + " y me dedico a: " + getDedicacion()
                + " y soy profesor contratado";
    }
}
