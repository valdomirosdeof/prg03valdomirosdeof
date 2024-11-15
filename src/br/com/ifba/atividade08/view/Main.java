package br.com.ifba.atividade08.view;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.setNumeroConta(1);
        c1.setDonoConta("Jubileu");//Tipo "null" e saldo de R$ 0,00 antes de abrir.
        c1.abrirConta("CC");//Tipo "CC (Conta corrente)" e saldo de R$ 50 após abrir uma conta corrente".
        
        ContaBancaria c2 = new ContaBancaria();
        c2.setNumeroConta(2);
        c2.setDonoConta("Creuza");
        c2.abrirConta("CP");//Tipo "CP (Conta corrente)" e saldo de R$ 150 após abrir uma conta poupança;
        
        c1.depositar(100);//A conta do Jubileu passará a ter R$ 150 de saldo;
        c2.depositar(500);//A conta da Creuza passará a ter R$ 650 de saldo;
        
        c2.sacar(100);//A conta da Creuza passará a ter R$ 550 de saldo.
        //c2.sacar(1000);//O saque não será possível, pois o valor é maior que o contido na conta da Creuza.
        
        c1.fecharConta();//Não será possível fechar a conta se houver dinheiro nela. É necessário retirar todo o dinheiro dela para poder fechá-la, ou seja, nesse caso o Jubileu deve sacar todos os R$ 150.
        //c1.sacar(150);//A conta do Jubileu poderá ser fechada após sacar todo o dinheiro contido nela.
        
        //Estado atual "false" antes de abrir, "true" após abrir e "false" após fechar a conta (Do Jubileu). 
        c1.estadoAtualConta();
        c2.estadoAtualConta();
    }
}
