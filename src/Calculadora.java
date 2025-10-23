import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        //Obteniendo el scanner para manejar entrada de datos del usuario
        Scanner userInput = new Scanner(System.in);
        System.out.println("""
                
                ======Bienvenido a la super calculadora======
                """);
        int eleccion = 0;

        //Estableciendo bucle para utilizar la calculadora
        while (eleccion != 5 ){
            System.out.println("""
                    Escoge la operacion matematica que deseas realizar: 
                    1. Suma
                    2. Resta
                    3. Multiplicacion 
                    4. Division
                    5. Exit 
                    """);
            eleccion = userInput.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("Ingrese el valor 1...");
                    double valor_1 = userInput.nextDouble();
                    System.out.println("Ingrese el valor 2...");
                    double valor_2 = userInput.nextDouble();
                    double suma = valor_1 + valor_2;
                    System.out.printf(String.format("La suma de %.1f + %.1f es %.1f \n",valor_1,valor_2,suma));
                break;
                case 2:
                    System.out.println("Ingrese el valor 1...");
                    double valor1 = userInput.nextDouble();
                    System.out.println("Ingrese el valor 2...");
                    double valor2 = userInput.nextDouble();
                    double resta = valor1 - valor2;
                    System.out.printf(String.format("La diferencia de %.1f - %.1f es %.1f \n",valor1,valor2,resta));
                break;
                case 3:
                    System.out.println("Ingrese el valor 1...");
                    double valor__1 = userInput.nextDouble();
                    System.out.println("Ingrese el valor 2...");
                    double valor__2 = userInput.nextDouble();
                    double multiplicacion = valor__1 * valor__2;
                    System.out.printf(String.format("El producto de %.1f x %.1f es %.1f \n",valor__1,valor__2,multiplicacion));
                break;
                case 4:
                    System.out.println("Ingrese el valor 1...");
                    double valo1 = userInput.nextDouble();
                    System.out.println("Ingrese el valor 2...");
                    double valo2= userInput.nextDouble();
                    double division = valo1 / valo2;
                    System.out.printf(String.format("El cociente de %.1f / %.1f es %.1f \n",valo1,valo2,division));
                break;
                case 5:
                    System.out.println("Gracias por utilizar la super calculadora");
                break;
                default:
                    System.out.println("Ingrese una eleccion valida");
                break;
            }
        }
    }
}
