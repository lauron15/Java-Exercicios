import java.util.Scanner;

public class SaoMultiplicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dois numeros");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
        sc.close();
    }
}
