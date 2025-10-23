public class Persona {

    private String nombre;
    private int edad;
    private String fechaDeNacimiento;
    private long cedula;
    private String universidad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        setEdad(edad);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        if (edad >= 0) {
            this.edad = edad;
        } else  {
            System.out.println("La edad invalida");
        }
    }
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setCedula(long cedula) {
        String cedulaTexto = String.valueOf(cedula);
        if (cedulaTexto.length() == 11){
            this.cedula = cedula;
        } else {
            System.out.println("Ingrese un numero de cedula valido");
        }
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public long getCedula(){
        return cedula;
    }
    public String getUniversidad(){
        return universidad;
    }

    public String mostrarDatos(){
        return   "\n" + "===Datos de la persona===" + "\n" + "Nombre: " + this.nombre + "\n" + "Edad: " + this.edad
                + "\n" + "Fecha de nacimiento: " + this.fechaDeNacimiento + "\n" + "Cedula: " + this.cedula + "\n" +
                "Universidad: " + this.universidad + "\n";
    }
}
