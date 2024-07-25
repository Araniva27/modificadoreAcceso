package org.herencia;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor();

        System.out.println(profesor.inclusion());
        System.out.println(profesor.eliminacion());
        System.out.println(profesor.modificacion());

        Contratado contratado = new Contratado("Manuel", "Araniva", "Programador", "14/7/2020", "14/7/2090");
        System.out.println("---------------------------------------");
        System.out.println(contratado.inclusion());
        System.out.println(contratado.eliminacion());
        System.out.println(contratado.modificacion());
        System.out.println(contratado.reporte1());
        System.out.println(contratado.reporte2());
        System.out.println("---------------------------------------");
        Ordinario ordinario = new Ordinario("Paola", "Mendez", "Profesora de primaria", 20);
        System.out.println("---------------------------------------");
        System.out.println(ordinario.inclusion());
        System.out.println(ordinario.eliminacion());
        System.out.println(ordinario.modificacion());
        System.out.println(ordinario.reporte1());
        System.out.println(ordinario.reporte2());
        System.out.println("---------------------------------------");
        Materia materia = new Materia("ASI104", "Administracion de servidores");
        System.out.println(materia.inclusion());
        System.out.println(materia.eliminacion());
        System.out.println(materia.modificacion());
        System.out.println(materia.reporte1());
        System.out.println(materia.reporte2());
    }
}