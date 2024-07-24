package org.modica.app.hogar;

import org.modica.app.jardin.Perro;

import static  org.modica.app.hogar.Persona.saludar;
public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();


        String saludo = saludar();
    }
}
