// FabricaRenault.java - Fábrica concreta para Renault
class FabricaRenault extends FabricaCarro {
    @Override
    public Carro criarCarro(String modelo, double preco) {
        return new CarroRenault(modelo, preco);
    }
}