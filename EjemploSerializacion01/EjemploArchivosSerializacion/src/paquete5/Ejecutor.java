/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutor {
    public static void main(String[] args) {
        String nombreArchivo = "hospitales.data";
        
        Hospital hp1 = new Hospital("Isidro Ayora", 35, 1200.00);
        hp1.establecerIdentificacionHospital("11055");
        Hospital hp2 = new Hospital("Clinica Abendaño", 17, 2875.00);
        hp2.establecerIdentificacionHospital("11005");
        Hospital hp3 = new Hospital("Manuel Agustin", 50, 20000.75);
        hp3.establecerIdentificacionHospital("11045");

        EscrituraArchivoSecuencial archivo = 
                new EscrituraArchivoSecuencial(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerRegistro(hp1);
        archivo.establecerSalida();
        archivo.establecerRegistro(hp2);
        archivo.establecerSalida();
        archivo.establecerRegistro(hp3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospitales();
        System.out.println(lectura);
    }
}
