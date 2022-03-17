package atividade4.entidades;

public class Gerente extends Funcionario{

    public Gerente(String nome, int idade, Double salario) {
        super(nome, idade, salario);
    }

    @Override
    public Double bonificacao() {
        return super.bonificacao()+10000.00;
    }
}
