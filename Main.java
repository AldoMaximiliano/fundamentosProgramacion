public class Main {
    public static void main(String[] args) {
        String correo = "juan.perez@empresa.com";
        String fechaAscenso = "2023-04-15";
        String salario = "50000.75";

        int indiceArroba = correo.indexOf("@"); // 10
        int primerGuion = fechaAscenso.indexOf('-');
        int ultimoGuion = fechaAscenso.lastIndexOf('-');
        int indicePunto = salario.indexOf('.');

        String nombreCorreo = correo.substring(0,indiceArroba);
        String nombreCorreoInvertido = "";
        for (int i = nombreCorreo.length() - 1; i>=0;i--){
             nombreCorreoInvertido += String.valueOf(nombreCorreo.charAt(i));
        }

        String correoInvertido = nombreCorreoInvertido + correo.substring(indiceArroba);

        int año = Integer.valueOf(fechaAscenso.substring(0,primerGuion));
        int mes = Integer.valueOf(fechaAscenso.substring(primerGuion + 1,ultimoGuion));
        int dia = Integer.valueOf(fechaAscenso.substring(ultimoGuion + 1));

        int fechaEncriptada = año + mes + dia;

        int enteroSalario = Integer.valueOf(salario.substring(0,indicePunto));
        int decimalSalario = Integer.valueOf(salario.substring(indicePunto + 1));
        

        int restaSalario = enteroSalario - decimalSalario;
        int salarioEncriptado = Math.abs(restaSalario) * 2;

        System.out.println("Correo: "+correo);
        System.out.println("Fecha de Ascenso: "+fechaAscenso);
        System.out.println("Salario: "+salario);

        System.out.println("Datos Encriptados:");
        System.out.println(correoInvertido + "|" + fechaEncriptada + "|" + salarioEncriptado);

    }
}