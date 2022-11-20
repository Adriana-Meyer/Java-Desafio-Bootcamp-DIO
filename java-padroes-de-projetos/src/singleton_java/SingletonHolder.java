package singleton_java;

public class SingletonHolder {

    //Encapsula essa instancia em uma classe estática interna
    private static class Holder {
        public static SingletonHolder instancia = new SingletonHolder();
    }

    private SingletonHolder() {
        super();
    }

    //metodo para que outras classes possam "chamar" essa instancia

    public static SingletonHolder getInstancia() {
        return Holder.instancia;
    }
}
