package atividade4.entidades;

public class Funcionario {
    protected String nome;
    protected int idade;
    protected Double salario;

    public Funcionario(String nome, int idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public Double bonificacao(){
        return salario;
    }
}
