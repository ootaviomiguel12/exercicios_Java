public class Carro {
    public String marca;
    public String modelo;
    public int anodeFabricacao;
    private int chassi;

    Carro(String marca, String modelo, int anodeFabricacao, int chassi) {
        this.marca = marca;
        this.modelo = modelo;
        this.anodeFabricacao = anodeFabricacao;
        this.chassi = chassi;

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

    public void setModelo(String modelo)
    {
    this.modelo = modelo;
    }
}