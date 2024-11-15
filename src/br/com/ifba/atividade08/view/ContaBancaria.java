package br.com.ifba.atividade08.view;

public class ContaBancaria {
    //Atributos
    public int numeroConta;
    protected String tipoConta;
    private String donoConta;
    private float saldoConta;
    private boolean statusConta;
    
    //Métodos personalizados
    public void estadoAtualConta(){//Exibe o status atual da conta e de seus atributos.
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Dono: " + this.getDonoConta());
        System.out.println("Saldo: " + this.getSaldoConta());
        System.out.println("Status: " + this.getStatusConta());
    }
    
    public void abrirConta(String tc){//Abre uma nova conta.
        this.setTipoConta(tc);
        this.setStatusConta(true);
        
        if("CC".equals(tc)){//Se for conta do tipo corrente, o saldo inicial é RS 50.
            this.setSaldoConta(50);
        }else if("CP".equals(tc)){//Se for conta do tipo poupança, o saldo inicial é R$ 150.
            this.setSaldoConta(150);
        }
        
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){//Fecha uma conta específica, desde que não haja dinheiro e nem débito pendente nela.
        if(this.getSaldoConta() > 0){//Se o saldo da conta for maior do que R$ 0, não será possível fechá-la.
            System.out.println("Conta não pode ser fechada. Ainda há dinheiro nela");
        }else if(this.getSaldoConta() < 0){//Se o saldo da conta for menor do que R$ 0, também não será possível fechá-la, por haver débito pendente.
            System.out.println("Conta não pode ser fechada. Há debito pendente");
        }else{
            this.setStatusConta(false);//Se a conta não tiver dinheiro e nem débito pendente, será fechada com sucesso.
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){//Deposita dinheiro em uma conta, desde que ela esteja aberta.
        if(this.getStatusConta()){//Se o status da conta for "true" (aberta), o depósito do valor informado será realizado com sucesso.
            this.setSaldoConta(this.getSaldoConta() + v);
            System.out.println("Deposito realizado na conta de " + this.getDonoConta());
        }else{//Caso o status da conta seja "false" (fechada), o depósito não será realizado.
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    
    public void sacar(float v){//Retira dinheiro de uma conta, desde que haja saldo suficiente para o valor informado a ser sacado e a conta esteja aberta.
        if(this.getStatusConta()){//Se o status da conta for "true" e o saldo for maior ou igual ao valor informado para saque, a retirada do dinheiro será realizada com sucesso.
            if(this.getSaldoConta() >= v){
                this.setSaldoConta(this.getSaldoConta() - v);
                System.out.println("Saque realizado na conta de " + this.getDonoConta());
            }else{//Se o saldo da conta for inferior ao valor informado para saque, não será possível sacar.
                System.out.println("Saldo insuficiente para saque!");
            }
        }else{//Se a conta estiver fechada (status "false"), não será possível sacar.
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensalidade(){//Paga mensalidade para manter a conta aberta (o valor depende do tipo de conta), desde que a conta esteja aberta.
        int v = 0;
        
        if("CC".equals(this.getTipoConta())){//Se a conta for do tipo corrente ("CC"), o valor a ser pago por mês será de R$ 12.
            v = 12;
        }else if("CP".equals(this.getTipoConta())){//Se a conta for do tipo poupança ("CP"), o valor a ser pago por mês será de R$ 20.
            v = 20;
        }
        
        if(this.statusConta){//Se o status da conta for "true" (conta aberta), o valor da mensalidade será pago descontando do saldo atual.
            this.setSaldoConta(this.getSaldoConta() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDonoConta());
        }else{//Se o status da conta for "false" (conta fechada), o valor da mensalidade não será pago.
            System.out.println("Impossível pagar por uma conta fechada!");
        }
    }
    
    //Método construtor
    public ContaBancaria() {
        this.saldoConta = 0;
        this.statusConta = false;
    } 

    //Métodos getters e setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
}
