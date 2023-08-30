package app;

public class Test5 {
    public static void main(String [] args) { 

        String primeiroNome = "Sarah";
        String segundoNome = "Mota";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Nome Completo: " + primeiroNome.concat(" ").concat(segundoNome);
 
}       

}
