public class SistemaMedidaSwitchCase {
    public static void main(String[] args) {
        String tamanho = "M";

        switch (tamanho) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MEDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;    
        
            default:
                break;
        }
    }
}
