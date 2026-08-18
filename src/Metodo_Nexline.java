import java.util.Scanner;

public class Metodo_Nexline
{
    public static void main(String [] args)
    {
        Scanner leerlinea = new Scanner(System.in);
        String linealeida;
        System.out.println("Escriba una frase...\n");
        linealeida = leerlinea.nextLine();
        System.out.println("Linea leida es:\t" + linealeida);

        //que pasa si hago un next antes y luego hago un nextline
        System.out.println("Escriba cualquier cosa...\n");
        linealeida = leerlinea.next();
        System.out.println("Palabra leida porque next solo no lee lineas\t" + linealeida);
        System.out.println("Escriba una frase que los probable es que no podra escribir...\n");
        linealeida = leerlinea.nextLine();
        System.out.println("Linea no leida es:\t" + linealeida);

        //Solucion
        System.out.println("Escriba cualquier cosa...\n");
        linealeida = leerlinea.next();
        System.out.println("Palabra leida porque next solo no lee lineas\t" + linealeida);
        System.out.println("Escriba una frase que si podra escribir...\n");
        linealeida = leerlinea.nextLine(); //quemamos todo lo que haya en el buffer hasta el \n
        linealeida = leerlinea.nextLine();
        System.out.println("Linea leida correctamente es:\t" + linealeida);
        leerlinea.close();

        //posdata tiene mucha similitud con el getline de c++
    }
}