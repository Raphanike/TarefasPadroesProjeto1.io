




// Teste.java - Classe para testar a criação de carros
public class Teste {
    public static void main(String[] args) {
        // Criando uma fábrica da Renault
        FabricaCarro fabricaRenault = new FabricaRenault();
        Carro carroRenault = fabricaRenault.criarCarro("Renault Kwid", 49990.00);
        carroRenault.exibirDetalhes();

        // Criando uma fábrica da Volkswagen
        FabricaCarro fabricaVolkswagen = new FabricaVolkswagen();
        Carro carroVolkswagen = fabricaVolkswagen.criarCarro("Volkswagen Gol", 59990.00);
        carroVolkswagen.exibirDetalhes();
    }
}
