import javax.swing.JOptionPane;

public class OPeradoresdeComparacion
{       
    public static void main(String [] args)
    {
        int valor1, valor2;
        /*Los operadores de comparacion siempre arrojan un valor booleano True o false
        */
        String apoyo= JOptionPane.showInputDialog("Ingrese el valor del primer numero");
        valor1 = Integer.parseInt(apoyo);
        apoyo = JOptionPane.showInputDialog("Ingrese el valor del segundo numero");
        valor2 = Integer.parseInt(apoyo);

        //Operador igual ==
        JOptionPane.showMessageDialog(null, valor1 + " Es igual a " + valor2 +" ? " + (valor1 == valor2));
        //Si se quiere mostrar en pantalla sin crear una variable de apoyo y queremos concatenar con texto
        //Se tiene que colocar la operacion de comparacion dentro de parentesis

        //Operador Diferente !=
        boolean resultado = valor1!= valor2;
        JOptionPane.showMessageDialog(null, valor1 + " Es Diferente a " + valor2 +" ? " + resultado);

        //Operador mayor que 
        resultado = valor1 > valor2;
        JOptionPane.showMessageDialog(null, valor1 + " Es mayor que " + valor2 +" ? " + resultado);

        //Operador menor que 
        resultado = valor1 < valor2;
        JOptionPane.showMessageDialog(null, valor1 + " Es menor que " + valor2 +" ? " + resultado);

        //Operador mayor o igual que
        resultado = valor1 >= valor2;
        JOptionPane.showMessageDialog(null, valor1 + " Es mayor o igual que " + valor2 +" ? " + resultado);

        //Operador menor o igual que 
        resultado = valor1 <= valor2;
        JOptionPane.showMessageDialog(null, valor1 + " Es menor o igual que " + valor2 +" ? " + resultado);

    }
}