import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ordenar 3 numeros

        int menor=0;
        int mayor=0;
        int medio=0;

        System.out.println("Ingresa el primer numero: ");
        int numeroUno = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int numeroDos = sc.nextInt();
        System.out.println("Ingresa el tercer numero: ");
        int numeroTres = sc.nextInt();

        if (numeroUno > numeroDos && numeroUno > numeroTres){
            mayor = numeroUno;
            if (numeroDos < numeroTres){
                menor = numeroDos;
                medio = numeroTres;
            }
        } else if (numeroDos > numeroUno && numeroDos > numeroTres) {
            mayor = numeroDos;
            if (numeroUno < numeroTres){
                menor = numeroUno;
                medio = numeroTres;
            }
        } else if (numeroTres > numeroDos && numeroTres > numeroUno) {
            mayor = numeroTres;
            if (numeroUno < numeroDos){
                menor = numeroUno;
                medio = numeroDos;
            }
        }
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero del medio es: "+medio);
        System.out.println("El numero menor es: "+menor);
    }
}