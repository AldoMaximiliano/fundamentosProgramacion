import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad limite para la serie: ");
        int limite = sc.nextInt();
        int contador = 1;
        int numeroUno = 0;
        int numeroDos = 1;
        int fibonacci = 0;
        String resultado = "";
        while(contador < limite){
            fibonacci = numeroUno + numeroDos;
            resultado = resultado + " "+fibonacci;

            numeroUno = numeroDos;
            numeroDos = fibonacci;
            contador++;
        }
        System.out.println(resultado);
    }
}