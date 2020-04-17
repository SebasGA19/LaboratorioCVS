/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventary;
import java.util.Scanner;
/**
 *
 * @author Repre
 */
public class Inventary {
    // Esta clase trata sobre un inventario, cada item tendra su nombre, precio y cantidad en stock
    public static void main(String[] args) {
    Scanner ingresoUsuario = new Scanner(System.in);  // Create a Scanner object
    
        // Se crean dos acumuladores para usarlos mas adelante
        int acum=0;
        int acum2=0;
        String a[][];
        // Aqui se le pide al usuario que ingrese la cantidad de productos que se enlistaran
        System.out.println("Ingrese la cantidad de productos que desea enlistar: ");
        Scanner cantPro = new Scanner(System.in);
        int cantidad = cantPro.nextInt();
        // Aqui se crea la matriz, en la cual se guardaran las variables en orden de columnas,
        // Columna 1: nombres,columna 2: precio, columna 3:cantidad en stock
        // Se declara la matriz, con una cantidad de filas definida por el usuario
        // y de 3 colunmas
        a= new String[cantidad][3];
        for(int i=0 ; i<cantidad ; i++){
            int b=i+1;
            // Aqui se pide el ingreso de los datos
            System.out.println("Ingrese el nombre del producto "+ b +": " );
            Scanner product = new Scanner(System.in);
            String producto= product.nextLine();
            a[i][0]= producto;
            System.out.println("ingrese el precio del producto: ");
            Scanner precio = new Scanner(System.in);
            String precio2= precio.nextLine();
            a[i][1]= precio2;
            System.out.println("Ingrese la cantidad en stock: ");
            Scanner stock = new Scanner(System.in);
            String stock2= stock.nextLine();
            a[i][2]= stock2;
        }
        
    //Aqui lo que se esta logrando es convertir los precios del inventario de string
    // a int, para poder sumarlos y sacar un total del valor del inventario
    for (int i = 0; i < cantidad; i=i+1) {
            
                int convert = Integer.parseInt((a[i][1]))*Integer.parseInt((a[i][2]));
                acum= acum+convert;
            
        }
    System.out.println("El valor total de todos los items del inventario es de:"+ acum);
    //Aqui lo que se esta logrando es convertir las cantidad de stock del inventario de string
    // a int, para poder sumarlos y sacar un total de la cantidad de items del inventario
    for (int i = 0; i < cantidad; i=i+1) {
            for(int j = 2; j < 3; j=j+2) {
                int convert = Integer.parseInt((a[i][j]));
                acum2= acum2+convert;
            }
        }
    System.out.println("La cantidad total de items en el inventario es de:"+ acum2);
    
    }
    
}
    

