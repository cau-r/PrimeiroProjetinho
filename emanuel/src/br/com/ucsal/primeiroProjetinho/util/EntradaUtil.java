package br.com.ucsal.primeiroProjetinho.util;
import java.util.Scanner;

public class EntradaUtil {

    private static final Scanner in = new Scanner(System.in);

    public EntradaUtil(){}

    public static String lerLinha(){
        return in.nextLine();
        
    }

    public int nextInt() {
        return in.nextInt();
    }

    public double nextDouble() {
        return in.nextDouble();
    }

    public float nextFloat() {
        return in.nextFloat();
    }

    public boolean nextBoolean() {
        return in.nextBoolean();
    }
}
