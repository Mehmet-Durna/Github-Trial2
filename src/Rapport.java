import java.util.ArrayList;

/**
 * class Rapport - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Rapport
{
    private Leerling leerling;
    private ArrayList<Vak> vakken;

    public Rapport(Leerling leerling) {
        this.leerling = leerling;
        vakken = new ArrayList<>();
    }

    public void voegtoe(Vak vak) {
        vakken.add(vak);
    }

    public String toString() {
        String ret = "Dit is het rapport van " + leerling.getNaam() + ", van de klas " + leerling.getKlas() + "\n";
        double gemiddelde = 0;
        for (Vak vak : vakken) {
            ret += "  behaalde voor " + vak.toString() + "\n";
            gemiddelde += vak.getCijfer();
        }
        gemiddelde = gemiddelde/vakken.size();
        ret += "het gemiddelde van de vakken is: " + gemiddelde + "\n";
        int erboven = 0;
        int eronder = 0;
        for (Vak vak : vakken) {
            if (vak.getCijfer()>gemiddelde) erboven++;
            if (vak.getCijfer()<gemiddelde) eronder++;
        }
        ret += "aantal vakken bovengemiddeld: " + erboven + "\n";
        ret += "aantal vakken ondergemiddeld: " + eronder + "\n";
        ret += "aantal vakken op gemiddeld: " + (vakken.size() - eronder - erboven) + "\n";
        return ret;
    }
}
