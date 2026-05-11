package br.com.ucsal.primeiroProjetinho.entidades;
import br.com.ucsal.primeiroProjetinho.interfaces.Icalcular;
import br.com.ucsal.primeiroProjetinho.util.EntradaUtil;

public class Soma implements Icalcular {
    EntradaUtil sc = new EntradaUtil();

    @Override
    public void calculo() {
        int soma, n1, n2;
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();
        soma = n1 + n2;
        System.out.println("Resultado: " + soma);
    }

}
