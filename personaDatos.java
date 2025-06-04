import java.util.Scanner;

import personaDatos.persona;


public class personaDatos {

  static persona[] personas = new persona[5];
  
  public static void main(String[] args) {
  contarPersonas();
  presentarNombreYGenero();
  System.out.println("Edad promedio " + calcularPromedioEdad());
  System.out.println("Cantidad de hombres " + contarMasculino());
  System.out.println("Cantidad de mujeres " + contarFemenino());
  }
  
  public static void contarPersonas(){
      try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Sea bienvenido al servicio de datos de la Dane");
                   
          System.out.println("Para continuar, por favor ingrese los siguientes datos en los espacios que aparecerán a continuación: ");
          
          for (int i = 0; i < personas.length; i++) {
              System.out.println("Persona " + (i + 1) + ":");
              
              System.out.print("Para empezar, por favor ingrese su nombre: ");
              String nombre = scanner.next();
              
              System.out.print("Ingrese su apellido: ");
              String apellido = scanner.next();
              
                        System.out.print("Confirme su genero (Ingreselos de esta manera: Masculino/Femenino): ");
              String genero = scanner.next();

                        System.out.print("Ingrese su edad: ");
              int edad = Integer.parseInt(scanner.next());

              
              personas[i] = new persona(nombre, apellido, genero, edad);
              System.out.println("");
          }
      } catch (NumberFormatException e) {
        e.printStackTrace();
      }     
  }
  

     public static double calcularPromedioEdad(){
      int suma = 0;
      for (persona p : personas) {
          suma += p.getedad();
      }
         return (double) suma / personas.length;        
      }
     
       public static void presentarNombreYGenero() {
      System.out.println("Se presentan los nombres y genero de las personas enlistadas: ");
      for (persona p : personas){
          System.out.println("Nombre: " + p.getnombre() + " - Genero " + p.getgenero() );
      }
  }
    
  public static int contarMasculino() {
      int contador = 0;
      for (persona p : personas) {
          if (p.getgenero().equalsIgnoreCase ("Masculino")) {
            contador++;  
          }
      }
      return contador;
  }
     
   public static int contarFemenino() {
      int contador = 0;
      for (persona p : personas) {
          if (p.getgenero().equalsIgnoreCase ("Femenino")) {
            contador++;  
          }
      }
      return contador;
   }
}