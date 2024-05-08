import java.util.Scanner;

public class ImpostodeRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu salário Bruto por gentileza.");
        double salario = sc.nextDouble();
        double impostodeRenda;
        if (salario <= 2000.00) {
            impostodeRenda = 0;
            System.out.println("Isento de impostos");
        } else if (salario > 2000 && salario <= 3000.00) {
            impostodeRenda = (8 * salario) / 100;
            System.out.printf("Imposto: R$ %.2f%n", impostodeRenda);
        } else if (salario > 3000 && salario <= 4500) {
            impostodeRenda = (18 * salario) / 100;
            System.out.printf("Imposto: R$ %.2f%n", impostodeRenda);
        } else if (salario > 4500) {
            impostodeRenda = (28 * salario) / 100;
            System.out.printf("Imposto: R$ %.2f%n", impostodeRenda);

        }
        sc.close();
    }
}
