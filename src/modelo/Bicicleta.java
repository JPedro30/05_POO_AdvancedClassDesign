package modelo;

public class Bicicleta {

    private int numMarchas;
    private int diametroRuedas;

    public Bicicleta() {
    }

    public Bicicleta(int numMarchas, int diametroRuedas) {
        this.setNumMarchas(numMarchas);
        this.setDiametroRuedas(diametroRuedas);
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public int getDiametroRuedas() {
        return diametroRuedas;
    }

    public void setDiametroRuedas(int diametroRuedas) {
        this.diametroRuedas = diametroRuedas;
    }

    @Override
    public String toString() {
        return "Bicicleta [numMarchas=" + numMarchas + ", diametroRuedas=" + diametroRuedas + "]";
    }

    

}
