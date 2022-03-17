package atividade4.entidades;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, int idade, Double salario) {
        super(nome, idade, salario);
    }

    @Override
    public Double bonificacao() {
        return super.bonificacao()+3000.00;
    }
}
