import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de divisões:");
        int numeroN = sc.nextInt();
        for (int i = 0; i < numeroN; i++) {
            System.out.println("Digite o primeiro numero");
            int num1 = sc.nextInt();
            System.out.println("Digite o segundo numero");
            int num2 = sc.nextInt();
            if (num2 == 0) {
                System.out.println("Divisão Impossível");
            } else {
                int divi = num1 / num2;
                System.out.printf("%.1f%n", divi);

            }
        }
        sc.close();
    }
}
