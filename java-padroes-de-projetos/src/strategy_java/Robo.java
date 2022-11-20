package strategy_java;

public class Robo {
    private Comportamento strategy;
    private static int velocidade = 5;
    private static int forca = 5;

    public static int getVelocidade() {
        return velocidade;
    }

    public static int getForca() {
        return forca;
    }

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    public void mover() {
        strategy.mover();
    }
}
