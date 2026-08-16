import java.util.Scanner;
import javax.swing.JOptionPane;

public class OperadorAritmeticos 
{
    public static void main(String[] args) 
    {
        int primernumero, segundonumero, resultado;

        //Suma +
        System.out.println("Ingrese el primer numero por consola");
        Scanner entrada= new Scanner(System.in);
        primernumero = entrada.nextInt();
        System.out.println("Ingrese el segundo numero por consola");
        segundonumero = entrada.nextInt();

        resultado = primernumero + segundonumero; // suma +
        System.out.println("EL resultado de la suma es " + resultado);
        entrada.close();

        //Operacion Resta -
        String apoyo;
        apoyo = JOptionPane.showInputDialog("Ingrese por ventana el primer numero");
        primernumero = Integer.parseInt(apoyo);
        apoyo = JOptionPane.showInputDialog("Ingrese por ventana el segundo numero");
        segundonumero =Integer.parseInt(apoyo);
        resultado = primernumero - segundonumero; //multiplicacion *
        JOptionPane.showMessageDialog(null, "La resta es igual a " + resultado); 

        //Operacion Multiplicacion
        resultado = primernumero * segundonumero; //multiplicacion *
        JOptionPane.showMessageDialog(null, "La multiplicacion es igual a " + resultado);

        //Operacion Division
        resultado = primernumero / segundonumero; //division /
        JOptionPane.showMessageDialog(null, "La division es igual a " + resultado);

        //Operacion Modulo o Residuo
        //Obtener el residuo numerico de una division ejemplo: 3%2 es 1 porque al divir 3 entre 2 de forma entera
        //nos quedara un 1 como residuo esta operacion puede cambiar en otros leguanjes como python o ruby
        resultado = primernumero % segundonumero; //Modulo %
        JOptionPane.showMessageDialog(null, "EL modulo/residuo es igual a " + resultado);

    }    
}


