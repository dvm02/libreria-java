

public class Docu
{
    
    /**
     * Función que indica si un numero entero es par
     */
    public static boolean esPar(int numero)
    {
        return (numero%2==0);
    }
    
    /**
     * 
     */
    public static boolean esPar2(int numero)
    {
        boolean res;
        res= numero%2==0?true:false;
        return res;
    }
    
    
    /**
     * Funcion que cuenta los divisores de un numero entero positivo
     * 
     */
    public static int contarDivisores(int num)
    {
        int res=0;
        
        for(int div=1;div<=num;div++)
        {
            if(num%div==0)
            {
                res++;
            }
        }
        
        return res;
    
    }
    
    
    /**
     * Funcion que cuenta los divisores de un numero entero positivo
     * 
     */
    public static int contarDivisores2(int num)
    {
        int res=0, div=1;
        
        while(div<=num)
        {
            if(num%div==0)
            {
                res++;
            }
            div++;
        }        
        return res;
    }
    
    /**
     * Funcion que indica si existe el digito 5 en un numero entero positivo
     */
    public static boolean existe5(int num)
    {
        boolean res= false;
        int dig;
        
        while (num>0)
        {
            dig= num%10;
            if(dig == 5)
            {
                res = true;
                num=0;
            }
            num= num/10;
        }
        
        return res;
    }
    
    
}
