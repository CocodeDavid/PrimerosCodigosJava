import javax.swing.JOptionPane;

public class Metodos_de_String 
{
    public static void main(String[] args) {
        String palabra1 =JOptionPane.showInputDialog("Escriba la primera palabra");
        String palabra2= JOptionPane.showInputDialog("Escriba la palabra 2");

        //metodo equals

        if(palabra1.equals(palabra2)) 
        //no se puede hacer palabra1 == palabra 2 como en c++
        //porque el == solo funciona para variables primitivas
        {
            JOptionPane.showMessageDialog(null, palabra1 + "Es igual a " + palabra2);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, palabra1 + "Es diferente a " + palabra2);
        }

        //metodo equals ignorando mayusculas
        if(palabra1.equalsIgnoreCase(palabra2))
        {
            JOptionPane.showMessageDialog(null, palabra1 +"Es igual a "+ palabra2 + " Sin tomar en cuenta las mayusculas");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, palabra1 +"Es difente a "+ palabra2 + " Sin tomar en cuenta las mayusculas");

        }

        //metodo compareTo()
        //Este metodo es complejo en su funcion pero simplificando devuelve un valor entero que 
        //nos indica que palabra esta primera en el diccionario
        //Si es 0 ambas palabras son iguales
        //Si es negativo la primera palabra se encuntra primero en el diccionario que la otra palabra
        //Si es positivo la primera palabra se encuntra despues en el diccionario que la otra palabra
        //Este metodo al usar tabla UNICODE es sensible a MAYUSCULAS

        if(palabra1.compareTo(palabra2)==0)
        {
            JOptionPane.showMessageDialog(null, palabra1 + "Se encuntra en el mismo lugar del diccionario que " + palabra2 + " Es decir que son iguales");
        }
        else if(palabra1.compareTo(palabra2) >0)
        {
            JOptionPane.showMessageDialog(null, palabra1 + "Se encuntra despues en el diccionario que " + palabra2 );

        }
        else 
        {
            JOptionPane.showMessageDialog(null, palabra1 + "Se encuntra antes en el diccionario que " + palabra2 );
            
        }
        //Si hay una palabra que contiene a otra (ej: arbol y arboleda)
        //en este caso el desempate se hace restando las longitudes de la cadenas
        //donde la de menor tamaño ira de primeras en el diccinario


        //Metodo compareTo Ignorando Mayusculas
        if(palabra1.compareToIgnoreCase(palabra2)==0)
        {
            JOptionPane.showMessageDialog(null, palabra1 + "Se encuntra en el mismo lugar del diccionario que " + palabra2 + " Es decir que son iguales" + " Sin tomar en cuenta las mayusculas");
        }
        else if(palabra1.compareToIgnoreCase(palabra2) >0)
        {
            JOptionPane.showMessageDialog(null, palabra1 + "Se encuntra despues en el diccionario que " + palabra2 + " Sin tomar en cuenta las mayusculas");

        }
        else 
        {
            JOptionPane.showMessageDialog(null, palabra1 + "Se encuntra antes en el diccionario que " + palabra2 + " Sin tomar en cuenta las mayusculas" );
            
        }
        
        //Metodo CharAt()
        char caracter1 = palabra1.charAt(0);
        char caracter2 = palabra2.charAt(1);
        JOptionPane.showMessageDialog(null, "El primer caracter de la palabra " + palabra1 + " es " + caracter1);
        JOptionPane.showMessageDialog(null, "El segundo caracter de la palabra " + palabra2 + " es " + caracter2);

        //Metodo length
        var tamano = palabra1.length();
        JOptionPane.showMessageDialog(null, "La palabra " + palabra1 + " tiene un tamaño de " + tamano + " caracteres ");

        //Metodo substring
        //este metodo nos devuelve una subcadena de una cadena aun mas grande 
        String subcadena1 = palabra1.substring(2);
        String subcadena2 = palabra1.substring(2, 4);
        // tiene uno o dos parametros
        //el primero indica desde donde toma caracteres Incluyendo la posicion indicada
        //el segundo indica hasta donde toma caracteres Exluyendo la posicion indicada
        //si solo tiene un parametro empieza a tomar la cadena desde la posicion indicada hasta el fina de la cadena

        JOptionPane.showMessageDialog(null, "Una subcadena de la palabra " + palabra1 + " es " + subcadena1);
        JOptionPane.showMessageDialog(null, "Una subcadena de la palabra " + palabra2 + " es " + subcadena2);


        //Metodo IndexOf
        //Este metodo devuelve un entero de la posicion donde se encuntre la primera coincidencia 
        //que se le pasa como parametro
        //funciona para cadenas(String) como para caracteres solos (Char)
        //tiene uno o dos parametro o tres en caso de estar en Java 21 o superiores
        //el primer parametro indica la cosa a buscar
        int pos= palabra1.indexOf('a');
        int pos2= palabra1.indexOf("ho");
        if(pos != -1 && pos2!= -1)
        {
            JOptionPane.showMessageDialog(null, "Se encontro la primera coincidencia del caracter 'a' en la palabra " + palabra1 + " en la posicion " + pos);
            JOptionPane.showMessageDialog(null, "Se encontro la primera coincidencia de la cadena 'ho' en la palabra " + palabra2 + " en la posicion " + pos2);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "En alguna palabra no hubo coincidencia");
        }
        //el segundo indica desde que posicion empiece a buscar Incluyendola
        pos = palabra1.indexOf('a', 2);
        pos2 = palabra2.indexOf("ho", 4);
        JOptionPane.showMessageDialog(null, "Parametro 2 de indexOf\nPos = " + pos + "\nPos2" + pos2);

        //el tercer parametro es exclusivo de java 21 y superiores
        //indica hasat que posicion se debe buscar Excluyendola
        pos = palabra1.indexOf('a', 2,4);
        pos2 = palabra2.indexOf("ho", 4, 5);
        JOptionPane.showMessageDialog(null, "Parametro 3 de indexOf\nPos = " + pos + "\nPos2" + pos2);

        //como ultimo agregar que este metodo lee de izquierda a derecha de querer hacer lo contrario esta el metodo .lastIndexOf();
        
        //Metodos toUpperCase y toLowerCase
        String palabramayuscula = palabra1.toUpperCase();
        String palabraminuscula = palabra2.toLowerCase();
        JOptionPane.showMessageDialog(null, "La palabra " + palabra1 + " en mayusculas es " + palabramayuscula +"\nLa palabra " + palabra2 + " en minusculas es " + palabraminuscula);
        
    }   
}
