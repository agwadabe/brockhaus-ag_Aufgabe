public class Kaese extends Produkt{

    public Kaese(String bezeichnung, int qualität, int stichtag, double grundpreis) {
        super(bezeichnung, qualität, stichtag, grundpreis);
    }

    @Override
    public void aktualiesiereQualität() {
        qualität--;
        stichtag--;
    }

    @Override
    public boolean abgelaufen() {
        return qualität <= 30 || stichtag <= 0;
    }

    @Override
    public double berechnePreis() {
        return grundpreis + 0.1 * qualität;
    }
}
