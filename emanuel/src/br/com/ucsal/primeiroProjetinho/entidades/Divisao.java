package br.com.ucsal.primeiroProjetinho.entidades;
import br.com.ucsal.primeiroProjetinho.interfaces.Icalcular;
import br.com.ucsal.primeiroProjetinho.util.EntradaUtil;


public class Divisao implements Icalcular {
    EntradaUtil sc = new EntradaUtil();

    @Override
    public void calculo() {
        double div, n1, n2;
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();
        if (n2 == 0) { 
            System.out.println("ERRO: O divisor não pode ser igual a 0.");
        }else { 
            div = n1 / n2;
        }

    }

}
