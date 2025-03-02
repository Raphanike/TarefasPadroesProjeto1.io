// CarroVolkswagen.java - Implementação de Carro para Volkswagen
class CarroVolkswagen extends Carro {
    public CarroVolkswagen(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Volkswagen - Modelo: " + modelo + ", Preço: R$" + preco);
    }
}