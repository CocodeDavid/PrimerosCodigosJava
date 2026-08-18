
import javax.swing.JOptionPane;

public class Switch_Case 
{
    public static void main(String [] args)
    {
        String apoyo = JOptionPane.showInputDialog("Escriba un numero");
        var dia= Integer.parseInt(apoyo);
        //Sintaxis antigua para switch case
        switch (dia)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "Es lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Es martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Es miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Es jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Es viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Es sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Es domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Numero Invalido");
                break;
        }   

        //Sintaxis Moderna de switch case
        String decision = JOptionPane.showInputDialog("Escribe 'si' o 'no'");
        switch (decision)
        {
            case "si" -> JOptionPane.showMessageDialog(null, "Elegiste " + decision);
            case "no" -> JOptionPane.showMessageDialog(null, "Elegiste " + decision);
            default -> JOptionPane.showMessageDialog(null, "Escribiste mal, escribiste: " + decision);
        }

        //Switch case para asignar valores a una variable con sintaxis moderna
        apoyo = JOptionPane.showInputDialog("Seleccione una opcion\n1.Tortuga\n2.Serpiente\n3.Halcon\n4.Perro\n5.Gato");
        var seleccion = Integer.parseInt(apoyo);
        String animal = switch (seleccion){
            case 1 -> "Tortuga lenta";
            case 2 -> "Serpiente Venenosa";
            case 3 -> "Halcon Veloz";
            case 4 -> "Perro bravo";
            case 5 -> "Gato araña";
            default ->  {
                            JOptionPane.showMessageDialog(null, "El numero escrito no esta dentro de la seleccion");
                            yield "Ese animal no existe"; // yield funciona como el return para los switch 
                        } 
        };
        //una vez ejecuta yield cual return saldra del switch para proseguir con el programa
        //Switch case para asignar valores 
        apoyo = JOptionPane.showInputDialog("Seleccione una opcion\n1.Sandia\n2.Lechuga\n3.Manzana\n4.Pera\n5.Cereza");
        seleccion = Integer.parseInt(apoyo);
        String fruta = switch (seleccion){
            case 1:
                yield "Sandia";
            case 2:
                yield "Lechuga";
            case 3:
                yield "Manzana";
            case 4:
                yield "Pera";
            case 5:
                yield "Cereza";
            default:
            {
                JOptionPane.showMessageDialog(null, "El numero escrito no esta dentro de la seleccion");
                yield "Fruta no disponible";
            }
        };
        JOptionPane.showMessageDialog(null, "Tu animal " + animal + " ha comido una " + fruta);

    }
}
