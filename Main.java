import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingresa tu calle: ");
        String calle = sc.nextLine();
        System.out.println("Ingresa tu numero: ");
        String numero = sc.nextLine();
        System.out.println("Ingresa tu colonia: ");
        String colonia = sc.nextLine();

        System.out.println("Ingresa tu codigo postal: ");
        String codigoPostal = sc.nextLine();
        System.out.println("Ingresa tu ciudad: ");
        String ciudad = sc.nextLine();
        System.out.println("Ingresa tu estado: ");
        String estado = sc.nextLine();

        System.out.println("Ingresa el nombre de tu primaria: ");
        String nombrePrimaria = sc.nextLine();
        System.out.println("Ingresa la ubicacion de tu primaria: ");
        String ubicacionPrimaria = sc.nextLine();


        System.out.println("Ingresa el nombre de tu secundaria: ");
        String nombreSecundaria = sc.nextLine();
        System.out.println("Ingresa la ubicacion de tu secundaria: ");
        String ubicacionSecundaria = sc.nextLine();

        System.out.println("Ingresa el nombre de tu preparatoria: ");
        String nombrePreparatoria = sc.nextLine();
        System.out.println("Ingresa la ubicacion de tu preparatoria: ");
        String ubicacionPreparatoria = sc.nextLine();

        System.out.println("Ingresa el nombre de tu deporte favorito: ");
        String deporteFavorito = sc.nextLine();
        //No se que mas preguntar sobre el deporte :c

        String datosDomicilio = "Tu domicilio es: "+calle+", número "+numero+", colonia "+colonia+", "+codigoPostal+", "
                                 +ciudad+", "+estado+"\n";
        String datosEscuela = "Estudiaste en la primaria "+nombrePrimaria+", ubicada en "+ubicacionPrimaria+
                              ", fuiste a la secundaria "+nombreSecundaria+", en "+ubicacionSecundaria+", y la preparatoria en "
                             +nombrePreparatoria+", en "+ubicacionPreparatoria;

        String fin = datosDomicilio+datosEscuela+", y tu deporte favorito es "+deporteFavorito;

        System.out.println(fin);
    }
}