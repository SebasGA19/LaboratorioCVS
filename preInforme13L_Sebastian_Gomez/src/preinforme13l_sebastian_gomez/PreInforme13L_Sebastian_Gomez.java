/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preinforme13l_sebastian_gomez;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Repre
 */
public class PreInforme13L_Sebastian_Gomez {
    

    
    public static void main(String[] args)
    {
       
        Double[] x;
      
        HashMap<String, Double[]> Estudiantes = new HashMap(); 
        Estudiantes.put("Juan Perez", x = new Double[]{4.0, 3.4, 3.6, 3.5});
        Estudiantes.put("Sebastian Gomez", x = new Double[]{4.7, 4.8, 4.9, 4.6});
        Estudiantes.put("Diego Angulo", x = new Double[]{4.7, 4.6, 4.9, 4.0});
        Estudiantes.put("Eliana Acevedo", x = new Double[]{4.7, 5.0, 4.9, 4.5});
        Estudiantes.put("Andres Delgado", x = new Double[]{1.7, 2.8, 2.9, 2.1});
      
        Scanner choice = new Scanner(System.in);
        System.out.println("Presione 1 si quiere ver el promedio de notas del estudiante, presione 2 si quiere ver las notas del estudiante, presione 3 si quiere saber el desempeño del estudiante");
        int condicion = choice.nextInt();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = input.nextLine();
        
        if(condicion==1){
            System.out.println("El promedio de notas del estudiante es: "+promEst(Estudiantes, nombre));
        }
        else if(condicion==2){
            System.out.println("Las notas del estudiante son: " );
            notas(Estudiantes, nombre);
        }
        else if(condicion==3){
            System.out.println( pass(Estudiantes,nombre)); 
        }
        
    }

    public static double promEst (HashMap<String, Double[]> map, String name){
        Double[] a;
        double b;
        double cont=0;
        a = map.get(name);
        for(int i=0 ; i<a.length ; i++){
            cont=cont+a[i];
        }
        b= cont/a.length;
        return b;
    }
    
    public static void notas(HashMap<String, Double[]> map, String name){
        Double[] a;
        a = map.get(name);
        for(int i=0 ; i<a.length ; i++){
            System.out.println(a[i]);
        }
    }
    
    public static String pass(HashMap<String, Double[]> map, String name){
        String calif;
        
        Double[] a;
        double b;
        double cont=0;
        a = map.get(name);
        for(int i=0 ; i<a.length ; i++){
            cont=cont+a[i];
        }
        b= cont/a.length;
        if(b>=4.5){
            calif="Tuvo un desempeño excelente";
        }
        else if(b<4.5 && b>=3.0){
            calif="Aprobó";
        }
        else{
            calif="Reprobó";
        }
        return calif;
    }
}


