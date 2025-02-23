package input;
import java.util.Scanner;

public class Input {
    public static final Scanner scanner=new Scanner(System.in);

    public static int leerEntero(String mensaje){
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static String leerCadena(String mensaje){
        System.out.print(mensaje);
        return scanner.next();
    }

    public static double leerDouble(String mensaje){
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
}
