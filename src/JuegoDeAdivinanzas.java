import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinanzas {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int eleccionJugador = 0;
        boolean jugadorQuiereJugar = true;
        System.out.println("""
                
                ======Bienvenido al super juego de adivinar el numero======
                =============Tienes 5 intentos para ganar============
                """);
        while (jugadorQuiereJugar) {
            int numeroAleatorio = new Random().nextInt(100);
            int numeroUsuario = 0;
            for (int i = 0; i < 5; i++) {
                System.out.println("Intenta adivinar el numero, ingresa uno del 1 al 100...");
                numeroUsuario = userInput.nextInt();
                if (numeroUsuario == numeroAleatorio) {
                    System.out.println("Felicidades, adivinaste el numero");
                    break;
                } else if (numeroUsuario > numeroAleatorio) {
                    System.out.println("El numero ingresado es mayor");
                } else if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El numero ingresado es menor");
                }
                System.out.println("Intento numero " + (i + 1));
                if (i == 4) {
                    System.out.println("""
                            Lo siento, no pudiste adivinar el numero
                            Deseas continuar? 
                            1. Si 
                            2. No
                            """);
                    eleccionJugador = userInput.nextInt();
                    if (eleccionJugador == 2) {
                        System.out.println("Gracias por jugar");
                        jugadorQuiereJugar = false;
                        break;
                    }
                }
            }
        }
    }
}
