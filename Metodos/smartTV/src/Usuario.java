public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada);
        System.out.println("TV Ligada ? " + smartTv.estado);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status da TV : " + smartTv.estado);
        smartTv.desligar();
        System.out.println("Novo Status da TV : " + smartTv.estado);

        // for (int i = 0; i <= 100; i++) {
        // smartTv.aumentarVolume(1);
        // System.out.println("Aumentando o Volume : " + smartTv.volume);
        // }
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        // smartTv.startVolumeIncrease();

        // smartTv.stopVolumeIncrease();

        smartTv.mudarCanal(2);

    }
}
