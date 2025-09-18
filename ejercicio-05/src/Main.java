import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        Scanner myObj = new Scanner(System.in);

        System.out.println( "Dime dos numeros:");
        int numero1 = myObj.nextInt();
        int numero2 = myObj.nextInt();

        System.out.println( "Elige una opcion: ");
        System.out.println( "1. SUMAR");
        System.out.println( "2. RESTAR");
        System.out.println( "3. MULTIPLICAR");
        System.out.println( "4. DIVIDIR");

        int opcion = myObj.nextInt();

        switch (opcion){

            case 1 :
                resultado = numero1 + numero2;
                break;
            case 2 :
                resultado = numero1 - numero2;
                break;

            case 3:
                resultado = numero1 * numero2;
                break;

            case 4:
                resultado = numero1 / numero2;
                break;

        }


        System.out.println( resultado );

























    }
}