import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Produkt {
    private static final Logger logger = LogManager.getLogger(Produkt.class);


    protected String bezeichnung;
    protected int qualität;
    protected int stichtag;
    protected double grundpreis;

    public Produkt(String bezeichnung, int qualität, int stichtag, double grundpreis) {
        this.bezeichnung = bezeichnung;
        this.qualität = qualität;
        this.stichtag = stichtag;
        this.grundpreis = grundpreis;
    }

    public double berechnePreis() {
        return grundpreis + 0.1 * qualität;
    }

    public void aktualiesiereQualität(){

    }

    public boolean abgelaufen(){

        return false;
    }


    public void info() {
        logger.info(String.format("%s – Qualität: %d – Preis: %.2f €", bezeichnung, qualität, berechnePreis()));
    }
}
