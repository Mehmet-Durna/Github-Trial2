import java.util.ArrayList;
import java.util.Iterator;

/**
 * class Magazijn - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Magazijn
{
    private int postcode;
    private ArrayList<Product> producten;

    public Magazijn() {
        producten = new ArrayList<>();
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        if (postcode>999 && postcode<10000 && producten.size()==0) {
            this.postcode = postcode;
        }
    }

    private boolean isPostcodeValid() {
        if (postcode>999 && postcode<10000) {
            return true;
        }
        return false;
    }

    public boolean voegToe(Product product) {
        if (isPostcodeValid()) {
            producten.add(product);
            return true;
        }
        return false;
    }

    public void verhoogPrijs(int percentage) {
        for (Product product : producten) {
            product.verhoogPrijs(percentage);
        }
    }

    public String toString() {
        String ret = "Volgende producten zijn in voorraad in magazijn " + postcode + ":";
        for (Product product : producten) {
            ret += "\n  " + product.toString();
        }
        return ret;
    }

    public void toonLijstAanTeVullen(int minimum) {
        System.out.println("Deze producten moeten worden aangevuld:");
        for (Product product : producten) {
            if (product.getAantalInVoorraad()<minimum) {
                System.out.println("  " + product.getOmschrijving() + " : " + product.getAantalInVoorraad());
            }
        }
    }

    public boolean isProduct(String omschrijving) {
        for (Product product : producten) {
            if (product.getOmschrijving().equals(omschrijving)) {
                return true;
            }
        }
        return false;
    }

    public Product zoekProduct(String zoek) {
        for (Product product : producten) {
            if (product.getOmschrijving().contains(zoek)) {
                return product;
            }
        }
        return null;
    }

    public int verwijderProductenZonderVoorraad() {
        Iterator<Product> it = producten.iterator();
        int verwijderd = 0;
        while (it.hasNext()) {
            if (it.next().getAantalInVoorraad()==0) {
                it.remove();
                verwijderd++;
            }
        }
        return verwijderd;
    }
}
