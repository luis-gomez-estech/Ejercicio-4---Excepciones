package luis.gomez;

public class ConversionBinaria {


    // Aqui he creado la clase que nos pedia el enunciado y su metodo

    public static void binarioAoDecimal(String binaryString) {

        // Ahora he añadido try y casth para avisar por mensaje de que se ha introducido un numero binario incorrecto

        try {

            // Este codigo tampoco lo conocia pero buscando he visto que se usa para hacer la conversion de binario a decimal

            // al cual le paso el valor de binaryString y si lo reconoce como formato correcto, hará el calculo, sino con el catch nos mostrará el error


        int numBinario=Integer.parseInt(binaryString,2);

        System.out.printf("El numero binario %s convertido a decimal es igual a %d", binaryString,numBinario);

        } catch (NumberFormatException e) {
            System.out.println("has introducido un numero binario incorrecto");
        }

    }
}

