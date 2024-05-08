import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de casos");
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            System.out.println("Digite o primeiro valor");
            double valor1 = sc.nextDouble();
            System.out.println("Digite o segundo valor");
            double valor2 = sc.nextDouble();
            System.out.println("Digite o terceiro valor");
            double valor3 = sc.nextDouble();

            double media = (valor1 * 2) + (valor2 * 3) + (valor3 * 5) / (valor1 + valor2 + valor3);
            System.out.printf("A sua média é: 3%.1f%n", media);

        }

        sc.close();

    }
}
