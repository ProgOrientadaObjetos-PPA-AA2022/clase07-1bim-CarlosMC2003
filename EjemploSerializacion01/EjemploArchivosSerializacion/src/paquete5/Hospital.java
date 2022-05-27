/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    String idHospital;
    
    public Hospital(String nom, int numCam, double pre) {
        nombre = nom;
        numeroCamas = numCam;
        presupuesto = pre;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerNumeroCamas(int n) {
        numeroCamas = n;
    }
    
    public void establecerPresupuesto(double n) {
        presupuesto = n;
    }
    
    public void establecerIdentificacionHospital(String n) {
        idHospital = n;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public int obtenerNumeroCamas() {
        return numeroCamas;
    }
    
    public double obtenerPresupuesto() {
        return presupuesto;
    }
    
    public String obtenerIdentificacionHospital() {
        return idHospital;
    }
    
        @Override
    public String toString(){
        String valor = String.format("%s - %s\n", nombre, idHospital);
        return valor;
    }
}