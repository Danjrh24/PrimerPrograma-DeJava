import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("""
                
                **********Bienvenido a Banco El Super************
                Nombre del cliente: Bruce Wayne
                Tipo de cuenta: Platino
                Saldo disponible: 2699.99$
                """);
        double saldoDeCuenta = 2699.99;
        boolean permanenciaDelUsuario = true;
        int eleccionDelUsuario;
        while (permanenciaDelUsuario) {
            System.out.println("""
                    *************************************************
                    ** Escriba el numero de la opcion deseada **
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """);
            eleccionDelUsuario = userInput.nextInt();
            switch (eleccionDelUsuario){
                case 1:
                    System.out.println("Su saldo actualizado es de " + saldoDeCuenta + "$");
                break;
                case 2:
                    System.out.println("Ingrese el monto que desea retirar...");
                    int montoDeRetiro = userInput.nextInt();
                    if(montoDeRetiro > saldoDeCuenta) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldoDeCuenta = saldoDeCuenta - montoDeRetiro;
                        System.out.println("Su saldo actualizado es de " +saldoDeCuenta + "$");
                    }
                break;
                case 3:
                    System.out.println("Ingrese el monto que desea depositar...");
                    int montoDeDeposito = userInput.nextInt();
                    saldoDeCuenta = saldoDeCuenta + montoDeDeposito;
                    System.out.println("Su saldo actualizado es de " + saldoDeCuenta + "$");
                break;
                case 9:
                    System.out.println("Finalizando el programa. Gracias por utilizar nuestros servicios");
                    permanenciaDelUsuario = false;
                break;
                default:
                    System.out.println("Ingrese opcion valida");
                break;
            }
        }
    }
}
