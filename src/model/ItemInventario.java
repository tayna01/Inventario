package model;

import enums.Categoria;

public abstract class ItemInventario<T> {
    private String nome;
    private double valorUnitario;
    private boolean ativo;
    private Categoria categoria;
    private T identificador;

    public ItemInventario(String nome, double valorUnitario, boolean ativo, Categoria categoria, T identificador) {
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.ativo = ativo;
        this.categoria = categoria;
        this.identificador = identificador;
    }

    // classes abstratas devem ser implementadas nas subclasses
    public abstract double calcularValorTotal(int quantidade);

    public abstract String gerarDescricaoDetalhada();

    //Métodos concetros

    public void ativar(){
        ativo = true;
    }

    public void desativar(){
        ativo = false;
    }

    public boolean isAtivo(){
        return ativo;
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getValorUnitario(){
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario){
        this.valorUnitario = valorUnitario;
    }

    public boolean getAtivo(){
        return ativo;
    }

    public void setAtivo(boolean ativo){
       this.ativo = ativo;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public T getIdentificador(){
        return identificador;
    }

    public void setIdentificador(T identificador){
        this.identificador = identificador;
    }
}
