package singleton_java;

public class Test {
    public static void main(String[] args) {
        //SIMPLIFICADO - Chamando a instancia, tentando reatribuir o valor e verificando se ele retorna o mesmo valor.
        SingletonSimplificado teste = SingletonSimplificado.getInstancia();
        System.out.println("Endereço de memória: " + teste);

        teste = SingletonSimplificado.getInstancia();
        System.out.println("Endereço de memória: " + teste);

        System.out.println("\n ---------------------- \n");
        //APRESSADO - Chamando a instancia, tentando reatribuir o valor e verificando se ele retorna o mesmo valor.
        SingletonApressado teste1 = SingletonApressado.getInstancia();
        System.out.println("Endereço de memória: " + teste1);

        teste1 = SingletonApressado.getInstancia();
        System.out.println("Endereço de memória: " + teste1);

        System.out.println("\n ---------------------- \n");
        //HOLDER - Chamando a instancia, tentando reatribuir o valor e verificando se ele retorna o mesmo valor.
        SingletonHolder teste2 = SingletonHolder.getInstancia();
        System.out.println("Endereço de memória: " + teste2);

        teste2 = SingletonHolder.getInstancia();
        System.out.println("Endereço de memória: " + teste2);


    }
}