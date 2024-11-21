package br.com.ifba.atividade10.view;

public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Método especial
    public String detalhes() {//Mostra os detalhes do livro.
        return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor + "\n, totalPaginas=" + totalPaginas + "\n, paginaAtual=" + paginaAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + "\n, idade=" + leitor.getIdade() + "\n, sexo=" + leitor.getSexo() +'}';
    }
    
    //Construtor
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }
    
    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Métodos abstratos
    @Override
    public void abrir() {//Abre o livro.
        this.aberto = true;
    }

    @Override
    public void fechar() {//Fecha o livro.
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {//Avança até uma determinada página.
        if(p > this.totalPaginas){
            this.paginaAtual = 0;
        }else{
            this.paginaAtual = p;
        }
    }

    @Override
    public void avancarPagina() {//Avança para a próxima página.
        this.paginaAtual++;
    }

    @Override
    public void voltarPagina() {//Volta para a página anterior.
        this.paginaAtual--;
    }
}
