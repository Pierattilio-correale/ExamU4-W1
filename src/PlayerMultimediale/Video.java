package PlayerMultimediale;

public class Video extends ElementoMultimediale implements Play{
    private int volume;
    private int luminosita;
    private int durata;

    public Video(String titolo, int volume, int luminosita,int durata) {
        super(titolo);
        this.volume = volume;
        this.luminosita = luminosita;
        this.durata= durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
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
    }
    public int alzaLuminosita(){
        if (getLuminosita() < 10) {
            int nuovaLuminosita = getLuminosita() + 2;
            setLuminosita(nuovaLuminosita);
        }
        return getLuminosita();
    };
    public int abbassaLuminosita(){
        if (getLuminosita() > 0) {
            int nuovaLuminosita = getLuminosita() - 2;
            setLuminosita(nuovaLuminosita);
        }
        return getLuminosita();
    };



    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            String volumeCorrente = "!".repeat(volume);
            String luminositaCorrente = "*".repeat(luminosita);
            System.out.println(getTitolo() + " " + volumeCorrente + " "+luminositaCorrente);
        }


    }
    @Override
    public void esegui() {
play();
    }

}
