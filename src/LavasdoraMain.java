
import java.util.Scanner;

public class LavasdoraMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------Bienvenido al lavarropas---------------");
        System.out.print("Por favor, ingrese el peso de la carga (en libras): ");
        int peso = scanner.nextInt();

        Lavadora lavarropas = new Lavadora();
        lavarropas.lavarRopa(peso);

        scanner.close();
    }
}


