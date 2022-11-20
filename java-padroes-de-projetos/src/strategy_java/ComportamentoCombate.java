package strategy_java;

public class ComportamentoCombate implements Comportamento {
    int velocidadeRobo = Robo.getVelocidade();
    int forcaRobo = Robo.getForca();

    @Override
    public void mover() {
        System.out.println("O robô está se movendo no modo de combate");
        velocidadeRobo += 10;
        forcaRobo += 15;
        System.out.println("Velocidade: " + velocidadeRobo);
        System.out.println("Força: " + forcaRobo);
    }

}
