package strategy_java;

public class ComportamentoNormal implements Comportamento {
    int velocidadeRobo = Robo.getVelocidade();
    int forcaRobo = Robo.getForca();

    @Override
    public void mover() {
        System.out.println("O robô está se movendo normalmente");
        System.out.println("Velocidade: " + velocidadeRobo);
        System.out.println("Força: " + forcaRobo);
    }

}
