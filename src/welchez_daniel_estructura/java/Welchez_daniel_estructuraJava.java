/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package welchez_daniel_estructura.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Welchez_daniel_estructuraJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int opcion =0;
        int  calrevez=0;
        int cperfecto=0;
        int contprimos=0;
        int contvotacion=0;
        
        do{
            System.out.println("****MENU*****"
            +"\n 1 - Palabra alrevez"
            +"\n 2 - Numeros perfectos"
            +"\n 3 - Primos"
            +"\n 4 - Votaciones"
            +"\n 5 - Salir");
            
            System.out.println("Ingresar numero de cada opcion: ");
            opcion=entrada.nextInt();
            switch(opcion){
                case 1:
                calrevez++;
                    String palabra;
                    System.out.println("****Palabra al revez");
                    //ingresamos la palabra
                    // l toUpperCase lo usamos para que mas adelante nos 
                    System.out.println("Ingrese una palabra: ");
                    palabra = entrada.next();
                    int length = palabra.length();
                    
                    for(int reves = palabra.length() -1; reves >= 0; reves--){
                        System.out.println(palabra.charAt(reves));
                    }
                    System.out.println();
                break;
                
                case 2: 
                    cperfecto++;
                    //Agregamos la variable cperfecto (contar perfecto) y las variables que vamos a nesecitar
                    int contador=0;
                    int numero=0;
                    int div=0;
                    System.out.println("****NUMEROS PERFECTOS*****");
                    //Solicitamos al usuario que ingrese un numero
                    System.out.println("Ingrese un numero: ");
                    numero=entrada.nextInt();
                    //Usamos el ciclo for para que ejecute todos los numeros excepto el 1
                    //le agregamos una condicion if para que valide que el numero ingresado sea divisor al numero que ingreso
                    for (contador = 1; contador < numero; contador++){
                        if (numero % contador ==0){
                            div += contador;
                        }
                        
                    }
                    //Le agregamos un if para que compare si la suma de los divisores es igual al numero que nosotros ingresamos
                    // Si no es asi imprime lo contrario con else
                    if (div==numero){
                        System.out.println(+numero+"<=es un numero perfecto");  
                        
                    }else {
                        System.out.println("+numero+<=no es un numero perfecto");
                    }
                    break;
                    
                case 3 :
                    contprimos++;
                    //Ponemos una variable y la igualamos a la random para que imprima varios numeroa aleatorios entre el 1 y el 100
                    int numRandom = random.nextInt(100);
                    // esta variable contdivisor lo igualamos a 1 para que cuente los numeros divisores desde el numero 1
                    int contdivisor = 1;
                    int primo=0;
                    
                    System.out.println("****PRIMOS******");
                    
                    System.out.println("El numero generado aleatoriamente es: "+numRandom);
                    //Creamos una repeticion con el ciclo while para encontrar un divisor
                    while(contdivisor <= numRandom){
                        // el if verificaa si el contador es divisor del numero aleatorio
                        if(numRandom % contdivisor ==0){
                            primo += contdivisor;
                        }
                        break;
                  
                    }
                     contdivisor++;
                     
            //Con la condicion if comparamos si es un numero primo al numero dado aleatoriamente
            //Si se cumple la condicion se divide por dos numeros quee son 1 y el numero aleaorio
            //Si no se cumple la condicion se indica que no se cumplio
              if (primo==numRandom + 1){
                System.out.println("El "+numRandom+" es divisor de dos numeros");
                  System.out.println("Divisores de "+numRandom+" son: 1 y "+numRandom);
                  
            }else{
                  System.out.println("No es un numero primo");
              }
            break; 
              
                case 4: 
                    contvotacion++;
                    int votoazul=0;
                    int votoamarillo=0;
                    int votorojo=0;
                    int votonegro=0;
                    int votosnulos=0;
                    int repetidor=0;
                    
                    System.out.println("****VOTACIONES*****");
                    System.out.println("Ingrese cantidad de votantes: ");
                            int votantes=entrada.nextInt();
                            for (repetidor = 0; repetidor<votantes; repetidor++){
                                
                                System.out.println("****PLANILLAS****"
                                +"\n * AZUL"
                                +"\n * AMARILLO"
                                +"\n * ROJOS"
                                +"\n * NEGROS");
                                System.out.println("Ingrese el voto en la planilla de su preferencia: ");
                                String planilla=entrada.next().toUpperCase();
                                
                                switch(planilla){
                                    case "AZUL" :
                                        votoazul++;
                                        break;
                                    case "AMARILLO" :
                                        votoamarillo++;
                                        break;
                                    case "ROJO" :
                                        votorojo++;
                                        break;
                                    case "NEGRO" :
                                        votonegro++;
                                        break;
                                    default:
                                        votosnulos++;
                                        break;
                                }
                                        
                                int votoValidos = votoazul + votoamarillo + votorojo + votonegro;
                                if (votoValidos >= votantes *0.6) {
                                    String planillaganadora ="";
                                    int maxvotos =0;
                                    if(votoazul > maxvotos) {
                                        maxvotos = votoazul;
                                        planillaganadora = "AZUL";
                                    }
                                    if (votorojo > maxvotos) {
                                        maxvotos = votorojo;
                                        planillaganadora = "ROJO";
                                    }
                                    if (votoamarillo > maxvotos){
                                        maxvotos = votoamarillo;
                                        planillaganadora = "AMARILLOS";
                                    }
                                    if (votonegro > maxvotos){
                                        maxvotos = votonegro;
                                        planillaganadora = "NEGRO";
                                    }
                                    // se imprimira la planilla ganadora 
                                    System.out.println("La plantilla ganadora es: "+ planillaganadora);
                                    
                                }else {
                                    //Imprime que no se reaizo la votacion por que no cumplia los requisitos
                                    System.out.println("VOTACION ERRONEA");
                                }
                                break;
                                
                            }
                case 5: 
                    System.out.println("Veces de palabra al revez : "+calrevez);
                    System.out.println("Veces de numeros perfectos : "+cperfecto);
                    System.out.println("Veces de PRIMOS : "+contprimos);
                    System.out.println("Veces de votacion : "+contvotacion);               
                            
            }
  
                    
        }while (opcion !=5);
        
    }
    
}
