import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre completo: ");
        String nombre = teclado.nextLine();
        String iniciales = ClaseCadena.devuelveIniciales(nombre);
        System.out.println(iniciales);
    }
}