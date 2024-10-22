
public class Examen2
{
    public static char[] letras= {'x','X','6','.','@'}; 
    public static String[] pal={"Lunes","enero"};
    public static double[] num=new double[200];
    /**
     * Dado un texto indicar si contiene algun caracter numerico.
     */
    public static boolean hayChar(String txt, char c)
    {
        return txt.indexOf(c)>=0;
    }

    public static boolean existeNumero(String txt)
    {       
        boolean res= false;
        for(int p=0; p<letras.length;p++)
        {
            if(hayChar(txt,letras[p]))
            {
                res = true;
            }
        }
        return res;
    }
    
}
