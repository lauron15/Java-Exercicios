import java.util.Scanner;

public class EncontrandoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha");
        int password = sc.nextInt();
        while (password != 2002) {
            System.out.println("Acesso Negado");
            System.out.println("Digite uma senha correta");
            password = sc.nextInt(); // por quê tive que repetir isso aqui dentro do while?
        }

        System.out.println("Acesso Permitido!");
        sc.close();
    }

}
