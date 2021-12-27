package desenvolver;

public class PessoaApp {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1,"Lucas");
        Pessoa pessoa2 = new Pessoa(2,"Denner");

        System.out.println("O nome do objeto pessoa 1 é: " + pessoa1.getNome());

        pessoa1.setNome("Lucas Lindo!!");

        System.out.println("O nome do objeto pessoa 1 é: " + pessoa1.getNome());

    }
}
