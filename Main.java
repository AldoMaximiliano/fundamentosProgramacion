public class Main {
    public static void main(String[] args) {
        String nombre = "Garcia, Juan Carlos";

        System.out.println("Longitud del nombre completo: " + nombre.length());
        int indiceComa = nombre.indexOf(',');
        int indiceEspacio = nombre.indexOf(' ');
        int ultimoEspacio = nombre.lastIndexOf(' ');
        System.out.println("Apellido: " + nombre.substring(0,indiceComa));
        System.out.println("Nombre sin apellido: " + nombre.substring(indiceEspacio + 1));
        System.out.println("Primer nombre: " + nombre.substring(indiceEspacio + 1,ultimoEspacio));
        System.out.println("Apellido en mayusculas: " + nombre.substring(0,indiceComa).toUpperCase());
        System.out.println("Nombre completo en minusculas: " + nombre.toLowerCase());
        System.out.println("Caracter en la posicion 5: " + nombre.charAt(5 - 1));
        System.out.println("Primera ocurrencia de 'a': " + nombre.indexOf('a'));
        System.out.println("Ultima ocurrencia de 'a': " + nombre.lastIndexOf('a'));
    }
}