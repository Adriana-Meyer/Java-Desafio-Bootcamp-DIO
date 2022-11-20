package strategy_java;

public class ComportamentoDefensivo implements Comportamento {
    int velocidadeRobo = Robo.getVelocidade();
    int forcaRobo = Robo.getForca();

    @Override
    public void mover() {
        System.out.println("O robô está se movendo de maneira defensiva");
        velocidadeRobo += 25;
        forcaRobo += 3;
        System.out.println("Velocidade: " + velocidadeRobo);
        System.out.println("Força: " + forcaRobo);
    }

}
