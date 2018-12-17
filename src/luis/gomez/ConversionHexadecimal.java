package luis.gomez;

import java.lang.NumberFormatException;

public class ConversionHexadecimal  {

// Aqui he creado la clase que nos pedia el enunciado y su metodo


       public static void hexADecimal(String hexString) {

           // Ahora he añadido try y casth para avisar por mensaje de que se ha introducido un numero hexadecima incorrecto

           try {

               // Este codigo no lo conocia pero buscando he visto que se usa para hacer la conversion de hexadecimal a decimal

               // al cual le paso el valor de hexString y si lo reconoce como formato correcto, hará el calculo, sino con el catch nos mostrará el error
               Integer outputDecimal = Integer.parseInt(hexString, 16);

               System.out.printf("El numero hexadecimal %s convertido a decimal es igual a %s", hexString,outputDecimal);

           } catch (NumberFormatException e){
               System.out.println("Has introducido un numero hexadecimal incorrecto");

           }



       }
    }





