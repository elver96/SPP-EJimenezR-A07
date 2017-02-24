/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarreglos;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class EjemploArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String [] toppings={"cheese","pepperoni", "black olives","guacamole", "chips","tabasco"};
        int arrayLenght= toppings.length;
        String ingrediente;
        System.out.println("El tamaño del arreglo es "+toppings.length);
        for(int i=0;i<toppings.length;i++){
        ingrediente=toppings[i];
        System.out.println("En la posición "+i+" del arreglo el ingrediente es "+ingrediente);
        }*/
        //Forma 2. Solicitar el elemento del arreglo al usuario
        String[] toppings=new String[5];
        Scanner kb= new Scanner(System.in);
        String ingrediente;
        for(int i=0; i<toppings.length;i++){
            System.out.println("Introduce el ingrediente de la posición "+i);
            toppings[i]=kb.nextLine();
        }
        for(int i=0;i<toppings.length;i++){
        ingrediente=toppings[i];
        System.out.println("En la posición "+i+" del arreglo el ingrediente es "+ingrediente);
        }
    }    
}
