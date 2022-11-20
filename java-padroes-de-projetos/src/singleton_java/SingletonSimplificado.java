package singleton_java;

public class SingletonSimplificado {

    private static SingletonSimplificado instancia;

    private SingletonSimplificado() {
      super();
    }

    //metodo para que outras classes possam "chamar" essa instancia

    public static SingletonSimplificado getInstancia() {
        if (instancia == null) {
            instancia = new SingletonSimplificado();
        }
        return instancia;
    }
}
