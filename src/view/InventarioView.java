package view;

import controller.InventarioController;
import enums.Categoria;
import model.ItemAdministrativo;
import model.ItemEletronico;
import model.ItemEscritorio;

import java.util.Scanner;

public class InventarioView {
    private InventarioController controller;
    private Scanner scanner;

    public InventarioView(InventarioController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== Sistema de Inventário ===");
            System.out.println("1. Cadastrar Item Eletrônico");
            System.out.println("2. Cadastrar Item Escritório");
            System.out.println("3. Cadastrar Item Administrativo");
            System.out.println("4. Listar Itens");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir \n

            switch (opcao) {
                case 1:
                    cadastrarItemEletronico();
                    break;
                case 2:
                    cadastrarItemEscritorio();
                    break;
                case 3:
                    cadastrarItemAdministrativo();
                    break;
                case 4:
                    listarItens();
                    break;
                case 5:
                    executando = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    private void cadastrarItemEletronico() {
        System.out.println("\nCadastro de Item Eletrônico");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Valor Unitário: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ativo? (true/false): ");
        boolean ativo = scanner.nextBoolean();
        scanner.nextLine();
        Categoria categoria = Categoria.ELETRONICO;
        System.out.print("Identificador: ");
        String identificador = scanner.nextLine();
        System.out.print("Voltagem: ");
        String voltagem = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        ItemEletronico item = new ItemEletronico(nome, valor, ativo, categoria, identificador, voltagem, marca);
        controller.adicionarItem(item);
        System.out.println("Item Eletrônico cadastrado com sucesso!");
    }

    private void cadastrarItemEscritorio() {
        System.out.println("\nCadastro de Item Escritório");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Valor Unitário: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ativo? (true/false): ");
        boolean ativo = scanner.nextBoolean();
        scanner.nextLine();
        Categoria categoria = Categoria.ESCRITORIO;
        System.out.print("Identificador: ");
        String identificador = scanner.nextLine();
        System.out.print("Tipo de Material: ");
        String tipoMaterial = scanner.nextLine();
        System.out.print("Quantidade no Pacote: ");
        int quantidadeNoPacote = scanner.nextInt();
        scanner.nextLine();

        ItemEscritorio item = new ItemEscritorio(nome, valor, ativo, categoria, identificador, tipoMaterial, quantidadeNoPacote);
        controller.adicionarItem(item);
        System.out.println("Item Escritório cadastrado com sucesso!");
    }

    private void cadastrarItemAdministrativo() {
        System.out.println("\nCadastro de Item Administrativo");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Valor Unitário: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ativo? (true/false): ");
        boolean ativo = scanner.nextBoolean();
        scanner.nextLine();
        Categoria categoria = Categoria.ADMINISTRATIVO;
        System.out.print("Identificador: ");
        String identificador = scanner.nextLine();
        System.out.print("Setor Responsável: ");
        String setor = scanner.nextLine();
        System.out.print("Nome do Responsável: ");
        String responsavel = scanner.nextLine();

        ItemAdministrativo item = new ItemAdministrativo(nome, valor, ativo, categoria, identificador, setor, responsavel);
        controller.adicionarItem(item);
        System.out.println("Item Administrativo cadastrado com sucesso!");
    }

    private void listarItens() {
        System.out.println("\n=== Lista de Itens no Inventário ===");
        for (String descricao : controller.listarDescricoes()) {
            System.out.println(descricao);
        }
    }
}
