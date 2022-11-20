import facade_java.Facade;
import singleton_java.*;
import strategy_java.*;

public class Test {
    public static void main(String[] args) {

        //SINGLETON

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
        System.out.println("\n ---------------------- \n");

        //STRATEGY

        Comportamento normal = new ComportamentoNormal();
        Comportamento defesa = new ComportamentoDefensivo();
        Comportamento combate = new ComportamentoCombate();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();

        System.out.println("\n ---------------------- \n");
        robo.setStrategy(defesa);
        robo.mover();
        robo.mover();

        System.out.println("\n ---------------------- \n");
        robo.setStrategy(combate);
        robo.mover();
        robo.mover();
        robo.mover();

        System.out.println("\n ---------------------- \n");

        //FACADE

        Facade facade = new Facade();
        facade.migrarCliente("Adriana", "03387-015");

    }
}