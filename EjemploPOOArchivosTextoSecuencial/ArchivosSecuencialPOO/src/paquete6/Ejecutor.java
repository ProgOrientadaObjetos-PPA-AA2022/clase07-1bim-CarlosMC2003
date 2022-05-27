/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        String nombreArchivo = "hospitales.txt";
        
        Hospital hp1 = new Hospital("Isidro Ayora", 35, 1200.00);
        Hospital hp2 = new Hospital("Clinica Abendaño", 17, 2875.00);
        Hospital hp3 = new Hospital("Manuel Agustin", 50, 20000.75);
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        
        archivo.establecerRegistro(hp1);
        archivo.establecerSalida();
        
        archivo.establecerRegistro(hp2);
        archivo.establecerSalida();
            
        archivo.establecerRegistro(hp3);
        archivo.establecerSalida();
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
    
}
