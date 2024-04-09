//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int edad = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Se esperaba un número entero.");
        }
    }
}