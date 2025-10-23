public class Main {
    public static void main(String[] args){
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.1;

        double media = (int) (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        Persona daniel = new Persona("Daniel Rodriguez", 18);
        daniel.setCedula(40212121312L);
        daniel.setUniversidad("INTEC");
        daniel.setFechaDeNacimiento("24 de mayo de 2007");
        System.out.println(daniel.mostrarDatos());
    }
}
