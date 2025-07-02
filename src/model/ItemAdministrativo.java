package model;

import enums.Categoria;

public class ItemAdministrativo extends ItemInventario<String>{
    private String setorResponsavel;
    private String nomeResponsavel;

    public ItemEscritorio(String nome, double valorUnitario, boolean ativo, Categoria categoria, String identificador){
        super(nome, valorUnitario, ativo, categoria, identificador);
        this.setorResponsavel = setorResponsavel;
        this.nomeResponsavel = nomeResponsavel;
    }

}
