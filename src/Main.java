import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidad = input.nextInt();
        System.out.printf("ingrese %d\n",cantidad);
        for (int i = 1; i <= cantidad; i++) {
            System.out.printf("datos %d\n ",i);
        }
    }
}