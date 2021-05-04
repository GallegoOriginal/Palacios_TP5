/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytest;


import java.util.ArrayList;

/**
 *
 * @author Wi7o
 */
public class PruebaArreglo {
    public static void main(String[] args) {
        
        Arreglo arr = new Arreglo();
        
        //Probando la suma de la lista y promedio de la lista
        arr.sumarLista(new int [] {1, 1, 1, 1, 5});
        arr.sumarLista(new int [] {});
        arr.sumarLista(new int [] {200, 566, 456, 100, 5987, 908});
        
        //Probando la busqueda del mayor número en el array bidimensional
        arr.buscarMayor(new int[][]{{1, 2}, {3, 4}});
        arr.buscarMayor(new int[][]{{451, 4556, 567}, {5636, 4546, 4563}});
        
        //Probando el contar las vocales
        arr.cuentaVocales("Aurelio se fue de fiesta");
        arr.cuentaVocales("palabra");
        arr.cuentaVocales("ptyhjrt");
        
        //Probando el contar caracteres
        arr.cuentaCaracter("palabra", "z");
        arr.cuentaCaracter("palabra", "p");
        arr.cuentaCaracter("Aurelio se fue de fiesta", "f");
     }
}

