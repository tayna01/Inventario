package model;

import enums.Categoria;

public class ItemEletronico extends ItemInventario<String>{
    private String tipoMaterial;
    private int quantidadeNoPacote;

    public ItemEletronico(String nome, double valorUnitario, boolean ativo, Categoria categoria, String identificador){
        super(nome, valorUnitario, ativo, categoria, identificador);
        this.tipoMaterial = tipoMaterial;
        this.quantidadeNoPacote = quantidadeNoPacote;
    }
}
