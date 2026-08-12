public class Main {

public static void main (String[] args) {
    Carro car = new Carro("BMW", "X6", 2026, 125000.0);

    car.setAumento(car.getValordeVenda() * 1.10);
//chassi não pode ser acessado por ser PRIVATE
//        System.out.println(car.chassi); 

    System.out.println(car.getMarca());
    System.out.println(car.getModelo());
    System.out.println(car.getAno());
    System.out.println("Valor de venda: " + car.getValordeVenda());
}

}