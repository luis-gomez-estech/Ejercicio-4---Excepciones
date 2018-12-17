package luis.gomez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /* Crea dos clases denominada ConversionHexadecimal y ConversionBinaria que implementen los siguientes métodos:
hexADecimal(String hexString) que dado un String que representa un número en hexadecimal, lo convierta a decimal.
binarioAoDecimal (String binaryString) que dado un String que representa un número binario, lo convierta a decimal
Añade las excepciones correspondientes para que no se permita introducir valores no válidos.  Compruebe el correcto funcionamiento de dicha clase en la clase main.*/


    public static void main(String[] args) {

        // Inicio Scanner
        Scanner sc = new Scanner(System.in);

        // Añado try para que en caso de que ne el menu se introduzca un numero, el rpograma continue, pero si se introduce
        // una letra, nos avise con un catch  de que Debes de introducir un valor numerico


        try {

            System.out.println("Introduce el numero de la operacion a realizar");

            System.out.println();

            System.out.println("1. Convertir hexadecimal en decimal");
            System.out.println("2. Convertir binario en decimal");

            // Alameco la opcion elegida
            int numero = sc.nextInt();

            // Ahora valido, y le digo que si se introduce un numero dentro del rango 1-2, seguira el programa sino indicara que hemos introducido una opcion no disponible

            if (numero > 0 && numero < 3) {


                // Ahora con un switch voy llamando a los metodos de la calsss correspondiente a la operacion a reaizar
                switch (numero){

                    case 1:

                        System.out.println("Introduce un numero hexadecimal");
                        // Como el enunciado dice que el metodo de la clase para el calculo de hexadecimal a decimal tiene que llamarse hexADecimal(String hexString)

                        //por eso lo almaceno con este nombre hexString

                        String hexString = sc.next();

                        // Ahora llamo al metodo hexADecimal de la clase ConversionHexadecimal, por eso pongo el nombre de la clase que va a realizzar el calculo,
                        // seguido de un punto, y el nombre dle metodo y entre parentesis el nombre de la variable que va a usar el metodo

                        ConversionHexadecimal.hexADecimal(hexString);

                        break;

                    case 2:

                        // Aqui seria exctamente igual que en caso 1, pero llamando esta vez al metodo binarioAoDecimal de la clase ConversionBinaria

                        System.out.println("Introduce un numero binario");

                        String binaryString = sc.next();

                        ConversionBinaria.binarioAoDecimal(binaryString);

                        break;


                }

            // aqui la validacion que he comentado antes ppor si se intruduce para el menu, un numero distinto de 1 o 2
            } else {
                System.out.println("Has introducido una opción no disponible");
            }

            sc.close();

            // y aqui el casth para mostrar el mensaje en caso de introducir una letra en el menu
        } catch (InputMismatchException e){
            System.out.println("Debes de introducir un valor numerico");
        }

    }
}

