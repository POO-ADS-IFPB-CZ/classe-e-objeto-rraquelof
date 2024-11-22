public class Main {
    public static void main(String[] args){
        ContaBancariaSimplificada conta = new ContaBancariaSimplificada();
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada();
        System.out.print("CONTA 1:");
        conta.abreContaSimples("Zé");
        conta.deposita(200);
        conta.retira(10);
        conta.mostraDados();

        System.out.print("\nCONTA2:");
        conta2.abreContaSimples("Fred");
        conta2.mostraDados();

        System.out.print("\nTRANSFERINDO");
        conta.trasfere(conta, conta2, 100);
        System.out.println("\nSaldo conta1: "+conta.saldo);
        System.out.println("Saldo conta2: "+conta2.saldo);

    }
}
