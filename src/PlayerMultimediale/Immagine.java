package PlayerMultimediale;

public class Immagine extends ElementoMultimediale implements Show {
    private int luminosita;
    private int visualizzazione;

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public Immagine(String titolo, int luminosita, int visualizzazione) {
        super(titolo);
        this.luminosita = luminosita;
        this.visualizzazione= visualizzazione;
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

    public void show() {
for(int i=0; i<visualizzazione;i++){
    String luminos= "*".repeat(luminosita);
    System.out.println(getTitolo()+" "+luminos);
}
    }
    @Override
    public void esegui() {
        show();
    }

}
