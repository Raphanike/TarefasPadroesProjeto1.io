# Projeto de Interfaces e Herança com Java

Este projeto implementa conceitos de interfaces, herança e métodos abstratos em Java, com foco na criação de uma interface `Carro` e na extensão dessa interface para diferentes marcas de carros. O objetivo é aprender sobre a implementação de getters, setters, métodos abstratos e outros conceitos fundamentais da programação orientada a objetos. O projeto também inclui testes unitários utilizando o JUnit para garantir a funcionalidade correta das implementações.

## Funcionalidades

- **Interface `Carro`:** Define os métodos básicos para carros, como getters, setters, e métodos abstratos.
- **Extensão de Marcas:** Marcas de carros como `Fiat`, `Chevrolet`, `Volkswagen`, etc., implementam a interface `Carro` e adicionam comportamentos específicos.
- **Testes Unitários:** Utilização do JUnit para testar as funcionalidades implementadas, garantindo que o código esteja correto e funcione como esperado.

## Estrutura do Projeto

- **src/**: Contém o código fonte do projeto.
  - **interfaces/**: Diretório contendo a interface `Carro`.
  - **marcas/**: Contém as classes que implementam a interface `Carro`, representando diferentes marcas de carros.
  - **test/**: Contém os testes unitários realizados com o JUnit.
  
## Exemplo de Implementação

### Interface `Carro`

```java
public interface Carro {
    String getMarca();
    void setMarca(String marca);
    
    String getModelo();
    void setModelo(String modelo);
    
    void ligar();
    void desligar();
}
