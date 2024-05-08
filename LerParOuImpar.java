import java.util.Scanner;

public class LerParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        double numero = sc.nextDouble();
        if (numero % 2 != 0) {
            System.out.println("Impar");
        } else {
            System.out.println("Par");
        }
        sc.close();
    }
}
