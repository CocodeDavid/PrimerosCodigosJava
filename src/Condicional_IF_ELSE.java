import javax.swing.JOptionPane;

public class Condicional_IF_ELSE
{
    public static void main(String[] args) 
    {
        int edad;
        String apoyo;
        apoyo = JOptionPane.showInputDialog("Ingrese su edad...");
        edad = Integer.parseInt(apoyo);
        if(edad >18)
        {
            JOptionPane.showMessageDialog(null, "Eres un adulto");
        }
        else if ( edad > 12)
        {
            JOptionPane.showMessageDialog(null, "Eres un adolecente");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Eres un niño");
        }
    }    
}
