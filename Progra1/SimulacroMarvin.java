

public class SimulacroMarvin
{
    /**
     * existCharPos0: Funcion que verifica si un texto tioene como caracteri inicial un a letra X
     * 
     * @param txt type String: El texto a verificar.
     * @param x type char: El caracter a buscar.
     * 
     * @return res type boolean: True en caso el caracter x sea la primera letra en el txt.
     */
    public static boolean existCharPos0(String txt, char x)
    {
        return txt.charAt(0) == x;
    }
    
    /**
     * abrir puerta: procesos uqe indica si una puerta sera abierta en los siguientes casos:
     *  - Si es mayor de edad.
     *  - Si es del genero es femenino.
     *  - Si no inicia el nombre  con la letra M.
     *  
     *  @param nom type String : Referencia al nombre ingresado.
     */
    public static boolean abrirPuerta(String nom, int ed, String gen)
    {             
        return ( ed >= 18 && gen.equalsIgnoreCase("femenino") &&   ( !existCharPos0(nom,'M') || !existCharPos0(nom,'m') ) );
    }
}
