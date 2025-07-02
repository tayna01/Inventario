package service;

import model.ItemInventario;

import java.util.LinkedList;
import java.util.List;

public class GerenciadorInventario {

    private LinkedList<ItemInventario<?>> itens;

    public GerenciadorInventario(){
        this.itens = new LinkedList<>();
    }

    public void adicionarItem(ItemInventario<?> item){
        itens.add(item);
    }

    public void listarItens(){
        if(itens.isEmpty()){
            System.out.println("Inventário vazio.");
        } else{
             for(ItemInventario<?> item : itens){
                 System.out.println(item.gerarDescricaoDetalhada());
             }
        }
    }

    public boolean ativarItem(int indice){
        if(indice >= 0 && indice < itens.size()){
            itens.get(indice).ativar();
            return true;
        }
        return false;
    }

    public boolean desativarItem(int indice) {
        if (indice >= 0 && indice < itens.size()) {
            itens.get(indice).desativar();
            return true;
        }
        return false;
    }

    public double calcularValorTotalDoItem(int indice, int quantidade) {
        if (indice >= 0 && indice < itens.size()) {
            return itens.get(indice).calcularValorTotal(quantidade);
        }
        return 0.0;
    }

    public ItemInventario<?> getItem(int indice) {
        if (indice >= 0 && indice < itens.size()) {
            return itens.get(indice);
        }
        return null;
    }

    public int tamanho() {
        return itens.size();
    }

    public List<ItemInventario<?>> getItens() {
        return itens;
    }
}
