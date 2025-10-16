public class Wein extends Produkt {

    private int tageSeitStichtag = 0;

    public Wein(String bezeichnung, int qualität, int stichtag, double grundpreis) {
        super(bezeichnung, qualität, stichtag, grundpreis);
    }

    @Override
    public void aktualiesiereQualität() {
        stichtag--;

        if (stichtag <= 0) {
            tageSeitStichtag ++;

            if (tageSeitStichtag == 10 && qualität < 50) {
                qualität++;
                tageSeitStichtag = 0;

            }
        }
    }

    @Override
    public boolean abgelaufen() {
        return false;
    }

    @Override
    public double berechnePreis() {
        return grundpreis + 0.1 * qualität;
    }
}
