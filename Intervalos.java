import java.util.Scanner;

public class Intervalos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        double valor = sc.nextDouble();
        System.out.println("Digite o segundo valor");
        double valor2 = sc.nextDouble();
        if (valor > 0 && valor2 <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor2 <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (valor >= 50 && valor2 <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (valor >= 75 && valor2 <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("O valor não está em nenhum dos intervalos");
        }
        sc.close();
    }
}