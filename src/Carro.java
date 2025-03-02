abstract class Carro {
    protected String modelo;
    protected double preco;

    public abstract void exibirDetalhes();

    // Getters
    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }
}
