/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ensayo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Jose
 */
public class Ensayo {

    /**
     * @param args the command line arguments
     */
    static int solvemeFirst(int a, int b){
       
        return 0;
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
       int estadoa=0;
       int estadob=0;
       int estadoc=0;
       int estadod=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Tanques y Tuberias");
        int[] Tanques= new int[5] ;
        for(int i=1;i<5;i++){
            System.out.println("ingrese la capacidad en Litros del tanque número " +i);
                Tanques[i]=in.nextInt();
            }
        System.out.println("ingrese la capacidad de Distribucion en litros/sg de la Tuberia A,B " );
        int ab = in.nextInt();
        System.out.println("ingrese la capacidad de Distribucion en litros/sg de la Tuberia A,C " );
        int ac = in.nextInt();
        System.out.println("ingrese la capacidad de Distribucion en litros/sg de la Tuberia C,D " );
        int cd = in.nextInt();
        System.out.println("ingrese El flujo de Entrada al sistema principal en litros/sg " );
        int flujoP = in.nextInt();
        System.out.println("ingrese El tiempo determinado para llenar los tanques en sg" );
        int tiempo = in.nextInt();
        
        for(int i=1;i<=tiempo;i++){
            
            if(estadoa<Tanques[1]){
                estadoa=estadoa+flujoP;
                if(estadoa>Tanques[1]){
                    estadoa=estadoa-flujoP;
                }
                for(int j=i;j<tiempo;j++)
                    if(estadoa>ab&&estadob<Tanques[2]){
                        estadoa=estadoa-ab;
                        estadob=estadob+ab;
                        if(estadob>Tanques[2]){
                            estadoa=estadoa+ab;
                             estadob=estadob-ab;
                        }
                        if(estadoa>ac&&estadoc<Tanques[3]){
                            estadoa=estadoa-ac;
                            estadoc=estadoc+ac;
                            if(estadoc>Tanques[3]){
                            estadoa=estadoa+ac;
                             estadoc=estadoc-ac;
                            }
                                if(estadoc>cd&&estadod<Tanques[4]){
                               estadoc=estadoc-cd;
                               estadod=estadod+cd;
                                   if(estadod>Tanques[4]){
                                                                     

                                       }
                                }
                            
                        }
               }
             } 
         }
        System.out.println("estado actual del tanque A "+estadoa );
        System.out.println("estado actual del tanque B "+estadob );
        System.out.println("estado actual del tanque C "+estadoc );
         System.out.println("estado actual del tanque D "+estadod );
         
     
        
    
      
    }
}