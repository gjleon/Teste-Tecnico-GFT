package atividade3.aplicacao;

import atividade3.entidades.Leitor;
import atividade3.entidades.Livro;

public class Main {
    public static void main(String[] args) {
        Livro java = new Livro("Java",100 );
        Livro c = new Livro("C",100 );
        Leitor leitor = new Leitor("Gabriel",java);
        leitor.adicionarLivro(c);
        for (Livro a : leitor.getEstanteLivros()) {
            System.out.println(a);

        }
        leitor.removerLivro(c);
        System.out.println("-----------------------------");
        for (Livro a : leitor.getEstanteLivros()) {
            System.out.println(a);

        }
        System.out.println("----------------");
        java.adicionarPaginasLidas(25);
        System.out.println(java.getPaginasLidas());
        System.out.println("----------------");
        System.out.printf("%.0f%%",java.verificarProgresso());;

    }
}
