
public class HelloWorld {
    public static final void main(String[] args) {
        System.out.println("Oi Fulano. Qual o seu nome?");
        String nome = System.console().readLine();
        System.out.println("Oi " + nome + ", qual a sua idade?");
        int idade = Integer.parseInt(System.console().readLine());
        boolean maiorDe18 = 18 - idade < 0;
        if(maiorDe18) {
            System.out.println("Vc tem mais que 18 anos");
        } else {
            System.out.println("oi " + nome + " faltam " + (18 - idade) + " para completar 18 anos");
        }


    }
}