public class Main{   
    
    public static void main(String[] args){
        Cliente Gustavo = new Cliente();
        Gustavo.setNome("Gustavo");



        Conta cc = new ContaCorrente(Gustavo);
        Conta cp = new ContaPoupanca(Gustavo);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}