import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        nextLine para String
        nextInt para enteros
        nextDouble para doubles


        System.out.println("Ingresa tu año de nacimiento: ");
        int añoNacimiento = sc.nextInt();
        System.out.println(2024 - añoNacimiento);*/

        int nUno = 0, nDos = 0, nTres = 0;
        double nCuatro = 0, nCinco = 0;

        System.out.println("Ingresa numero 1: ");
        nUno = sc.nextInt();
        System.out.println("Ingresa numero 2: ");
        nDos = sc.nextInt();
        System.out.println("Ingresa numero 3: ");
        nTres = sc.nextInt();
        System.out.println("Ingresa numero 4: ");
        nCuatro = sc.nextDouble();
        System.out.println("Ingresa numero 5: ");
        nCinco = sc.nextDouble();

        double opUno = nUno / nCuatro, opDos = (nTres + nDos) / nCinco, opTres = (nDos + nTres) * nCuatro;
        double opCuatro = (nCinco / nUno) + (nDos / nTres) - nCuatro, opCinco = nUno + nDos + nTres;

        double numerador = (opUno * opDos) / opTres;
        double denominador = opCuatro / opCinco;
        double total = numerador / denominador;

        System.out.println(total);


        //ejercicio 1 unidad 2
    }
}