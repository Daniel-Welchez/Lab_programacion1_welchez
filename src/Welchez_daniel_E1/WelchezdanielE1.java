/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.WelchezdanielE1 to edit this template
 */
package Welchez_daniel_E1;


import java.util.Scanner;


public class WelchezdanielE1 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion =0;
        int  piramide=0;
        int elmayor=0;
        int ingresop=0;
        int caracvoc=0;
        
        do{
            System.out.println("****MENU*****"
            +"\n 1 - Piramide"
            +"\n 2 - El mayor"
            +"\n 3 - Ingreso caja cliente"
            +"\n 4 - Caracteres Vocales"
            +"\n 5 - Salir");
            
            System.out.println("Ingresar numero de cada opcion: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    piramide++;
                    System.out.print("Cantidad de fila de la piramide: ");
        int filas = entrada.nextInt();

        int numeroActual = 1;

        for (int i = 1; i <= filas; i++) {
            int sumaFila = 0;

            // Imprimiremos el numero de filas dadas 
            for (int j = 0; j < i; j++) {
                System.out.print(numeroActual + " ");
                sumaFila += numeroActual;
                numeroActual += 2; // Crece 2 veces el numero para ver el siguiente
            }
            
            // Imprime la suma de la fila
            System.out.println("= " + sumaFila);
        }
                    break;
                case 2:
                    elmayor++;
                    int mayor = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible
        int suma = 0;
        int contador = 0;
        String continuar;

        do {
            System.out.print("Ingrese un numero entero: ");
            int numero = entrada.nextInt();
            entrada.nextLine(); 

            //se actualiza el numero mayor si el que se ingresa es mayor
            if (numero > mayor) {
                mayor = numero;
            }

            //Se suma el numero dado con los que ya tenemos
            suma += numero;
            contador++;

            // Preguntar si desea continuar
            System.out.print("Le gustaria ingresar otro numero (si/no): ");
            continuar = entrada.nextLine().toLowerCase();
        } while (continuar.equals("si"));

        // Calcular el promedio
        double promedio = (double) suma / contador;

        // Imprimir el resultado
        System.out.println("El numero mayor ingresado es: " + mayor);
        System.out.println("El promedio de los numeros ingresados es: " + promedio);
        
        break; 
        
                case 3: 
                    ingresop++;
                     // Ingreso del nombre del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = entrada.next();

        int contadorHD = 0;
        int contadorNormal = 0;

        // Ingreso repetitivo de canales
        while (true) {
            System.out.print("Ingrese el tipo de canal (HD o NORMAL): ");
            String tipoCanal = entrada.next().toUpperCase();

            if (tipoCanal.equals("HD")) {
                contadorHD++;
            } else if (tipoCanal.equals("NORMAL")) {
                contadorNormal++;
            } else {
                System.out.println("Tipo de canal no válido, intente nuevamente.");
                continue;
            }

            // Preguntar si desea ingresar otro canal
            System.out.print("Desea ingresar otro canal (SI/NO): ");
            String respuesta = entrada.next().toUpperCase();
            if (!respuesta.equals("SI")) {
                break;
            }
        }

        // Ingreso del tipo de caja que desea
        System.out.print("Ingrese el tipo de caja digital (LIGHTBOX, HDBOX o DVRBOX): ");
        String tipoCaja = entrada.next().toUpperCase();

        //Sub total
        int costoCanales = contadorNormal * 20 + contadorHD * 30;
        int costoCaja = switch (tipoCaja) {
            case "LIGHTBOX" -> 50;
            case "HDBOX" -> 100;
            case "DVRBOX" -> 150;
            default -> 50;
        };

        int subtotal = costoCanales + costoCaja;
        double impuesto = subtotal * 0.15;
        double total = subtotal + impuesto;

        // Mostrar resultados
        System.out.println("\n--- Resumen de Factura ---");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Canales HD: " + contadorHD);
        System.out.println("Canales NORMAL: " + contadorNormal);
        System.out.println("Subtotal: " + subtotal + " Lps");
        System.out.println("Impuesto (15%): " + impuesto + " Lps");
        System.out.println("Total a pagar: " + total + " Lps");
        
        break;
                case 4:
                    // Ingreso de datos
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = entrada.next();

        int contadorVocales = 0;

        // Recorrer cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            // Comprobar las vocales que se identificaronn
            switch (caracter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contadorVocales++;
                    break;
                default:
                    // No es una vocal minúscula, no hace nada
                    break;
            }
        }

        // Impresion de datos
        System.out.println("La cantidad de vocales minusculas es: " + contadorVocales);
                    
        break;    
                case 5:
                    System.out.println("HASTA LUEGO");
                break; // Finaliza el ciclo y el programa
        } 
        
            
         //:D 
        } while (opcion !=5);
    }
    
}
