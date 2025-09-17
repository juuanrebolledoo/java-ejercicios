import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner nombre = new Scanner(System.in);
        System.out.println( "Dime tu nombre:");

        String usuario = nombre.nextLine();
        System.out.println( "Bienvenido " + usuario );

    }
}