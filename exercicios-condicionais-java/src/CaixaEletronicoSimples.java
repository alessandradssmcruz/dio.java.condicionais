public class CaixaEletronicoSimples {
    public static void main(String[] args) {
        double saque = 25.00;
        double saldo = 20.00;

        if(saque<saldo)
            saldo = saldo -saque;
            
        System.out.println(saldo);
    }
}
