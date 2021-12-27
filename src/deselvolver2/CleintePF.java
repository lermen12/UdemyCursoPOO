package deselvolver2;

public class CleintePF  extends Cliente{
    public CleintePF(String nome, String endereco) {
        super(nome, endereco);
    }
    private String cpf;

    public CleintePF(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
