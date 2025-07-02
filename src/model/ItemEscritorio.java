package model;

import enums.Categoria;

public class ItemEscritorio extends ItemInventario<String> {
    private String tipoMaterial;
    private int quantidadeNoPacote;

    public ItemEscritorio(String nome, double valorUnitario, boolean ativo, Categoria categoria, String identificador,
                          String tipoMaterial, int quantidadeNoPacote) {
        super(nome, valorUnitario, ativo, categoria, identificador);
        this.tipoMaterial = tipoMaterial;
        this.quantidadeNoPacote = quantidadeNoPacote;
    }

    @Override
    public double calcularValorTotal(int quantidade) {
        return getValorUnitario() * quantidade;
    }

    @Override
    public String gerarDescricaoDetalhada() {
        return "Item de Escritório: " + getNome() +
                ", Tipo de Material: " + tipoMaterial +
                ", Quantidade no Pacote: " + quantidadeNoPacote +
                ", Valor Unitário: R$" + getValorUnitario();
    }

    // Getters e Setters
    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public int getQuantidadeNoPacote() {
        return quantidadeNoPacote;
    }

    public void setQuantidadeNoPacote(int quantidadeNoPacote) {
        this.quantidadeNoPacote = quantidadeNoPacote;
    }
}
