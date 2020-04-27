/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preinforme12_sebastiangomez;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.lang.Math;

/**
 *
 * @author Repre
 */
public class PreInforme12_SebastianGomez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double media,mediaTemp,mediaTempSup,mediaTempMin,desviacion1,desviacion2,desviacion3;
        ArrayList<ArrayList> punto63 = new ArrayList<>();
        ArrayList<Double> temperaturaSup = new ArrayList<Double>();
        ArrayList<Double> temperaturaMin = new ArrayList<Double>();
        ArrayList<Double> temperatura = new ArrayList<Double>();
        ArrayList<Double> presion = new ArrayList<Double>(Arrays.asList(110.06,107.89,108.45,108.49,109.03,110.11,109.87,119.38,119.35,116.34,117.73,120.01,118.19,119.53,117.09,118.03,118.65,117.47,117.49,109.65,110.44,110.51,107.38,109.26,106.18,109.36,106.61,105.16,110.11,105.48,108.37,107.59,108.91,108.35,109.57,122.56,124.44,125.97,121.03,121.22,122.41,122.15,124.52,123.35,125.76,121.08,122.29,105.42,110.67,107.73,105.76,107.85));
        
        System.out.println("La diferencia entre la mayor y menor presion es: "+ MaxminMin(presion)+ "KPa");
        System.out.println("La media de las presiones es :"+ Media(presion)+ "KPa");
        
        media= Media(presion);
        System.out.println("La mediana de las presiones es de: "+ Mediana(presion)+ "KPa");
      
     
        ArrayList<Double> presion1 = new ArrayList<Double>(Arrays.asList(110.06,107.89,108.45,108.49,109.03,110.11,109.87,119.38,119.35,116.34,117.73,120.01,118.19,119.53,117.09,118.03,118.65,117.47,117.49,109.65,110.44,110.51,107.38,109.26,106.18,109.36,106.61,105.16,110.11,105.48,108.37,107.59,108.91,108.35,109.57,122.56,124.44,125.97,121.03,121.22,122.41,122.15,124.52,123.35,125.76,121.08,122.29,105.42,110.65,107.73,105.76,107.85));
        System.out.println("El tamaño de los intervalos consecutivos de presiones que superan o estan por debajo de la media es:"+ consec( presion1 , media));
        
        System.out.println("Lista de temperaturas: "+ temperatura(presion1));
        temperatura= temperatura(presion1);
        mediaTemp= Media(temperatura);
        System.out.println("La desviacion estamdar de las temperaturas es: "+ desviacion(temperatura, mediaTemp));
        punto63= consecTemp(temperatura, mediaTemp);
        temperaturaSup=punto63.get(0);
        temperaturaMin=punto63.get(1);
        System.out.println("La lista de temperaturas que estan por debajo de la media es: "+temperaturaMin);
        System.out.println("La lista de temperaturas que estan por encima de la media es: "+temperaturaSup);
        mediaTempSup=Media(temperaturaSup);
        mediaTempMin=Media(temperaturaMin);
        desviacion1=desviacion(temperaturaSup,mediaTempSup);
        desviacion2=desviacion(temperaturaMin,mediaTempMin);
        desviacion3=(desviacion1+desviacion2)/2;
        System.out.println("La desviacion de las temperaturas que estan por debajo de la media es: "+desviacion2);
        System.out.println("La desviacion de las temperaturas que estan por encima de la media es: "+desviacion1);
        System.out.println("El promedio de estas desviaciones es: "+desviacion3);
        
        

        
    }
    
    
    public static double MaxminMin (ArrayList presion ){
        Collections.sort(presion);
        double a;
        a= (double)presion.get(51)-(double)presion.get(0);
        return a;
    }
    
    public static double Media (ArrayList presion){
        double cont=0;
        double media;
        for (int i=0 ; i<presion.size() ; i++){
            cont= cont+ (double)presion.get(i);
        }
        media= cont/presion.size();
        return media;
    }
    
    public static double Mediana(ArrayList presion){
        double a;
        Collections.sort(presion);
        a=((double)presion.get(25)+(double)presion.get(26))/2;
        
        return a;
    }
    
    public static ArrayList consec (ArrayList presion, double media){
        ArrayList<String> consec = new ArrayList<>();
        int cont=0,cont2=0;
        for(int i=0 ; i<presion.size()-1 ; i++){
            if((double)presion.get(i)> media){
                cont=cont+1;
                if((double)presion.get(i+1)< media){
                consec.add(cont + " Fue mayor");
                cont=0;
                }
            }
            if((double)presion.get(i) < media){
                cont=cont+1;
                if((double)presion.get(i+1) > media){
                consec.add(cont + " Fue menor");
                cont=0;
                }
                if(i+1 == presion.size()-1 ){
                cont= cont+1;
                consec.add(cont + " Fue menor");
                cont=0;
                }
            }
        }
        return consec;
    }
    
    public static ArrayList temperatura (ArrayList presion){
        ArrayList<Double> temp = new ArrayList<Double>();
        double a,b,c;
        for (int i=0 ; i<presion.size() ; i++){
            c=(double)presion.get(i);
            b= (510*c)/(17.16*8.314472);
            a= b-273.15;
            temp.add(a);
        }
        return temp;
    }
    
    
    public static double desviacion(ArrayList presion, double media){
        double cont=0;
        double a,b,c,desviacion;
        for (int i=0 ; i<presion.size() ; i++){
            b=(double)presion.get(i)-media;
            a= Math.pow(b, 2);
            cont= cont + a;
        }
        c= cont/presion.size();
        desviacion= Math.sqrt(c);
        return desviacion;
    }
    
    public static ArrayList consecTemp (ArrayList presion, double media){
        ArrayList<ArrayList<Double>> listOfList = new ArrayList<>();
        ArrayList<Double> consec = new ArrayList<>();
        ArrayList<Double> consec1 = new ArrayList<>();
        int a;
        for(int i=0 ; i<presion.size()-1 ; i++){
            if((double)presion.get(i)> media && (double)presion.get(i+1)> media){
                consec.add((double)presion.get(i));
            }
            else if((double)presion.get(i) < media && (double)presion.get(i+1) < media){
                consec1.add((double)presion.get(i));
                
            }
            
        }
        listOfList.add(consec);
        listOfList.add(consec1);
        return listOfList;
    }

    
    

}
