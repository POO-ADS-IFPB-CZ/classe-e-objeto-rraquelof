public class ContaBancariaSimplificada {
    String nomeCorrentista;
    float saldo;
    boolean contaEspecial;

    void abreContaSimples (String nome){
        nomeCorrentista = nome;
        saldo = 0;
        contaEspecial = false;
    }

    void deposita (float valor) {
        saldo = saldo + valor;
    }

    boolean retira (float valor){
        if (contaEspecial==false){
            if (valor <= saldo){
                saldo = saldo - valor;
                return true;
            }else{
                return false;
            }
        }
        else{
            saldo = saldo - valor;
            return true;
        }
    }

    void mostraDados (){
        System.out.println ("\nO nome do correntista é "+nomeCorrentista);
        System.out.println ("O saldo é " + saldo);
        if (contaEspecial)
            System.out.println ("A conta é especial.");
        else
            System.out.println ("A conta é comum.");
    }

    boolean trasfere(ContaBancariaSimplificada conta1, ContaBancariaSimplificada conta2, float valor){
        if (conta1.retira(valor)) {
            conta2.deposita(valor);
            return true;
        }
        return false;
    }
}
