package tree;
import java.util.TreeSet;

public class ExempleTreeSet {
    public static void main(String[] args) {
        // Création d'un TreeSet pour stocker des noms de fruits
        TreeSet<String> ensemble = new TreeSet<>();

        // Ajout d'éléments au TreeSet
        ensemble.add("Pomme");
        ensemble.add("Banane");
        ensemble.add("Orange");
        ensemble.add("Araise");
        ensemble.add("Braise");
        ensemble.add("Craise");


        // Affichage des éléments du TreeSet (triés par ordre naturel)
        System.out.println("Contenu du TreeSet : " + ensemble);

        // Tentative d'ajout d'un élément déjà présent (ne sera pas ajouté)
        boolean ajoutReussi = ensemble.add("Pomme");
        System.out.println("Ajout de Pomme encore : " + ajoutReussi);

        // Accès au premier et dernier éléments dans l'ordre naturel
        String premierElement = ensemble.first();
        String dernierElement = ensemble.last();
        System.out.println("Premier élément : " + premierElement);
        System.out.println("Dernier élément : " + dernierElement);

        // Suppression d'un élément du TreeSet
        ensemble.remove("Banane");
        System.out.println("Après suppression de Banane : " + ensemble);
    }
}
