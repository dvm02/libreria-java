import java.util.Scanner;

public class Vectores
{
    public static Scanner leer= new Scanner(System.in);
    public static int tam=0;
    
    public static void pregunta()
    {
        System.out.println("Cuantos registros va ingresar? \n Numero de registros:");
        tam= leer.nextInt();
    }
    
    public static void registroNotas()
    {
        
        String [] nombre= new String[tam];
        double [] n1= new double[tam];
        double [] n2= new double[tam];
        double [] n3= new double[tam];
        double promedio;
        
        //Registrar Alturas
        for(int p=0; p<tam; p++)
        {
            System.out.println("Ingrese numbre: ");
            nombre[p]= leer.next();
            System.out.println("Ingrese nota1: ");
            n1[p]= leer.nextDouble();
            System.out.println("Ingrese nota2: ");
            n2[p]= leer.nextDouble();
            System.out.println("Ingrese nota3: ");
            n3[p]= leer.nextDouble();
        }

        //Mostrar las Alturas
        System.out.println("\nPLANILLA DE NOTAS");
        System.out.println("-------------------------------------");
        System.out.println("\nNOMBRE\t\tNOTA1\tNOTA2\tNOTA3\tFINAL\n");
        
        for(int p=0; p<tam; p++)
        {
            promedio= (n1[p]+n2[p]+n3[p]) / 3 ;
            System.out.println(nombre[p]+"\t\t"+n1[p]+"\t"+n2[p]+"\t"+n3[p]+"\t"+promedio); 
        }
    }
    
    public static void main()
    {
        pregunta();
        registroNotas();
    }
}
