import java.util.Scanner;

public class Ejercicio12 
{
    public static void main(String[] args) 
    {
    // Ejercicio 12
    /*
        String mensajeSaludo = "Hola mundo!";
        System.out.println(mensajeSaludo);

        var mensajeDespedida = "Chau mundo!";
        System.out.println(mensajeDespedida);

        var numero = 1;
        System.out.println(numero);
    */
    
    // Ejercicio 13
    /*
        var usuario = "Juan";
        var saludar = "Hola";
        
        System.out.println(saludar + " " + usuario);
        
        int i = 3;
        int j = 5;
        System.out.println(i + j);
        
        System.out.println(saludar + i + j);
        
        System.out.println(i + j + saludar);
    */
        
    // Ejercicio 14
    /*
        String saludo = "Hola";
        System.out.println(saludo);
        
        String variableLargaConVariosNombres;
        int _hola;
        float $adios;
        char adios;
    */
        
    // Ejercicio 15
    /*
        String nombre = "Karla";
        String apellido = "Esparza";
        System.out.println(nombre + " " + apellido);
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retorno de carro: \r" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla simple: '" + nombre + "'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        System.out.println("saludos");
        System.out.print("adios");
        System.out.println("nos vemos");
    */
        
    //Ejercicio 16
    /*    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresá el nombre del usuario: ");
        var usuario = scanner.nextLine();
        System.out.println("Usuario: " + usuario);
    */
        
    //Ejercicio 17
    /*
        //byte, short, int, long
        byte byteVar = 15; // 
        System.out.println("byteVar: " + byteVar);
        System.out.println("bits tipo byte: " + Byte.SIZE);
        System.out.println("bytes tipo byte: " + Byte.BYTES);
        System.out.println("valor minimo tipo byte: " + Byte.MIN_VALUE);
        System.out.println("valor máximo tipo byte: " + Byte.MAX_VALUE);
        
        short shortVar = 1000;
        System.out.println("shortVar: " + shortVar);
        System.out.println("bits tipo short: " + Short.SIZE);
        System.out.println("bytes tipo short: " + Short.BYTES);
        System.out.println("valor minimo tipo short: " + Short.MIN_VALUE);
        System.out.println("valor máximo tipo short: " + Short.MAX_VALUE);
        
        int intVar = 5000;
        System.out.println("intVar: " + intVar);
        System.out.println("bits tipo Integer: " + Integer.SIZE);
        System.out.println("bytes tipo Integer: " + Integer.BYTES);
        System.out.println("valor minimo tipo Integer: " + Integer.MIN_VALUE);
        System.out.println("valor máximo tipo Integer: " + Integer.MAX_VALUE);
        
        long longVar = 9223372036854775807L;
        System.out.println("longVar: " + longVar);
        System.out.println("bits tipo Integer: " + Long.SIZE);
        System.out.println("bytes tipo Integer: " + Long.BYTES);
        System.out.println("valor minimo tipo Integer: " + Long.MIN_VALUE);
        System.out.println("valor máximo tipo Integer: " + Long.MAX_VALUE);
        
        var numero = 9223372036854775807L;
        System.out.println("numero: " + numero);
    */
        
    //Ejercicio 18
    /*
        int numeroDecimal = 10;
        System.out.println("numeroDecimal: " + numeroDecimal);
        
        int numeroOctal = 012;
        System.out.println("numeroOctal: " + numeroOctal);
        
        int numeroHexadecimal = 0xA;
        System.out.println("numeroHexadecimal: " + numeroHexadecimal);
        
        int numeroBinario = 0b1010;
        System.out.println("numeroBinario: " + numeroBinario);
    */
        
    //Ejercicio 19
    /*
        float floatVar = 1000.95F;
        System.out.println("floatVar: " + floatVar);
        System.out.println("bits en el tipo float: " + Float.SIZE);
        System.out.println("byte en el tipo float: " + Float.BYTES);
        System.out.println("valor mínimo en el tipo float: " + Float.MIN_VALUE);
        System.out.println("valor maximo en el tipo float: " + Float.MAX_VALUE);
        
        double doubleVar = 100123.95D;
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("bits en el tipo double: " + Double.SIZE);
        System.out.println("byte en el tipo double: " + Double.BYTES);
        System.out.println("valor mínimo en el tipo double: " + Double.MIN_VALUE);
        System.out.println("valor maximo en el tipo double: " + Double.MAX_VALUE);
    */
        
    //Ejercicio 20
    /*
        char charVar = 'a';
        System.out.println("charVar: " + charVar);
        System.out.println("bits en el tipo char: " + Character.SIZE);
        System.out.println("byte en el tipo char: " + Character.BYTES);
        System.out.println("valor mínimo en el tipo char: " + Character.MIN_VALUE);
        System.out.println("valor maximo en el tipo char: " + Character.MAX_VALUE);
        
        char unicodeVar = '\u0021';
        System.out.println("unicodeVar: " + unicodeVar);
        
        char decimalVar = 33;
        System.out.println("decimalVar: " + decimalVar);
        
        char simboloVar = '!';
        System.out.println("simboloVar: " + simboloVar);
    */
        
    //Ejercicio 21
    /*
        System.out.println("true tipo bool: " + Boolean.TRUE);
        System.out.println("false tipo bool: " + Boolean.FALSE);
        
        boolean booleanVar = Boolean.FALSE;
        booleanVar = true;
        if(booleanVar)
        {
            System.out.println("El valor es verdadero");
        }
        else
        {
            System.out.println("El valor es falso");
        }
        
        System.out.println("");
        int edad = 10;
        boolean esAdulto = edad >= 18;
        System.out.println("esAdulto: " + esAdulto);
    */
    
    //Ejercicio 22
    ///*
        //Convertir String a int
        int edad = Integer.parseInt("20");
        System.out.println("edad: " + edad);
        
        double valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI: " + valorPI);
        
        char charVar = "Hola".charAt(1);
        System.out.println("charVar: " + charVar);
        
        Scanner scanner = new Scanner(System.in);
        edad = Integer.parseInt( scanner.nextLine() );
        System.out.println("edad: " + edad);
        
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter: " + caracter);
        
        String edadText = String.valueOf(25);
        System.out.println("edadText: " + edadText);
        
        short shortVar = 10;
        byte byteVar = (byte)shortVar;
        System.out.println("byteVar: " + byteVar);
    //*/
    }
}
