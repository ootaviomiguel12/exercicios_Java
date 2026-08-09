import java.util.Arrays;

public  class Main { //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//Array de inteiros
//public static void main() {
//    int [] valores = {10, 20, 23, 90};
//    Arrays.sort(valores);
//    System.out.println(Arrays.toString(valores));
//    System.out.println(valores.length);
//    }
//}


    //array de Strings
    public static void main() {
    String [] carros = {"BMW", "Toyota", "Honda"};
        System.out.println(carros [0]);
    }
}

    //Array de Strings Multidimensional
    public static void main() {
        String[][] carros = {{"BMW", "Toyota"}, {"Honda", "Tesla"}};
        System.out.println(Arrays.deepToString(carros));
    }

    //constantes
    public static void main() {
    final double taxaJuros = 11.92;
        System.out.println(taxaJuros);
    }


    //casting
public static void main() {
    String valorProduto = "10";
    int valorTotal = Integer.parseInt(valorProduto) + 2;