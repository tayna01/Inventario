package model;

import enums.Categoria;

public class ItemEletronico extends ItemInventario<String>{
    private String voltagem;
    private String marca;

    public ItemAdministrativo(String nome, double valorUnitario, boolean ativo, Categoria categoria, String identificador) {
        super(nome, valorUnitario, ativo, categoria, identificador);
        this.voltagem = voltagem;
        this.marca = marca;
    }
}
