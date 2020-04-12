/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroperfecto;
import java.util.Scanner;
/**
 *
 * @author Sebastian Gomez
 */
public class NumeroPerfecto {
    // Declaramos un scanner para poder pedir input al usuario.
    private static Scanner sc;
	
	public static void main(String[] args) {
                // Declaramos las variables i,que es el iterador del for,num, que el numero al cual se le asignara el numero scaneado
                // Y tambien declaramos un acumlador
		int i, num, acum = 0 ;
		sc = new Scanner(System.in);		
		System.out.println("\n Porfavor ingrese un numero: ");
                // le asignamos a num, el numero que se ingresara-
		num = sc.nextInt();
                // En for va a ir desde 1, hasta el numero ingresado
		for(i = 1 ; i < num ; i++) {
			if(num % i == 0)  {
                                // Cuando el modulo del numero en el numero que se encuentra el iterador
                                // sea 0, este sumara ese numero al acumulador 
				acum = acum + i;
			}
		}
                // Finalmente se evaluara si el acumulador es igual a numero, si lo es, es un numero perfecto, si no,no lo es.
		if (acum == num) {
			System.out.format("\n% d es un numero perfecto. ", num);
		}
		else {
			System.out.format("\n% d no es un numero perfecto. ", num);
		}
	}
    } 
    
