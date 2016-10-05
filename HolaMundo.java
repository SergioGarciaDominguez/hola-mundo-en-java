/**
* Hola mundo en java con colores
*
* @author Sergio García Domínguez
*/

public class HolaMundo{
  public static void main(String[] args) {
    String naranja = "\033[33m";
    String azul = "\033[34m";
    
    System.out.println(azul + "Hola" + naranja + " Mundo");
  }
}
