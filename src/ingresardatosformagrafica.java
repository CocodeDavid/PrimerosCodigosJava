import javax.swing.JOptionPane;

public class ingresardatosformagrafica
{
    public static void main(String[] args) 
    {
        String nombre;
        System.out.println("Ingreso de datos");

        nombre = JOptionPane.showInputDialog(null, "Hola ingrese datos prueba");
        String edad2 = JOptionPane.showInputDialog(null, nombre + " Escriba su edad");
        //JOptionPane siempre devuelve un String o un null
        //nunca otro tipo de datos
        JOptionPane.showMessageDialog(null, "Su nombre es: \t" + nombre + "\nSu edad es " + edad2);
    }
}