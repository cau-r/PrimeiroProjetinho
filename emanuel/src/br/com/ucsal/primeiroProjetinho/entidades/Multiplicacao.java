package br.com.ucsal.primeiroProjetinho.entidades;
import br.com.ucsal.primeiroProjetinho.interfaces.Icalcular;
import br.com.ucsal.primeiroProjetinho.util.EntradaUtil;

public class Multiplicacao implements Icalcular {
    EntradaUtil sc = new EntradaUtil();

    @Override
    public void calculo() {
        double multi, n1, n2;
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();
        multi = n1 * n2;
        System.out.println("Resultado: " + multi);
    }

}
