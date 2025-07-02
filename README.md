# Sistema de Inventário

Aplicação Java utilizando Programação Orientada a Objetos, Generics e arquitetura MVC para gerenciamento de inventário de itens de uma empresa de tecnologia.

## Objetivo

- Aplicar conceitos de POO: encapsulamento, herança, polimorfismo, classes abstratas, enums e generics.
- Organizar a estrutura da aplicação com o padrão MVC (Model-View-Controller).

## Sobre o MVC

**Model:** lógica de dados e regras de negócio.  
**View:** interface com o usuário via console.  
**Controller:** coordena a comunicação entre Model e View.

## Estrutura do Projeto

```
src/
├── app/ → Main.java
├── controller/ → InventarioController.java
├── enums/ → Categoria.java
├── exception/ → ItemInvalidoException.java
├── model/ → ItemInventario e subclasses
├── service/ → GerenciadorInventario.java
└── view/ → InventarioView.java
```


## Requisitos Técnicos

- `ItemInventario<T>` (classe abstrata genérica)
    - Atributos: nome, valorUnitario, ativo, identificador (T), categoria (enum)
    - Métodos abstratos: `calcularValorTotal`, `gerarDescricaoDetalhada`
    - Métodos concretos: `ativar`, `desativar`, `isAtivo`, getters/setters

- Subclasses:
    - `ItemEletronico`: voltagem, marca
    - `ItemEscritorio`: tipo de material, quantidade no pacote
    - `ItemAdministrativo`: setor e responsável

- Enum `Categoria`: ELETRONICO, ESCRITORIO, ADMINISTRATIVO

- `GerenciadorInventario`: gerencia itens, ativa/desativa, calcula valores e gera descrições

- `InventarioController`: recebe comandos da view e interage com o service

- `InventarioView`: interface textual, coleta dados e apresenta relatórios

- `Main`: inicia a aplicação

## Casos de Teste

- Criar itens com tipos genéricos distintos (String, Integer, etc.)
- Adicionar e ativar itens
- Calcular valores com diferentes quantidades
- Gerar descrições detalhadas
- Uso funcional do enum `Categoria`

## Autora ✨

Tayná Vicente Silva  
Estudante de Engenharia de Software – IFPR
GitHub: [@tayna01](https://github.com/tayna01)
