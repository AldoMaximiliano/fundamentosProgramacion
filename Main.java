public class Main {
    public static void main(String[] args) {
        String cadena = "supercalifragilisticoespialidoso";

        System.out.println("Longitud: " + cadena.length());
        System.out.println("Caracter en posicion: " + cadena.charAt(10));
        System.out.println("En mayusculas: " + cadena.toUpperCase());
        System.out.println("Subcadena (5,15): " + cadena.substring(5,15));
        System.out.println("Primera ocurrencia de 'i': " + cadena.indexOf('i'));
        System.out.println("Ultima ocurrencia de 'o': " + cadena.lastIndexOf('o'));
        System.out.println("En minusculas: " + cadena.toLowerCase());
        System.out.println("Subcadena (7,final): " + cadena.substring(7));
        System.out.println("Ultima ocurrencia de la frase 'li': "+cadena.lastIndexOf("li"));
    }
}