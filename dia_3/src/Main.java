import java.text.NumberFormat;

public class Main {
    public static void main (String[] args) {
        NumberFormat real = NumberFormat.getCurrencyInstance();
        String productValue = real.format(120.90);
        System.out.println(productValue);
    }
}
