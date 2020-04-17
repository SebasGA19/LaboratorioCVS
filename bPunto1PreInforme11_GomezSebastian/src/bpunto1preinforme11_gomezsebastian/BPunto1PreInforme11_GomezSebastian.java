/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpunto1preinforme11_gomezsebastian;

/**
 *
 * @author Repre
 */
public class BPunto1PreInforme11_GomezSebastian {

    
    public static void main(String[] args) {
        // Los array multidimensionales en java se declaran con un nombre y al lado de este
        // se le colocan [][], dependiendo de las dimensiones, ejemplo; a[][];
        // En Java un array con su contenido ya definido puede tener filas de diferentes tamaños
        // Se declaran en un tipo de variable y solo en uno,
        int a[][]={ //Dos llaves encierran al array entero
            {1,3,4},// y dos llaves encierran a cada fila del array
            {3,2,5},
            {2,4},
        };
        // Entonces un array se puede hacer de mas de dos dimensiones, con la cantidad de [] que se le pongan
        // ej: un array de una dimension seria: int a[], de dos: int a[][], de tres seria: int a[][][], y asi sucesivamente
        // Si se ponen un numero dentro de estos [], eso definira el tamaño del array en ese aspecto
        int b[][][]={
            { // Entonces en un array 3D es igual que en el 2D solo que 
            {2,4},
            {2,1},
            {2,4},
            },
            {
            {6,8},
            {5,7},
            {6,9},
            }
            }; // Otras dos llaves encierran a los dos arrays 2D
        // Tal como en python, un array de 3D, son dos arrays de 2D en uno
        }
        
    }
    

