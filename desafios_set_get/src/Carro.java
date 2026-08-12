public class Carro {
    private String marca;
    private String modelo;
    private int anodeFabricacao;
    private double valordeVenda;

    Carro(String marca, String modelo, int anodeFabricacao, double valordeVenda) {
        this.marca = marca;
        this.modelo = modelo;
        this.anodeFabricacao = anodeFabricacao;
        this.valordeVenda = valordeVenda;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno()
    {
        return anodeFabricacao;
    }
    public double getValordeVenda()
    {
        return valordeVenda;
    }

    public void setAumento(double valordeVenda)
    {
        this.valordeVenda = valordeVenda;
    }
}
