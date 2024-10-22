
public class Menu
{
    public static void main()
    {
        int op;
        System.out.println("Menu para datos:");
        System.out.println("1. Recargar.");
        System.out.println("2. Comprar datos");
        System.out.println("3. Salir");

        op= leer.nextInt();

        switch (op)
        {
            case 1:
                System.out.println("Recarga exitosa");
                break;
            case 2:
                System.out.println("Compra de datos exitosa");
                break;
            case 3:
                System.out.println("Adios");
                break;
            default: 
                break;
        }
    }
}
