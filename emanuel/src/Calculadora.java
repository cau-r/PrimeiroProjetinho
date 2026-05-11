import java.lang.classfile.instruction.SwitchCase;

import br.com.ucsal.primeiroProjetinho.entidades.Divisao;
import br.com.ucsal.primeiroProjetinho.entidades.Menu;
import br.com.ucsal.primeiroProjetinho.entidades.Multiplicacao;
import br.com.ucsal.primeiroProjetinho.entidades.Soma;
import br.com.ucsal.primeiroProjetinho.entidades.Subtracao;
import br.com.ucsal.primeiroProjetinho.util.EntradaUtil;

public class Calculadora {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Menu menu = new Menu();
        EntradaUtil sc = new EntradaUtil();
        
        int operacao = 0;
        do {
            menu.exibirMenu();
            operacao = sc.nextInt();
            switch (operacao) {
                case 1:
                    soma.calculo();
                    break;
                case 2: 
                    subtracao.calculo();
                    break;
                case 3:
                    divisao.calculo();
                    break;
                case 4:
                    multiplicacao.calculo();
                    break;
                case 5:

                    break;

                case 6: 

            
                default:
                    break;
            }
        } while (false);
    }
}
