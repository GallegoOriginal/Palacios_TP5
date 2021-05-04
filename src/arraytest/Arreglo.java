/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytest;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author Wi7o
 */
public class Arreglo {
   //private int[] arrayNumbers;
   
   public static void sumarLista(int[] arrayNumbers){
         int sum = 0; 
         float avg = 0;
         for (int i = 0; i < arrayNumbers.length; i++) {  
           sum = sum + arrayNumbers[i];  
        }  
         if (arrayNumbers.length > 0){
          avg = (float)sum/arrayNumbers.length;   
         }
         
         System.out.println("Suma de los elementos del arreglo: " + sum);
         System.out.println("Promedio de los elementos del arreglo: " + avg);
    }
   
   public static void buscarMayor(int[][] int2DArray){
          int result = int2DArray[0][0];
          for (int j = 0; j < int2DArray.length; j++) {
            for (int i = 0; i < int2DArray[j].length; i++) {
                if (int2DArray[j][i] > result) {
                    result = int2DArray[j][i];
                }
            }
        }
           System.out.println("Mayor número del arreglo: " + result);
    }
   
   public static void cuentaVocales (String palabra){
       String newString = palabra.replaceAll("[^AaeEiIoOuU]", "");
       System.out.println("El número de vocales es: " +newString.length());
   }
   
      public static void cuentaCaracter (String palabra, String caracter){
       String newString = palabra.replaceAll("[^" + caracter +"]", "");
       System.out.println("El cáracter se repite " + newString.length() + " veces");
   }
   
}
