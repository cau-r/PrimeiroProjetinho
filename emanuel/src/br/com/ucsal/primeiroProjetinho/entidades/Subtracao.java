package br.com.ucsal.primeiroProjetinho.entidades;
import br.com.ucsal.primeiroProjetinho.interfaces.Icalcular;
import br.com.ucsal.primeiroProjetinho.util.EntradaUtil;

public class Subtracao implements Icalcular {
    EntradaUtil sc = new EntradaUtil();

    @Override
    public void calculo() {
        int subtracao, n1, n2;
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();
        subtracao = n1 - n2;
        System.out.println("Resultado: " + subtracao);
    }

}
