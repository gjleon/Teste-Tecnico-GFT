package atividade3.entidades;

import java.util.Dictionary;

public class Livro {
    private String nome;
    private int qtdPaginas;
    private int paginasLidas;

    public Livro(String nome, int qtdPaginas) {
        this.nome = nome;
        this.qtdPaginas = qtdPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public Double verificarProgresso(){
        return  (paginasLidas/(qtdPaginas * 1.00))*100.00;
    }
    public int adicionarPaginasLidas(int paginasLidas){
         this.paginasLidas += paginasLidas ;
        return this.paginasLidas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", qtdPaginas=" + qtdPaginas +
                ", paginasLidas=" + paginasLidas +
                '}';
    }
}
