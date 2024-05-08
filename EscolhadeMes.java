import java.util.Scanner;;

public class EscolhadeMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) { // Diferença entre while e for: Ambos são estruturas de repetição, mas o While
                                       // precissa validar uma condição no seu início para rodar o código. Já o for,
                                       // ele roda sem validar nada, sendo que a validação é feita dentro dele por ifs
                                       // e elses.
            int mes = sc.nextInt();
            switch (mes) {
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Feverreiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("junho");
                    break;
                case 7:
                    System.out.println("julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;
                default:
                    System.out.println("Mês inválido");
                    break;
            }
        }

        sc.close();
    }
}

// esse número no case, já é uma "condição", pelo que parece
// pelo que eu entendi as condições no switch são mais simples.
// parece que ele não atende condições mais complexas
// Olá, Cledson, tudo certo?
// É melhor utilizar o switch quando você já conhece os valores que podem ser
// passados e são vários, assim facilita a sua programação.
// O if / else é utilizado quando você tem uma comparação mesmo a ser feita,
// entende? Seja pra saber se um valor é igual a outro ou se a variável tem
// algum valor definido, beleza?
