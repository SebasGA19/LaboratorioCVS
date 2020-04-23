
package informe11b_sebastiangomez;
import java.util.Random;
/**
 *
 * @author SeGA
 */
public class Informe11B_SebastianGomez {

    public static void main(String[] args) {
        // Llamado a las funciones
        System.out.println("Ingresos: ");
        float ingresos[][]= new float[4][12];
        ingresos=generador(100,180);
        imprimir(ingresos);
        
        System.out.println("Egresos :");
        float egresos[][]= new float[4][12];
        egresos=generador(60,130);
        imprimir(egresos);
        
        System.out.println("Ganancias :");
        float ganancias[][]= new float[4][12];
        ganancias=restador(ingresos,egresos);
        imprimir(ganancias);
        
        System.out.println("Ingresos 3D: ");
        float ingresos3D[][][]= new float[4][12][4];
        ingresos3D=generador3D(ingresos,9.5);
        imprimir3D(ingresos3D);
        
        System.out.println("Egresos 3D: ");
        float egresos3D[][][]= new float[4][12][4];
        egresos3D= generador3D(egresos,6.5);
        imprimir3D(egresos3D);
        
        System.out.println("Ganancias 3D: ");
        float ganancias3D[][][]= new float[4][12][4];
        ganancias3D= calcular_ganancias3D(ingresos3D,egresos3D);
        imprimir3D(ganancias3D);
        
            }
    // Método generador, llenará una matriz de numeros aleatorios, entre un maximo y un minimo
    public static float[][] generador(int min, int max ){
        float newArr[][];
        newArr = new float[4][12];
        for(int i=0 ; i<4 ; i++){
            for(int j=0 ; j<12 ; j++){
                Random r = new Random();
                newArr[i][j]=r.nextInt((max - min) + 1) + min;
        }
        }
        return newArr;
    }
    // Método imprimir, imprimirá la matriz de variable float que se le inserte
    public static void imprimir(float[][] matriz){
        for(int i=0 ; i<4 ; i++){
            for(int j=0 ; j<12 ; j++){
                if(j!=0){
                System.out.print(matriz[i][j]+ " ");
                }
                else{
                    if(j==0 && i==0){
                        System.out.print("Bucaramanga: "+matriz[i][j]+ " ");
                    }
                    if(j==0 && i==1){
                        System.out.print("Floridablanca :"+matriz[i][j]+ " ");
                    }
                    if(j==0 && i==2){
                        System.out.print("Giron :"+matriz[i][j]+ " ");
                    }
                    if(j==0 && i==3){
                        System.out.print("Piedecuesta :"+matriz[i][j]+ " ");
                    }
                
                }
                }
            System.out.println("");
        }
    }
    // Método restador, restará dos matrices, entregando como resultado una matriz
    public static float[][] restador(float[][]matriz1,float[][]matriz2){
        float resta[][]= new float[4][12];
        for(int i=0 ; i<4 ; i++){
            for(int j=0 ; j<12 ; j++){
            resta[i][j]=matriz1[i][j]-matriz2[i][j];
            }
            
        }
        return resta;
    }
    // Método generador3D, generará un array 3D, recibiendo una matriz decreciendola un porcentaje dado 4 veces
    // entregando un array 3D de 4 matrices
    public static float[][][] generador3D(float[][]matriz,double perc){
        float a= (float)perc;
        
        float newArr3D[][][];
        newArr3D = new float [4][12][4];
        for(int z=0 ; z<4 ; z++){
            for(int i=0 ; i<4 ; i++){
                for(int j=0 ; j<12 ; j++){
                newArr3D[i][j][z] = (matriz[i][j]*100)/(100+a);
                matriz[i][j]=newArr3D[i][j][z];
                }
            }
        }
        return newArr3D;
    }
    // Método imprimir3D, imprimirá una matriz float 3D que se le asigne
    public static void imprimir3D(float[][][]matriz3D){
        for(int z=0 ; z<4 ; z++){
            for(int i=0 ; i<4 ; i++){
                for(int j=0 ; j<12 ; j++){
                System.out.print(matriz3D[i][j][z]+ " ");
                
                }
                System.out.println("");
            }
            System.out.println("");
            
        }
    }
    // Método ganancias3D,recibirá dos array 3D y los restará dos array 3D, entregando como un resultado un array3D
    public static float[][][] calcular_ganancias3D(float[][][]matriz1, float[][][]matriz2){
        float resta[][][]= new float [4][12][4];
        for(int z=0 ; z<4 ; z++){    
            for(int i=0 ; i<4 ; i++){
                for(int j=0 ; j<12 ; j++){
                resta[i][j][z]=matriz1[i][j][z]-matriz2[i][j][z];
                
                }
    
            }
        }
        return resta;
    }
    
}    


