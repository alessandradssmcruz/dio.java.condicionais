public class ResultadoEscolarEncadeado {
    public static void main(String[] args) {
        int nota = 6;

        if(nota>=7){
            System.out.println("Aprovado");
        } else if(nota<7 && nota>=5){
            System.out.println("Recuperação");
        } else if(nota<5) {
            System.out.println("Reprovado");
        }else{
            System.out.println("Valor desconhecido");
        }
    }
}
