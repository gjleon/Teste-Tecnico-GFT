package atividade4.aplicacao;

import atividade4.entidades.Gerente;
import atividade4.entidades.Supervisor;
import atividade4.entidades.Vendedor;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gabriel",24, 1000.00);
        Supervisor supervisor = new Supervisor("jonas",24, 1000.00);
        Vendedor vendedor = new Vendedor("Paulo",24, 1000.00);

        System.out.println(gerente.bonificacao());
        System.out.println(supervisor.bonificacao());
        System.out.println(vendedor.bonificacao());
    }
}
