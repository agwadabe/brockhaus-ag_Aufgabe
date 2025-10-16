import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {


        ArrayList<Produkt> produkte = new ArrayList<>();

        produkte.add(new Kaese("Mozarella", 70, 80, 5.0));
        produkte.add(new Kaese("Emmentaler", 50, 70, 6.0));
        produkte.add(new Wein("Merlot", 45, 20, 12.0));
        produkte.add(new Wein("Riesling", 42, 5, 10.0));

        for (int tag = 1; tag <= 120; tag++) {
            logger.info("=== Tag " + tag + " ===");

            ArrayList<Produkt> abgelaufeneProdukte = new ArrayList<>();

            for (Produkt p : produkte) {
                p.aktualiesiereQualität();

                if (p.abgelaufen()) {
                    logger.info("-> Produkt '" + p.bezeichnung + "' entfernt!");
                    abgelaufeneProdukte.add(p);
                } else {
                    p.info();
                }
            }

            produkte.removeAll(abgelaufeneProdukte);

            if (produkte.isEmpty()) {
                logger.info("Keine Produkte im Regal.");
                break;
            }
            
            logger.info(" ");
        }
    }
}
