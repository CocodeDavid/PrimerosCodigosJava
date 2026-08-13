import javax.swing.JOptionPane;

public class castingdedatos 
{
    public static void main(String[] args) 
    {
        //Algunos casteos
        //String a Int

        String numerotexto = "123";
        int numeroentero = Integer.parseInt(numerotexto);

        System.out.println("Su numero entero es: " + numeroentero);

        //Int a String

        int entero = 456;
        String enterotexto;
        enterotexto = String.valueOf(entero);

        System.out.println("Su numero entero en texto es: " + enterotexto);

        //Double a Int

        double numerodouble = 45.55;
        int numeroint = (int)numerodouble;

        JOptionPane.showMessageDialog(null, "Su numero decimal convertido a entero es: " + numeroint);
        
        //esto no aproxima el valor, solo toma la parte entera ejemplo si el numero es 45.9999, imprimira 45
        
        //int a double
        int enterofinal = 4567;
        double enterodoble;
        enterodoble =(double)enterofinal;

        JOptionPane.showMessageDialog(null, "Su numero entero doble es: " +enterodoble);
        
    }
    
}
