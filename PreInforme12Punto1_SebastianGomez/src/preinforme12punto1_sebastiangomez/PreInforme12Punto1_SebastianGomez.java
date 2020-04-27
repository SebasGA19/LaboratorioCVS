/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preinforme12punto1_sebastiangomez;

import java.util.ArrayList;


public class PreInforme12Punto1_SebastianGomez {

    
    public static void main(String[] args) {
        double a;
        // Una lista se declara de esta manera, dentro de <>, va el tipo de dato que va a tener la lista, pero estos ya no seran datos primitivos 
        // por lo que tendran una sintaxis un poco diferente
        // Los elementos de la lista pueden ir declarados de una vez en esta o puede ser agregados con el metodo add()
        ArrayList<Double> Lista1 = new ArrayList<Double>();
        Lista1.add(2.5);
        Lista1.add(2.6);
        Lista1.add(2.2);
        Lista1.add(2.4);
        // Para imprimir la lista solo se necesita un System.out.print
        System.out.println(""+ Lista1);
        
        // El metodo size() puede usarse para averiguar el tamaño de la lista
        System.out.println(""+ Lista1.size());
        
        // El metodo get() puede usarse para conseguir el elemento de la posicion de la lista que pongamos dentro del parentesis
        
        System.out.println(""+ Lista1.get(2));
        
        // para poder usar el metodo get() en una operacion es necesario castearlo con su respectivo tipo de dato
        
        a=(double)Lista1.get(0)+(double)Lista1.get(2);
        System.out.println(""+ a);
        
    }
    
}
