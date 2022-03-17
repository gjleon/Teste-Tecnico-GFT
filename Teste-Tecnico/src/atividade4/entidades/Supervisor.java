package atividade4.entidades;

public class Supervisor extends Funcionario{
    public Supervisor(String nome, int idade, Double salario) {
        super(nome, idade, salario);
    }

    @Override
    public Double bonificacao() {
        return super.bonificacao()+ 5000.00;
    }
}
