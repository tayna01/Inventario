package model;

import enums.Categoria;

public class ItemEletronico extends ItemInventario<String>{
    private String voltagem;
    private String marca;

    public ItemEletronico(String nome, double valorUnitario, boolean ativo, Categoria categoria, String identificador, String voltagem, String marca) {
        super(nome, valorUnitario, ativo, categoria, identificador);
        this.voltagem = voltagem;
        this.marca = marca;
    }

    @Override
    public double calcularValorTotal(int quantidade){
        return getValorUnitario() * quantidade;
    }

    @Override
    public String gerarDescricaoDetalhada() {
        return "Item Eletrônico: " + getNome() +
                ", Marca: " + marca +
                ", Voltagem: " + voltagem +
                ", Valor Unitário: R$" + getValorUnitario();
    }

    //Getters e Setters
    public String getVoltagem(){
        return voltagem;
    }

    public void setVoltagem(String voltagem){
        this.voltagem = voltagem;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
}
