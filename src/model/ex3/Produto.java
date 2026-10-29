package model.ex3;

public class Produto{
    public String nome;
    public double preco;
    public int quantidade_estoque;

    public Produto(String nome){
        this.nome = nome;
    }
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(String nome, double preco,int quantidade_estoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidade_estoque = quantidade_estoque;
    }
    
    @Override
    public String toString(){

        if(this.quantidade_estoque != 0){
            return "Nome: "+ nome + "\nPreco: " + preco + "\nQuantidade em estoque: " + quantidade_estoque;
        }else if (this.preco != 0) {
            return "Nome: "+ nome + "\nPreco: " + preco; 
        }else{
            return "Nome: "+ nome;
        }

    }

}