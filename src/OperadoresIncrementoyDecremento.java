
import javax.swing.JOptionPane;

public class OperadoresIncrementoyDecremento {
    public static void main(String [] args)
    {
        int valor1=5;


        //Incremento

        JOptionPane.showMessageDialog(null, "Valor original = " + valor1);
        //Postfijo Incremento
        JOptionPane.showMessageDialog(null, "Valor postfijo incremento = " + valor1++);
        JOptionPane.showMessageDialog(null, "Valor actual = " + valor1);
        //Prefijo Incremento 
        JOptionPane.showMessageDialog(null, "Valor prefijo incremento = " + ++valor1);
        
        //Decremento
        JOptionPane.showMessageDialog(null, "Valor original = " + valor1);

        //POsfijo Decremento
        JOptionPane.showMessageDialog(null, "Valro postfijo decremento = " + valor1--);
        JOptionPane.showMessageDialog(null, "Valor actual = " + valor1);

        //Prefijo Decremento
        JOptionPane.showMessageDialog(null, "Valor prefijo decremento = " + --valor1);

        //Operador combinado 
        int valor2 = 20;
        JOptionPane.showMessageDialog(null, "Valor original = " + valor2);
        valor2 += 2;
        JOptionPane.showMessageDialog(null, "Valor con operador +=2 " + valor2);
        valor2 -= 4;
        JOptionPane.showMessageDialog(null, "Valor con operador -=4 " + valor2);
        valor2 *=3;
        JOptionPane.showMessageDialog(null, "Valor con operador *=3 " + valor2);
        valor2 /=6;
        JOptionPane.showMessageDialog(null, "Valor con operador /=6 " + valor2);
        valor2 %= 7;
        JOptionPane.showMessageDialog(null, "Valor con operador %=7 " + valor2);



    }
}
