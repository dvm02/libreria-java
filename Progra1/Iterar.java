import java.util.Scanner;

public class Iterar
{
    public static Scanner leer= new Scanner(System.in);
    
     public static int main(int a, int b)
    {
        int cont=0;
        
        for(a = a+1;a < b;a++)
        {
            //proceso que debe repetir
            cont=a%5==0?cont+1:cont;                       
        }
        return cont;
    }
    
    
    /*public static void main()
    {
        int a ,b, cont=0;
        System.out.println("Ingrese primer numero: ");
        a= leer.nextInt();
        System.out.println("Ingrese segundo numero: ");
        b= leer.nextInt();                
        if(a>b)
        {
            System.out.println("El primer numero debe ser menor al segundo");
        }
        
        for(a = a+1;a < b;a++)
        {
            //proceso que debe repetir
            if(a%5==0)
            {
                cont++;
            }
            
        }
        System.out.println(cont);
    }
    
    
    
    
    
    
    /*public static void main()
    {
        int numero, numero2, a ,b;
        System.out.println("Ingrese primer numero: ");
        numero= leer.nextInt();
        System.out.println("Ingrese segundo numero: ");
        numero2= leer.nextInt();
        a= numero + 1;
        b= numero2 -1;
        
        if(a>b)
        {
            System.out.println("El primer numero debe ser menor al segundo");
        }
        
        for(int control=a;control <= b;control++)
        {
            //proceso que debe repetir
            if(a%5==0)
            {
                System.out.println(a);
            }
            a++;
        }
    }*/
}
