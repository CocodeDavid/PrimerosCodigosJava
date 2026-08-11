import java.util.Scanner;

public class ingresardatos 
{
    public static void main(String[] args) {
        var nombre= "";
        
        Scanner entradadedatos = new Scanner(System.in);

        System.out.println("Ingrese su nombre por favor.....");
        
        nombre = entradadedatos.next();

        System.out.println(nombre + ", buen trabajo");

        entradadedatos.close(); 
        //Es buena practica simpre cerrar los objetos Scanner que creemos
    }
}
