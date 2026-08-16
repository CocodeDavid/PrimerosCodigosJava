import javax.swing.JOptionPane;

public class OperadoresLogicos 
{
    public static void main(String[] args)
    {
        boolean a= true, b= false, resultado;

        //AND 
        resultado = a && b;
        JOptionPane.showMessageDialog(null, "Resultado del operador AND\n" + a + " && " + b + " = " + resultado);
    
        //OR
        resultado = a || b;
        JOptionPane.showMessageDialog(null, "Resultado del operador OR\n" + a + " || " + b + " = " + resultado);
    
        //NOT
        resultado = !b;
        JOptionPane.showMessageDialog(null, "Resultado del operador NOT\n" + " ! " + b + " = " + resultado);

        //XOR
        resultado = a ^ b;
        JOptionPane.showMessageDialog(null, "Resultado del operador XOR\n" + a + " ^ " + b + " = " + resultado);
    
    
    
    
    }
    
}
