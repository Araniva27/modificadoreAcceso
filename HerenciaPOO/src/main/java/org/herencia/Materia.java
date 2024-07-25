package org.herencia;

public class Materia {
    private String codigo;
    private String nombre;

    public Materia() {
    }

    public Materia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String inclusion(){
        return "Soy inclusión materia";
    }

    public String eliminacion(){
        return "Soy eliminación materia";
    }

    public String modificacion(){
        return "Soy modificación materia";
    }

    public String reporte1(){
        return "Soy reporte 1 materia";
    }

    public String reporte2(){
        return "Soy reporte 2 materia";
    }
}
