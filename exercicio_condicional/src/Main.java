import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um numero: ");

    String textoDigitado = entrada.next();

    int quantidadedeAlgarismos = textoDigitado.length();

    if (quantidadedeAlgarismos == 1)
        System.out.println("Esse numero tem um algarismo");

    else if (quantidadedeAlgarismos >= 2 && quantidadedeAlgarismos<= 4)
        System.out.println("Esse numero tem " + quantidadedeAlgarismos + " algarismos");

    else
        System.out.println("Esse numero tem 5 ou mais algarismos");
    }

}
