import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinanzas {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroUsuario = 0;
        System.out.println("\n ======Bienvenido al super juego de adivinar el numero====== \n");
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Intenta adivinar el numero, ingresa uno del 1 al 100...");
            numeroUsuario = userInput.nextInt();
            if(numeroUsuario == numeroAleatorio) {
                System.out.println("Felicidades, adivinaste el numero");
                break;
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El numero ingresado es mayor");
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El numero ingresado es menor");
            }
            if (i == 4) {
                System.out.println("Lo siento, no pudiste adivinar el numero");
                break;
            }
            System.out.println("Intento numero " + (i + 1));
        }
    }
}
