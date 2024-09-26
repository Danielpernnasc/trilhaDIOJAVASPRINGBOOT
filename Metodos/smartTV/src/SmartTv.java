
public class SmartTv {
    boolean ligada = false;
    String estado = "Televisão Desligada";
    String[] canal = { "Cultura", "SBT", "Globo", "Record", "Manchete", "Gazeta", "Band" };
    String canalAtual = canal[0];
    int volume = 10;
    boolean volumeIncreasing = false;

    public void ligar() {
        ligada = true;
        estado = "TV Ligada";
    }

    public void desligar() {
        ligada = false;
        estado = "TV Desligada";
    }

    public void aumentarVolume() {
        // if (volumeIncreasing) {
        // volume++;
        // System.out.println("Aumentando o Volume : " + volume);
        // }
        volume++;
        System.out.println("Aumentando o Volume : " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o Volume : " + volume);
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal >= 0 && novoCanal < canal.length) {
            canalAtual = canal[novoCanal];
            System.out.println("Canal Atual : " + canalAtual);
        } else {
            System.out.println("Canal Inválido");
        }

    }
    // public void aumentarVolume(int increment) {
    // volume += increment;
    // }

    // public void startVolumeIncrease() {
    // volumeIncreasing = true;
    // while (volumeIncreasing && volume < 100) { // assuming 100 is the maximum
    // volume
    // aumentarVolume();
    // try {
    // Thread.sleep(1000); // pause for 1 second
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // }
    // }

    // public void stopVolumeIncrease() {

    // volumeIncreasing = false;
    // }

}