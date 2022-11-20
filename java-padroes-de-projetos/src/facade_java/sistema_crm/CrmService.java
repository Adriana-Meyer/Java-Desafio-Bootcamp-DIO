package facade_java.sistema_crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema com sucesso: ");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade + "/" + estado);

    }
}
