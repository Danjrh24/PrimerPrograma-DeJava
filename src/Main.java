import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creando una calculadora de grados celcius a farenheit y viceversa
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;
        while (eleccion != 3) {
            System.out.println("""
                    
                    Que desea convertir? 
                    1. Celcius a Farenheit
                    2. Farenheit a Celcius
                    3. Salir
                    """);
            eleccion = sc.nextInt();
//            if (eleccion == 1) {
//                System.out.println("Ingrese el grado Celcius");
//                float gradoCelcius = sc.nextFloat();
//                float farenheit = (float) ((gradoCelcius * 1.8) + 32);
//                System.out.printf(String.format("%.1f grados Celcius a Farenheit son %.1f ", gradoCelcius, farenheit));
//            } else if (eleccion == 2) {
//                System.out.println("Ingrese el grado Farenheit");
//                float gradoFarenheit = sc.nextFloat();
//                float celcius = (float) ((gradoFarenheit - 32) / 1.8);
//                System.out.printf(String.format("%.1f grados Farenheit a Celcius son %.1f ", gradoFarenheit, celcius));
//            } else if (eleccion == 3 ){
//                System.out.println("Gracias por utilizar la calculadora de grados!!");
//            } else {
//                System.out.println("Ingrese una eleccion valida");
//            }
            switch (eleccion){
                case 1:
                    System.out.println("Ingrese el grado Celcius");
                    float gradoCelcius = sc.nextFloat();
                    float farenheit = (float) ((gradoCelcius * 1.8) + 32);
                    System.out.printf(String.format("%.1f grados Celcius a Farenheit son %.1f ", gradoCelcius, farenheit));
                break;
                case 2:
                    System.out.println("Ingrese el grado Farenheit");
                    float gradoFarenheit = sc.nextFloat();
                    float celcius = (float) ((gradoFarenheit - 32) / 1.8);
                    System.out.printf(String.format("%.1f grados Farenheit a Celcius son %.1f ", gradoFarenheit, celcius));
                break;
                case 3:
                    System.out.println("Gracias por utilizar la calculadora de grados!!");
                break;
                default:
                    System.out.println("Ingrese una eleccion valida");

            }

        }
        //Inicializacion de primera instancia de Persona
        Persona daniel = new Persona("Daniel Rodriguez", 18);
        daniel.setCedula(40212121312L);
        daniel.setUniversidad("INTEC");
        daniel.setFechaDeNacimiento("24 de mayo de 2007");
    }
}
