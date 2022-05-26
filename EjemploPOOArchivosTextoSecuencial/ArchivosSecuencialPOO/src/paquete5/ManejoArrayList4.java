/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Empresa;

/**
 *
 * @author Carlos Morocho
 */
public class ManejoArrayList4 {
    public static void main(String[] args) {
        Empresa ep1 = new Empresa("RICOSA","QUITO");
        Empresa ep2 = new Empresa("HOLCIM","GUAYAQUIL");
        Empresa ep3 = new Empresa("PRENDHO","LOJA");
        Empresa ep4 = new Empresa("MARATHON","CUENCA");
        
        
        ArrayList <Empresa> empresas = new ArrayList<>();
        empresas.add(ep1);
        empresas.add(ep2);
        empresas.add(ep3);
        empresas.add(ep4);
        
        System.out.println("EMPRESAS DE ECUADOR");
        System.out.println("-----------------------------");
        for (int i = 0; i < empresas.size(); i++) {
            System.out.printf("%s - %s\n", empresas.get(i).obtenerNombre(),
                    empresas.get(i).obtenerCiudad());
        }
        
    }
}
