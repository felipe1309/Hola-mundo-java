import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        System.out.println(nombre);
    }
}
