// FabricaVolkswagen.java - Fábrica concreta para Volkswagen
class FabricaVolkswagen extends FabricaCarro {
    @Override
    public Carro criarCarro(String modelo, double preco) {
        return new CarroVolkswagen(modelo, preco);
    }
}