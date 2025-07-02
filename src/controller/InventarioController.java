package controller;

import model.ItemInventario;
import service.GerenciadorInventario;

import java.util.List;

public class InventarioController {
    private GerenciadorInventario gerenciador;

    public InventarioController() {
        this.gerenciador = new GerenciadorInventario();
    }

    public void adicionarItem(ItemInventario<?> item) {
        gerenciador.adicionarItem(item);
    }

    public List<String> listarDescricoes() {
        return gerenciador.getItens().stream()
                .map(ItemInventario::gerarDescricaoDetalhada)
                .toList();
    }

    public boolean ativarItem(int indice) {
        return gerenciador.ativarItem(indice);
    }

    public boolean desativarItem(int indice) {
        return gerenciador.desativarItem(indice);
    }

    public double calcularValorTotal(int indice, int quantidade) {
        return gerenciador.calcularValorTotalDoItem(indice, quantidade);
    }

    public ItemInventario<?> getItem(int indice) {
        return gerenciador.getItem(indice);
    }

    public int tamanhoInventario() {
        return gerenciador.tamanho();
    }
}
