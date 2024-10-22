
public class Examen3
{
    /**
     * Dado dos numeros enteros positivos, indicar si tienen la misma cantidad de divisores.
     */
    public static int cantDiv(int num)
    {
        int res= 0, div= 1;
        while (div <= num)
        {
            if( num%div == 0 )
            {
                res++;
            }
            div++;
        }
        return res;
    }
    
    public static boolean divIguales(int a, int b)
    {
        return cantDiv(a) == cantDiv(b);
    }
    
    /**
     * dato un texto y un numero entero positivo, verificar si el texto tiene la cantidad de caracteres igual al número,
     */
    public static boolean resp2(String txt, int num)
    {
        return  txt.length() == num;
    }
    
}
