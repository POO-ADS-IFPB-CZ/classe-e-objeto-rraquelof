public class Lampada {
    private int potencia;
    private String marca;
    private int quantidade;
    private double preco;
    private boolean aceso;

    public Lampada(int potencia, String marca, int quantidade, double preco, boolean aceso) {
        this.potencia = potencia;
        this.marca = marca;
        this.quantidade = quantidade;
        this.preco = preco;
        this.aceso = aceso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isAceso(){
        return aceso;
    }

    public void acende(){
        if(isAceso()){
            System.out.println("A lâmpada já está acesa!");
        }else{
            aceso = true;
            System.out.println("Você acendeu a lâmpada!");
        }
    }

    public void apaga(){
        if (isAceso()) {
            aceso = false;
            System.out.println("Você apagou a lâmpada!");
        }else{
            System.out.println("A lâmpada já está apagada!");
        }
    }

}