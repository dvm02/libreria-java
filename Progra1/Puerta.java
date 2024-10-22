
public class Puerta
{
    /**
     * VerificarX: Función que verifica si el primer caracter de un texto es una letra X
     * 
     * @param txt type String: txt es el texto ingresado a verificar.
     * @param x type char: x es el caracter a verificar si es igual al primer caracter del txt.
     * 
     * @return res type boolean: true si la letra es igual / false si no es igual.
     */
    public static boolean verificarX(String txt, char x)
    {
        boolean res=false;
        if(txt.charAt(0) == x){
            res = true;
        }

        return res;
    }

    /**
     * Puerta automatica: Programa que permite indicar si se abre una puerta bajo la condición
     *      de ser mayor de edad, que sea del genero femenino y que no inicie su nombre con la letra M.
     *      
     * @param nom type String: Nombre de la persona.
     * @param ed type int: Edad registrada.
     * @param gen type char: El genero de la persona (F= Femenino / M= Masculino).
     * 
     * @return res type boolean:  true= Se abre la puerta / false= No cumple la condición.
     */
    public static boolean verificarDatos(String nom, int ed, char gen)
    {
        return ( ( verificarX(nom, 'M') || verificarX(nom, 'm') ) &&   ed >= 18   &&  ( gen == 'F' || gen == 'f' ) );
    }
}
