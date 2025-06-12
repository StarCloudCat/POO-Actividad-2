package personaDatos;


public class persona {
    
private String nombre;
private String apellido;
private String genero;
private int edad;

    public persona(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    public String getnombre() {
        return nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public String getgenero() {
        return genero;
    }

    public int getedad() {
        return edad;
    }


public void mostrarInformacion(){
    System.out.println("Nombre " + nombre );
    System.out.println("Apellido " + apellido );
    System.out.println("Genero " + genero );
    System.out.println("Edad" + edad );
}


}
