package org.herencia;

public class Profesor {
    private String nombre;
    private String apellido;
    private String dedicacion;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String dedicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dedicacion = dedicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    public String inclusion(){
        return "Soy inclusión";
    }

    public String eliminacion(){
        return "Soy eliminación";
    }

    public String modificacion(){
        return "Soy modificación";
    }

    public String reporte1(){
        return "Soy reporte 1";
    }

    public String reporte2(){
        return "Soy reporte 2";
    }
}
