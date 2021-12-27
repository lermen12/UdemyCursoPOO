package deselvolver2;

import java.util.Scanner;

public class ClienteApp {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Você é pessoa PF ou PJ?");
        String clienteResp = scanIn.nextLine();
        if (clienteResp.equals("PJ") || clienteResp.equals("pj")){
            System.out.println("Digite o CNPJ, endereço e nome:");
            String c2 = scanIn.nextLine();
            String e2 = scanIn.nextLine();
            String n2 = scanIn.nextLine();

            CleintePJ clientepj1 = new CleintePJ(n2,e2, c2);

            System.out.println("CNPJ : "+ clientepj1.getCnpj() + " Endereço: "+ clientepj1.getEndereco()+
                    " Nome: "+ clientepj1.getNome());

        }else {
            System.out.println("Digite o CPF, endereço e nome:");
            String c1 = scanIn.nextLine();
            String n1 = scanIn.nextLine();
            String e1 = scanIn.nextLine();

            CleintePF clientepf1 = new CleintePF(n1, e1, c1);

            System.out.println("Cpf: " + clientepf1.getCpf() + " Endereço: "+ clientepf1.getEndereco()
            + " Nome: "+ clientepf1.getNome());

        }









        




    }
}
