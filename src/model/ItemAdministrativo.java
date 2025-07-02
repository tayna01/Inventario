package model;

import enums.Categoria;

public class ItemAdministrativo extends ItemInventario<String> {
    private String setorResponsavel;
    private String nomeResponsavel;

    public ItemAdministrativo(String nome, double valorUnitario, boolean ativo, Categoria categoria, String identificador,
                              String setorResponsavel, String nomeResponsavel) {
        super(nome, valorUnitario, ativo, categoria, identificador);
        this.setorResponsavel = setorResponsavel;
        this.nomeResponsavel = nomeResponsavel;
    }

    @Override
    public double calcularValorTotal(int quantidade) {
        return getValorUnitario() * quantidade;
    }

    @Override
    public String gerarDescricaoDetalhada() {
        return "Item Administrativo: " + getNome() +
                ", Setor Responsável: " + setorResponsavel +
                ", Nome do Responsável: " + nomeResponsavel +
                ", Valor Unitário: R$" + getValorUnitario();
    }

    // Getters e Setters
    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }
}
