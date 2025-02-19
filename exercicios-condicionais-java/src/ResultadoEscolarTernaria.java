public class ResultadoEscolarTernaria {
    public static void main(String[] args) {
        int nota = 7;

        String resultado = nota>=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        nota=6;
        String resultado2 = nota>=7 ? "Aprovado" : nota<7 && nota>=5 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);
    }
}
