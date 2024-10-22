import java.util.Scanner;
public class ArreglosEstaticos
{
    Scanner sc= new Scanner(System.in);
    int fil,col;
    int[][] n;

    private void createM()
    {
        System.out.println("Ingrese cantidad de files y columnas: ");
        fil= sc.nextInt();
        col= sc.nextInt();
        n= new int[fil][col];
    }

    private void registerM()
    {
        for(int f=0; f<fil;f++)
        {
            for(int c=0; c<col; c++)
            {
                System.out.println("Ingrese valor para fila "+f+" y columna "+c+": ");
                n[f][c]= sc.nextInt();
            }
        }
    }

    private void updateM()
    {
        int f,c,d;
        System.out.println("Ingrese fila: ");
        f= sc.nextInt();
        System.out.println("Ingrese columna: ");
        c= sc.nextInt();
        System.out.println("Ingrese el nuevo dato: ");
        d= sc.nextInt();

        n[f][c]= d;
    }

    private void deleteM()
    {
        int f,c;
        System.out.println("Ingrese fila: ");
        f= sc.nextInt();
        System.out.println("Ingrese columna: ");
        c= sc.nextInt();

        n[f][c]= 0;
    }

    private void selectAllM()
    {
        for(int f=0; f<fil;f++)
        {
            for(int c=0; c<col; c++)
            {
                System.out.print(n[f][c] +"\t");
            }
            System.out.print("\n");
        }
    }

    private void selectM()
    {
        int f,c;
        System.out.println("Ingrese fila: ");
        f= sc.nextInt();
        System.out.println("Ingrese columna: ");
        c= sc.nextInt();
        System.out.println( n[f][c] );
    }

    public void main()
    {
        createM();
        registerM();
        selectAllM();
        updateM();
        selectAllM();
    }
}
