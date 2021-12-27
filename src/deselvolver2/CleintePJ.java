package deselvolver2;

public class CleintePJ extends Cliente{
    public CleintePJ(String nome, String endereco) {
        super(nome, endereco);
    }

    private String cnpj;

    public CleintePJ(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj=cnpj;

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
