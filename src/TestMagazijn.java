
/**
 * class TestMagazijn - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class TestMagazijn
{
    public void demo() {
        Magazijn m = new Magazijn();
        m.setPostcode(2800);
        m.voegToe(new Product("peren", 3, 5));
        m.voegToe(new Product("appelen", 17, 3));
        m.voegToe(new Product("bananen", 17, 2));
        m.voegToe(new Product("granaatappel", 0, 8.2));
        System.out.println("***voor de prijsverhoging***");
        System.out.println();
        System.out.println(m);
        System.out.println();
        m.verhoogPrijs(50);
        System.out.println("***na de prijsverhoging***");
        System.out.println();
        System.out.println(m);
        System.out.println();
        m.toonLijstAanTeVullen(5);
        System.out.println();
        System.out.println("Product met nan : " + m.zoekProduct("nan"));
        System.out.println("Product met nin : " + m.zoekProduct("nin"));
        System.out.println();
        System.out.println("Product bananan : " + m.isProduct("bananan"));
        System.out.println();
        System.out.println(m.verwijderProductenZonderVoorraad() + " producten verwijderd");
        System.out.println();
        System.out.println(m);
    }
}
