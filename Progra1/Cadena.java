
public class Cadena
{
    /**
     * Funcion que indicasi dos textos son iguales semanticamente
     */
    public static boolean sonIguales(String texto1, String texto2)
    {
        return texto1.equalsIgnoreCase(texto2);        
    }
    
    /**
     * Funcion que indica si un caracter existe en una cadena de texto
     */
    public static boolean existeCaracter(String texto, char caracter)
    {
        boolean res= false;
        int i;
        i= texto.indexOf(caracter);
        if(i != -1)
        {
            res= true;
        }
        return res;
    }
    
    /**
     * Funcion que indica cuantas letras tiene un texto
     */
    public static int contarLetras(String texto)
    {
        
        return texto.length();
        
    }

    /**
     * Funcion que indica si un texto tiene vocales
     */
    public static boolean hayVocal(String texto)
    {
        boolean res=false;
        if(existeCaracter(texto,'a') || )
        {
            res= true;
        }
        return res;
    }
    
}
