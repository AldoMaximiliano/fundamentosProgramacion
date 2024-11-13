import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Tablas de multiplicar personalizadas

        System.out.println("Ingresa el numero de la tabla");
        int tabla = sc.nextInt();
        System.out.println("Ingresa el limite para la tabla");
        int limite = sc.nextInt();
        int contador = 1;
        while(contador <= limite){
            System.out.println(tabla+"x"+contador+"="+tabla*contador);
            contador++;
        }
    }
}