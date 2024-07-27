package org.example;

import org.example.modelo.*;
import static org.example.modelo.Genero.*;
import static org.example.modelo.Imprimible.*;
public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("John", "Doe"), "Ingeniero de sistemas", "Resumen laboral");
        cv.addExperiencias("Java")
                .addExperiencias("Oracle DBA")
                .addExperiencias("Spring Framework")
                .addExperiencias("Desarrollador fullstack")
                .addExperiencias("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseño: Elem. Reusable POO", Genero.PROGRAMACIÓN);

        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));
        Informe informe = new Informe("Estudio sobre microservicios",new Persona("Martin", "Fowler"), new Persona("James", "Gosling"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        /*imprimir(imprimir() -> {
            return "Hola que tal, imprimiendo un objeto generico de una clase anónima";
        });*/
        imprimir(new Imprimible(){
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto generico";
            }
        });

        System.out.println(TEXTO_DEFECTO);
    }
}
