class CarroRenault extends Carro {
    public CarroRenault(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Renault - Modelo: " + modelo + ", Preço: R$" + preco);
    }
}