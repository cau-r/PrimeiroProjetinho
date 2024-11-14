import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n1, n2, operacao = 0;

        System.out.println("informe o valor de n1");
        n1 = in.nextInt();
        System.out.println("informe o valor de n2");
        n2 = in.nextInt();
        while (operacao != 6) {
            System.out.println("informe a operacao");
            operacao = in.nextInt();

            if (operacao == 1) {
                soma(n1, n2);

            } else if (operacao == 2) {
                subtracao(n1, n2);

            } else if (operacao == 3) {
                divisao(n1, n2);

            } else if (operacao == 4) {
                multiplicacao(n1, n2);

            } else if (operacao == 5) {
                System.out.println("informe o valor de n1");
                n1 = in.nextInt();
                System.out.println("informe o valor de n2");
                n2 = in.nextInt();
            }

        }
    }

    public static void soma(int n1, int n2) {
        int soma = n1 + n2;
        System.out.println("resultado: " + soma);

    }

    public static void subtracao(int n1, int n2) {
        int subtracao = n1 - n2;
        System.out.println("resultado: " + subtracao);

    }

    public static void divisao(double n1, double n2) {
        double divisao = n1 / n2;
        System.out.println("resultado: " + divisao);

    }

    public static void multiplicacao(int n1, int n2) {
        int multiplicacao = n1 * n2;
        System.out.println("resultado: " + multiplicacao);

    }


}