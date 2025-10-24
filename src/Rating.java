import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        double nota = 0;
        double mediaDeNotas = 0;

        for(int i=0; i<3; i++){
            System.out.println("Califica la pelicula Oppenhaimer");
            nota = userInput.nextDouble();
            mediaDeNotas = mediaDeNotas + nota;
        }

        System.out.println("La media de nota de la pelicula Oppenhaimer es: " + mediaDeNotas / 3);
    }
}
