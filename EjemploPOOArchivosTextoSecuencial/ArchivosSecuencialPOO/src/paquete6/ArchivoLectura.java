/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class ArchivoLectura {

    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<Hospital> lista;

    public ArchivoLectura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s", nombreArchivo);
        File f = new File(rutaArchivo);
        if (f.exists()) {
            try {
                entrada = new Scanner(new File(rutaArchivo));
            } 
            catch (FileNotFoundException e) {
                System.err.println("Error al leer del archivo: " + e);

            }
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public void establecerLista() {
        lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                ArrayList<String> linea_partes = new ArrayList<>(Arrays.asList(linea.split(";")));
                
                Hospital hp = new Hospital(linea_partes.get(0),linea_partes.get(1), linea_partes.get(2));
                lista.add(hp);

            } 
        }
    }

    public ArrayList<Hospital> obtenerLista() {

        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

    @Override
    public String toString() {
        String cadena = "Lista de Hospitales\n";
        for (int i = 0; i < obtenerLista().size(); i++) {
            Hospital hpTemporal = obtenerLista().get(i); // Obj. Profesor
            cadena = String.format("%s(%d) %s - %d - %.2f\n", cadena,
                    i + 1,
                    hpTemporal.obtenerNombre(), // obtenerLista().get(i).obtenerNombre(),
                    hpTemporal.obtenerNumeroCamas(),
                    hpTemporal.obtenerPresupuesto());    // obtenerLista().get(i).obtenerTipo());
        }
        return cadena;
    }
}
