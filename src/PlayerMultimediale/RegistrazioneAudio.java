package PlayerMultimediale;

public class RegistrazioneAudio extends ElementoMultimediale implements Play{
    private int volume;
    private int durata;

    public RegistrazioneAudio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int alzaVolume(){
        if (getVolume() < 10) {
            int nuovoVolume = getVolume() + 2;
            setVolume(nuovoVolume);
        }
        return getVolume();
    };
    public int abbassaVolume(){
        if (getVolume() > 0) {
            int nuovoVolume = getVolume() - 2;
            setVolume(nuovoVolume);
        }
        return getVolume();
    };

    @Override
    public void play() {
for(int i=0; i<durata; i++){
    String volumeCorrente = "!".repeat(volume);
    System.out.println(getTitolo()+" "+ volumeCorrente);
}

    }
    @Override
    public void esegui() {
        play();
    }

}
