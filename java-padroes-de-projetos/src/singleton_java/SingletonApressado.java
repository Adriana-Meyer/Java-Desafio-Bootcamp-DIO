package singleton_java;

public class SingletonApressado {

    //Cria a variável instancia e já realiza a atribuição, criando uma instancia dele mesmo
    private static SingletonApressado instancia = new SingletonApressado();

    private SingletonApressado() {
        super();
    }

    //metodo para que outras classes possam "chamar" essa instancia

    public static SingletonApressado getInstancia() {
       return instancia;
    }

}
