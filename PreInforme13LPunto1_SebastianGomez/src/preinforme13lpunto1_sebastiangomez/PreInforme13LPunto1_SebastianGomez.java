/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preinforme13lpunto1_sebastiangomez;

import java.util.HashMap;



public class PreInforme13LPunto1_SebastianGomez {

    
    
    public static void main(String[] args) {
        
        // Para crear un diccionario en java, yo use la clase HashMap
        // Para crear un diccionario entonces hariamos asi: HashMap<tipo de dato1, tipo de dato2> Nombredeldiccionario = new HashMap();
        HashMap<String, Double> map = new HashMap();
        // Para agregarle contenido, se utiliza la funcion put(), dentro de los parentesis iran estos, el primero sera la llaver y el segundo el valor 
        map.put("Llave",2.4);
        map.put("Llave2",4.1);
        map.put("Llave3",4.2);
        
        // Para conseguir las llaves de un diccionario se puede utilizar la funcion keySet()
        System.out.println(""+map.keySet());
        
        // Para conseguir los valores de un diccionario se puede utilizar la funcion values()
        System.out.println(""+map.values());
        
        // Para crear un diccionario con una llave y varios valores, una opcion seria hacerlo asi:
        // Declarar un vector
        Double[] x;
        // Dentro de los <> poner el tipo de llave que usaremos, el valor del mismo tipo del vector que declaramos anteriormente
        HashMap<String, Double[]> map2 = new HashMap(); 
        // Utilizaremos la funcion put() para introducirle al diccionario la llave y los valores, utilizando el vector anteriormente declarado
        map2.put("Llavek",x= new Double[]{4.2,2.4,24.1});
    }
    
}
