package br.com.ifba.atividade10.view;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];//Vetor de pessoas.
        Livro[] l = new Livro[3];//Vetor de livros.
    
        p[0] = new Pessoa("João", 25, "M");//Pessoa 1.
        p[1] = new Pessoa("Maria", 20, "F");//Pessoa 2.
    
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);//Livro 1.
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);//Livro 2.
        l[2] = new Livro("Java Avançado", "Maria Cândido", 800, p[0]);//Livro 3.
        
        l[0].abrir();//Abre o livro 1.
        l[0].folhear(200);//Folheia o livro 1 até a página 200.
        l[0].avancarPagina();//Avança uma página, indo para a 201.
        //l[0].folhear(400);//Tentar folhear para uma página que não existe no livro irá para a página 0.
        System.out.println(l[0].detalhes());//Exibe detalhes do livro 1, lido por João.
        
        System.out.println(l[1].detalhes());//Exibe detalhes do livro 2, lido por Maria.
    }
}
