import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Verificar si un numero es palindromo
        System.out.println("Ingresa un numero: ");
        int numero = sc.nextInt();
        String cadena = Integer.toString(numero);
        boolean esPalindromo = false;

        int inicio = 0;
        int fin = cadena.length() - 1;
        while(inicio < fin){
            if (cadena.charAt(inicio) == cadena.charAt(fin)) {
                esPalindromo = true;
            }else{
                esPalindromo = false;
            }
            inicio++;
            fin--;
        }
        if (esPalindromo == true){
            System.out.println("El numero "+numero+" es palindromo");
        }else {
            System.out.println("El numero "+numero+" no es palindromo");
        }
    }
}