
/**
 * class Product - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Product
{
    private String omschrijving;
    private int aantalInVoorraad;
    private double prijs;

    public Product(String omschrijving, int aantal, double prijs) {
        this.omschrijving = omschrijving;
        this.aantalInVoorraad = aantal;
        this.prijs = prijs;
    }

    public String getOmschrijving() {
        return this.omschrijving;
    }

    public int getAantalInVoorraad() {
        return this.aantalInVoorraad;
    }

    public double getPrijs() {
        return this.prijs;
    }

    public boolean verhoogPrijs(int percentage) {
        if (percentage<-50 || percentage>100) {
            return false;
        }
        this.prijs = this.prijs * (1 + 1.0 * percentage/100);
        return true;
    }

    public String toString() {
        return this.omschrijving + ", " + this.aantalInVoorraad + " kosten " + this.prijs + " €";
    }
}
