import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        //declarando variables
        Scanner userInput = new Scanner(System.in);
        String nombreDelCliente = "Bruce Wayne";
        String tipoDeCuenta = "Platino";
        double saldoDeCuenta = 2699.99;
        boolean permanenciaDelUsuario = true;
        int eleccionDelUsuario;
        //mostrando informacion de la cuenta
        System.out.println("\n**********Bienvenido a Banco El Super************\n"+ "Nombre del cliente: " +
                nombreDelCliente + "\n" + "Tipo de cuenta: " + tipoDeCuenta + "\n" + "Saldo disponible: " +
                saldoDeCuenta + "$\n");
        //estableciendo bucle de eleccion del usuario
        while (permanenciaDelUsuario) {
            //mostrando menu de opciones al usuario
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
