import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n1 = 0, n2 = 0, operacao = 0;
        while (true) {
            System.out.println("\n=== Calculadora ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("5 - Alterar valores");
            System.out.println("6 - Sair");
            System.out.println("Escolha a operação");
            operacao = in.nextInt();
            if (operacao == 6) {
                System.out.println("Saindo...");
                break;
            }

            if (operacao == 5) {
                System.out.print("Informe o valor de n1:");
                n1 = in.nextInt();
                System.out.print("Informe o valor de n2:");
                n2 = in.nextInt();

            }

            if (operacao >= 1 && operacao <= 4) {
                System.out.print("Informe o valor de n1: ");
                 n1 = in.nextInt();
                System.out.print("Informe o valor de n2:");
                 n2 = in.nextInt();

                if (operacao == 3 && n2 == 0) {
                    System.out.println("Erro: Não é possível fazer uma divisão por 0!");
                    continue;
                }
                double resultado = calcular(n1, n2, operacao);
                System.out.println("Resultado: " + resultado );

            } else if (operacao!= 5) {
                System.out.println("Operação inválida!");
            } 
            
        }
        in.close();
    }

    public static double calcular(int n1, int n2, int operacao){
         switch (operacao) {
            case 1: return n1 + n2;
            case 2: return n1 - n2;
            case 3: return (double) n1 / n2;
            case 4: return n1 * n2;
            default: return 0;
            
    }
  }
}
