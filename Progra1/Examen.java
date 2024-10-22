


public class Examen
{
    /**
     * Dado un texto indicar si contiene algun caracter numerico.
     */
    public static boolean hayChar(String txt, char c)
    {
        return txt.indexOf(c)>=0;
    }

    public static boolean existeNumero(String txt)
    {        
        return (hayChar(txt,'0') || hayChar(txt,'1') || hayChar(txt,'2'));
    }
    
    /**
     * Dado dos numeros enteros positivos, indique si la cantidad de digitos del primero es igual al valor del segundo numero.
     */
    public static int cantDig(int n)
    {
        int res=0;
        while(n>0)
        {
            res++;
            n/=10;
        }
        return res;
    }
    
    public static boolean respExamne2(int n1, int n2)
    {
        return cantDig(n1) == n2;
    }
}
