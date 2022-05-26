/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Profesor;
import paquete1.Calificacion;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        Profesor prof3 = new Profesor("Carlos Perez", "nombramiento");
        
        
        Calificacion c1 = new  Calificacion(7.5, "Matematicas");
        Calificacion c2 = new  Calificacion(10, "Sociales");
        Calificacion c3 = new  Calificacion(8.12, "Lengua");
        
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        c3.establecerProfesor(prof3);
        
        // ArrayList
        ArrayList <Calificacion> calificaciones = new ArrayList<>();
        calificaciones.add(c1);
        calificaciones.add(c2);
        calificaciones.add(c3);
        
        for (int i = 0; i < calificaciones.size(); i++) {
            System.out.printf("%s - %.2f - %s\n", calificaciones.get(i).obtenerProfesor().obtenerNombre(),
                    calificaciones.get(i).obtenerNota(), calificaciones.get(i).obtenerNombreMateria() );
        }
        
        System.out.println("-----------------------------");
    }
}
