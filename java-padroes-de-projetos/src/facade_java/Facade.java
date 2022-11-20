package facade_java;

import facade_java.sistema_cep.CepApi;
import facade_java.sistema_crm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade , estado);

    }
}
