package PlayerMultimediale;

abstract class ElementoMultimediale  {
    private String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public int alzaVolume() {
        return 0;
    }

    public int abbassaVolume() {
        return 0;
    }



    abstract void esegui();
}
